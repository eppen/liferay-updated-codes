package journal.article.module.api;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalService;
import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.notifications.NotificationEvent;
import com.liferay.portal.kernel.notifications.NotificationEventFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.UserGroupRoleLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    service = ModelListener.class
	)
public class JournalArticleModelListener  extends BaseModelListener<JournalArticle> {

	
	
	@Override
	public void onAfterCreate(JournalArticle model) throws ModelListenerException {
		// TODO Auto-generated method stub
		 
		super.onAfterCreate(model);
	}
	
	
	@Override
	public void onAfterUpdate(JournalArticle model) throws ModelListenerException {
		// TODO Auto-generated method stub
	
		System.out.println("Inside JournalArticle Update");
		
		String siteName = "Cholamandalam Investment and Finance";
		
		 try {
			  
			  long currentUserId=	PrincipalThreadLocal.getUserId();
			  
			  User currentUser=userLocalService.getUser(currentUserId);
			  
			  long primKey=  model.getResourcePrimKey();
			  
			  long companyId=CompanyThreadLocal.getCompanyId();
			  
			  InetAddress ipAddr = InetAddress.getLocalHost();
			  
	           System.out.println("IP : "+ipAddr.getHostAddress());
	            
		 
			  JournalArticle article=   journalArticleLocalService.getLatestArticle(primKey);
			  
			  List<ResourcePermission> permission =  resourcePermissionLocalService.getResourcePermissions(companyId, JournalArticle.class.getName(), 4, String.valueOf(primKey));
	
			  String ddmStructureName = article.getDDMStructure().getName("en_US");		
	 		
			  for(ResourcePermission resourcePermission : permission)
			  {
			  System.out.println("Role id : "+resourcePermission.getRoleId());
			  
			  System.out.println("web content type : "+ddmStructureName);

			  
			  Group group  = groupLocalService.getGroup(companyId, siteName);
			 
			  List<UserGroupRole> userGroupRoles = userGroupRoleLocalService.getUserGroupRolesByGroupAndRole(group.getGroupId(), resourcePermission.getRoleId());
			  System.out.println("userGroupRoles : "+userGroupRoles);
			
			  for(UserGroupRole userGroupRole:userGroupRoles)
			  {
				  User user=userGroupRole.getUser();
				  
					System.out.println("Reciever user ID "+user.getUserId());
					
					JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
					
					payloadJSON.put("classPK", article.getPrimaryKey());
					payloadJSON.put("entryURL", "http://localhost:8080/web/guest");
					payloadJSON.put("className","com.liferay.journal.model.JournalArticle");
					payloadJSON.put("notificationText", currentUser.getFullName()+" has updated "+"<a href=http://"+ipAddr.getHostAddress()+":8080/group/cholamandalam-investment-and-finance/-/"+article.getUrlTitle()+">"+ddmStructureName+"</a>");
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
	protected UserLocalService userLocalService;
	
	@Reference
	protected  UserNotificationEventLocalService userNotificationEventLocalService;
	
	@Reference
	protected CounterLocalService counterLocalService;
	
	@Reference
	protected ResourcePermissionLocalService resourcePermissionLocalService;
	
	@Reference
	DDMStructureLocalService ddmStructureLocalService;
	
	@Reference
	UserGroupRoleLocalService userGroupRoleLocalService;
	
	@Reference
	GroupLocalService groupLocalService;
}
