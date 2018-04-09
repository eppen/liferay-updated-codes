package journal.article.module.api;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.dynamic.data.mapping.annotations.DDMFormField;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalService;
import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.notifications.NotificationEvent;
import com.liferay.portal.kernel.notifications.NotificationEventFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.PermissionedModelLocalService;
import com.liferay.portal.kernel.service.ResourceLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserGroupRoleLocalService;
import com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    service = ModelListener.class
	)
public class ResourcePermissionModelListener  extends BaseModelListener<ResourcePermission> {

	
	@Override
	public void onAfterCreate(ResourcePermission model) throws ModelListenerException {
		// TODO Auto-generated method stub
		  try {
			  
			  String siteName = "Cholamandalam Investment and Finance";
			  
			  InetAddress ipAddr = InetAddress.getLocalHost();
			  
	           System.out.println("IP : "+ipAddr.getHostAddress());
	           
			  System.out.println("Inside onAfterCreate ResourcePermissionModelListener");
			  
			  long currentUserId=	PrincipalThreadLocal.getUserId();
			  
			  User currentUser=userLocalService.getUser(currentUserId);
			  
			  
			  
			  
			  long primKey=  model.getPrimKeyId();
			  
			  
			  
			  if(model.getName().equals(JournalArticle.class.getName()))
			  {
			  
				  System.out.println("primKey="+primKey);
				  JournalArticle article=   journalArticleLocalService.getLatestArticle(primKey);
				  
				  
				  
			  
			  String ddmStructureName = article.getDDMStructure().getName("en_US");
			  
			  Set<String> set1=article.getDDMStructure().getFieldNames();
			  
			  
			  System.out.println("article.getContent()="+article.getContent());
			  //article.get
			  
			  Document d=null;
			  try {
				d=SAXReaderUtil.read(article.getContent());
				
				
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  
			  for(String name:set1){
				  
				  
				  System.out.println("-----------------below new---------------------------");
				  System.out.println("name="+name+"|getFieldDataType="+article.getDDMStructure().getFieldDataType(name));
				  System.out.println("|getFieldType="+article.getDDMStructure().getFieldType(name));
				  
				  if(article.getDDMStructure().getFieldType(name).equalsIgnoreCase("ddm-documentlibrary")){
				  
				  Node fieldNode =d.selectSingleNode("/root/dynamic-element[@name='"+name+"']/dynamic-content");
				  System.out.println("probable value="+fieldNode.getText());
				  String[] values=fieldNode.getText().split("/");
				  
				  String groupId=values[2];
				  String folderid=values[3];
				  String uuid=values[5];
				  
				  if(uuid.indexOf("?")!=-1){
					  uuid=values[5].substring(0, values[5].indexOf("?"));
				  }
				  
				  //String groupId=value.substring(11, 11+(value.substring(11)).indexOf("/"));
				  //String groupId=value.substring(11, 11+(value.substring(11)).indexOf("/"));
				  
				  DLFileEntry fileEntry=  dlFileEntryLocalService.getDLFileEntryByUuidAndGroupId(uuid,Long.parseLong(groupId));
				  System.out.println("file name is ="+fileEntry.getFileName());
				  
				  
				  
				  
					//	  String[] actionsRW = new String[]{ActionKeys.VIEW, ActionKeys.UPDATE};
						//  long roleId = 0L; /* obtain a roleId here */
						  
						  resourcePermissionService.addResourcePermission(Long.parseLong(groupId), fileEntry.getCompanyId(), DLFileEntry.class.getName(), ResourceConstants.SCOPE_COMPANY, fileEntry.getPrimaryKey()+"", model.getRoleId(), ActionKeys.UPDATE);
						  //permissionLocalService.setRolePermissions(roleId, actionsRW, resourceId);
				  
				  //------------------------------
				  
				  //System.out.println("probable value="+fieldNode.getText().substring());
				  
				  /*
				  com.liferay.dynamic.data.mapping.model.DDMFormField ddmFormField= article.getDDMStructure().getDDMFormField(name);
				  Map<String,Object> map1=ddmFormField.getProperties();
				  Iterator<String> itr=map1.keySet().iterator();
				  while(itr.hasNext()){
					  
					  
					  System.out.println("name="+name+"|propertyname="+itr.next());
				  }
				  
				  
				  
				  Map<Locale,String> mapdetails =ddmFormField.getPredefinedValue().getValues();
				  Iterator<Entry<Locale,String>> itr1=mapdetails.entrySet().iterator();
				  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-start");
				  while(itr1.hasNext()){
					  Entry<Locale,String> e1=itr1.next();
					  System.out.println(">>"+e1.getKey().getDisplayCountry());
					  System.out.println(">>"+e1.getValue());
				  }
				  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>-ends");
				  */
				  
				  //ddmFormField.get
				 // dlFileEntryLocalService.g
				  
				  
				  
				  
				  
				  
				  /*
				  List<String> listOfChildren=article.getDDMStructure().getChildrenFieldNames(name);
				  System.out.println("------------------>>>>>>>>>>>>>>>>>>start");
				  for(String children:listOfChildren){
					  
					  System.out.println("name="+name+"|children="+children);
					  
				  }
				  System.out.println("------------------>>>>>>>>>>>>>>>>>>end");
				  com.liferay.dynamic.data.mapping.model.DDMFormField ddmFormField= article.getDDMStructure().getDDMFormField(name);
				  
				  System.out.println("------------------******************start");
				  System.out.println("is multiple="+ddmFormField.isMultiple());
				  List<com.liferay.dynamic.data.mapping.model.DDMFormField> listOfNestedFields= ddmFormField.getNestedDDMFormFields();
				  Iterator<com.liferay.dynamic.data.mapping.model.DDMFormField> itr=listOfNestedFields.iterator();
				  while(itr.hasNext()){
					  com.liferay.dynamic.data.mapping.model.DDMFormField field=itr.next();
					  System.out.println("name="+name+"|nested fieldname="+field.getName()+"|nested fieldtype="+field.getDataType());
				  }
				  System.out.println("------------------******************end");
				  
				  
				  
				  */
				  }
			  }
			  System.out.println("--------------------------------------------");
	 		
			  System.out.println("Role id : "+model.getRoleId());
			  
			  System.out.println("web content type : "+ddmStructureName);

			  long companyId=CompanyThreadLocal.getCompanyId();
			  Group group  = GroupLocalServiceUtil.getGroup(companyId, siteName);
			 
			  List<UserGroupRole> userGroupRoles = UserGroupRoleLocalServiceUtil.getUserGroupRolesByGroupAndRole(group.getGroupId(), model.getRoleId());
			  System.out.println("userGroupRoles : "+userGroupRoles);
			
			  if(model.getViewActionId()==true)
			  {
			  for(UserGroupRole userGroupRole:userGroupRoles)
			  {
				  User user=userGroupRole.getUser();
				  
					System.out.println("Reciever user ID "+user.getUserId());
					
					JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
					
					payloadJSON.put("classPK", article.getPrimaryKey());
					payloadJSON.put("entryURL", "http://localhost:8080/web/guest");
					payloadJSON.put("className","com.liferay.journal.model.JournalArticle");
					payloadJSON.put("notificationText", currentUser.getFullName()+" has added a new "+"<a href=http://"+ipAddr.getHostAddress()+":8080/group/cholamandalam-investment-and-finance/-/"+article.getUrlTitle()+">"+ddmStructureName+"</a>");
					payloadJSON.put("notificationType", 0);
					payloadJSON.put("entryTitle", article.getTitle(Locale.ENGLISH));
					payloadJSON.put("userId", currentUserId);
					payloadJSON.put("contentType", ddmStructureName);
					
					NotificationEvent userNotificationEvent = NotificationEventFactoryUtil.createNotificationEvent(System.currentTimeMillis(),NotificationDemoHandler.PORTLET_ID,payloadJSON);
					userNotificationEvent.setDeliveryRequired(0);
					userNotificationEvent.setDeliverBy(20156);
					userNotificationEvent.setDeliveryType(UserNotificationDeliveryConstants.TYPE_WEBSITE);
					
					System.out.println("payloadJSON : "+payloadJSON);
										
					userNotificationEventLocalService.addUserNotificationEvent(user.getUserId(),false, userNotificationEvent);
		 }
			  }
			  }
		
		  } catch (PortalException | UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
		
		super.onAfterCreate(model);
	}
	
	
	@Override
	public void onAfterUpdate(ResourcePermission model) throws ModelListenerException {
		// TODO Auto-generated method stub
	
		System.out.println("Inside Update ResourcePermissionModelListener");
		
		String siteName = "Cholamandalam Investment and Finance";
		
		 try {
			 
			  InetAddress ipAddr = InetAddress.getLocalHost();
			  
			  long currentUserId=	PrincipalThreadLocal.getUserId();
			  
			  User currentUser=userLocalService.getUser(currentUserId);
			  
			  long primKey=  model.getPrimKeyId();
		 
			  if(model.getName().equals(JournalArticle.class.getName()))
			  {
			  JournalArticle article=   journalArticleLocalService.getLatestArticle(primKey);
	
			  String ddmStructureName = article.getDDMStructure().getName("en_US");		
	 		
			  System.out.println("Role id : "+model.getRoleId());
			  
			  System.out.println("web content type : "+ddmStructureName);

			  long companyId=CompanyThreadLocal.getCompanyId();
			  Group group  = groupLocalService.getGroup(companyId, siteName);
			 
			  List<UserGroupRole> userGroupRoles = userGroupRoleLocalService.getUserGroupRolesByGroupAndRole(group.getGroupId(), model.getRoleId());
			  System.out.println("userGroupRoles : "+userGroupRoles);
			
			  if(model.getViewActionId()==true)
			  {
			  for(UserGroupRole userGroupRole:userGroupRoles)
			  {
				  User user=userGroupRole.getUser();
				  
					System.out.println("Reciever user ID "+user.getUserId());
					
					JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
					
					payloadJSON.put("classPK", article.getPrimaryKey());
					payloadJSON.put("entryURL", "http://localhost:8080/web/guest");
					payloadJSON.put("className","com.liferay.journal.model.JournalArticle");
					payloadJSON.put("notificationText", currentUser.getFullName()+" has added a new "+"<a href=http://"+ipAddr.getHostAddress()+":8080/group/cholamandalam-investment-and-finance/-/"+article.getUrlTitle()+">"+ddmStructureName+"</a>");
					payloadJSON.put("notificationType", 0);
					payloadJSON.put("entryTitle", article.getTitle(Locale.ENGLISH));
					payloadJSON.put("userId", currentUserId);
					payloadJSON.put("contentType", ddmStructureName);
					
					NotificationEvent userNotificationEvent = NotificationEventFactoryUtil.createNotificationEvent(System.currentTimeMillis(),NotificationDemoHandler.PORTLET_ID,payloadJSON);
					userNotificationEvent.setDeliveryRequired(0);
					userNotificationEvent.setDeliverBy(20156);
					userNotificationEvent.setDeliveryType(UserNotificationDeliveryConstants.TYPE_WEBSITE);
					
					System.out.println("payloadJSON : "+payloadJSON);
					
					userNotificationEventLocalService.addUserNotificationEvent(user.getUserId(),false, userNotificationEvent);
		 }
			  }
			  }
		
		  } catch (PortalException | UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		super.onAfterUpdate(model);
	}
	
	@Reference
	protected RoleLocalService roleLocalService;
	
	@Reference
	protected com.liferay.journal.service.JournalArticleLocalService journalArticleLocalService;
	
	@Reference
	protected com.liferay.document.library.kernel.service.DLFileEntryLocalService dlFileEntryLocalService;
	
	@Reference
	protected UserLocalService userLocalService;
	
	@Reference
	protected  UserNotificationEventLocalService userNotificationEventLocalService;
	
	@Reference
	protected CounterLocalService counterLocalService;
	
	@Reference
	DDMStructureLocalService ddmStructureLocalService;
	
	
	@Reference
	UserGroupRoleLocalService userGroupRoleLocalService;
	
	@Reference
	GroupLocalService groupLocalService;
	
	@Reference
	ResourceLocalService resourceLocalService;
	
	@Reference
	ResourcePermissionService resourcePermissionService;
	
	
	public static void main(String[] args) {
		String x="/documents/20143/119515/image003.jpg/0d525701-22ff-0b9c-2101-ae906c86b8c9?t=1505477732097";
		System.out.println(x.substring(11));
System.out.println(x.substring(11, 11+(x.substring(11)).indexOf("/")));



//System.out.println(x.substring(11));
System.out.println(x.substring(12+(x.substring(11)).indexOf("/")));

String[] vals=x.split("/");
System.out.println(vals[1]);
System.out.println(vals[2]);
System.out.println(vals[3]);
System.out.println(vals[5].subSequence(0, vals[5].indexOf("?")));

	}
}
