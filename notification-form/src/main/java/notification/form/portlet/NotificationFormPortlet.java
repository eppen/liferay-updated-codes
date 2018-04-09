package notification.form.portlet;

import notification.form.constants.NotificationFormPortletKeys;
import userapi.model.activeemployeeinfosample;
import userapi.model.areahandled;
import userapi.model.branch;
import userapi.model.business;
import userapi.model.department;
import userapi.model.designation;
import userapi.model.functiontable;
import userapi.model.grade;
import userapi.model.jvbranch;
import userapi.model.locationtable;
import userapi.model.regiontable;
import userapi.model.screennameempidmapping;
import userapi.model.unit;
import userapi.model.zone;
import userapi.service.activeemployeeinfosampleLocalService;
import userapi.service.businessLocalService;
import userapi.service.screennameempidmappingLocalServiceUtil;
import userapi.service.persistence.screennameempidmappingPersistence;

import com.liferay.asset.kernel.service.AssetEntryLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Contact;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ClassNameLocalService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalService;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.UserGroupRoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author adms.java1
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=notification-form Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + NotificationFormPortletKeys.NotificationForm,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class NotificationFormPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		try 
		{
			ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			if(themeDisplay.isSignedIn())
			{  
			System.out.println("Hi");
			ServiceContext serviceContext = ServiceContextFactory.getInstance(renderRequest);;
			//updateUserInfo(renderRequest,renderResponse);33639
			/*System.out.println(themeDisplay.getUser().getRoles());
			Role roles = RoleLocalServiceUtil.getRole(33639);
			
			 List<UserGroupRole> role = UserGroupRoleLocalServiceUtil.getUserGroupRoles(themeDisplay.getUserId());
			 System.out.println("roles : "+role);*/
			//List<UserGroupRole> role = UserGroupRoleLocalServiceUtil.getUserGroupRoles(themeDisplay.getUserId());
			// System.out.println("roles : "+role);
			
			/*List<User> roleUsers = userLocalService.getRoleUsers(33639);
   		    System.out.println("List of users : "+roleUsers);
			
   		    Role role = RoleLocalServiceUtil.getRole(33639);
   		    System.out.println(role.getName());
   		    
   		    
   		    List<User> user = UserLocalServiceUtil.getRoleUsers(role.getRoleId());
   		    System.out.println("User : "+user);*/
   		/* List<UserGroupRole> groupRole = UserGroupRoleLocalServiceUtil.getUserGroupRolesByGroupAndRole(20143, 33639);
   		 System.out.println("Grouprole : "+groupRole.get(0).getRole().getName());
   		 for(UserGroupRole role : groupRole)
   		 {
   			 System.out.println(role.getRole().getName());
   		 }*/
			/*System.out.println(themeDisplay.getUserId()+"-- > "+themeDisplay.getLayout().getGroupId());
			
			List<UserGroupRole> userGroupRoles = UserGroupRoleLocalServiceUtil.getUserGroupRoles(themeDisplay.getUserId(), themeDisplay.getLayout().getGroupId());
			System.out.println(userGroupRoles);
			 for(UserGroupRole userGroupRole:userGroupRoles){
			 User oneUser=userGroupRole.getUser();
			 System.out.println("User Data : "+oneUser);
			 }*/
			
			//createRole(renderRequest,renderResponse,serviceContext);
			//assignRoletoUser(renderRequest,renderResponse,serviceContext);
			/*PrintWriter out = renderResponse.getWriter();
			
			List contactData = screennameempidmappingLocalService.getEmpData("-08-27");
			
			Iterator itr = contactData.iterator();
			while(itr.hasNext()){
				Object[] obj = (Object[]) itr.next();
				String firstName = (String) obj[0];
				String lastName = (String) obj[1];
				String jobTitle = (String) obj[2];
			    out.println(firstName+" "+lastName+" <br> "+jobTitle+"<br><br>");
				}*/
			}
		
		super.render(renderRequest, renderResponse);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	public void assignRoletoUser(RenderRequest renderRequest, RenderResponse renderResponse, ServiceContext serviceContext) {
		try
		{
			/*User user = UserLocalServiceUtil.getUser(serviceContext.getUserId());
	        Role liferayRole = RoleLocalServiceUtil.loadFetchRole(serviceContext.getCompanyId(), "ALL");
	        long[] SiteroleIds = {liferayRole.getRoleId()};
	        UserGroupRoleLocalServiceUtil.addUserGroupRoles(user.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
	        */
	        //UserLocalServiceUtil.updateUser(user);	
			
			List<User> userList = userLocalService.getUsers(0, userLocalService.getUsersCount());
			
			for(User userData : userList)
			{
				String businessName = getBusinessShortName((String) userData.getExpandoBridge().getAttribute("Business"));
				//System.out.println("businessname : "+businessName);
				String businessFullName = ((String) userData.getExpandoBridge().getAttribute("Business"));
				//System.out.println("businessFullName : "+ businessFullName);
				String JVBranch = (String) userData.getExpandoBridge().getAttribute("Jvbranch");
				String Areahandled = (String) userData.getExpandoBridge().getAttribute("Areahandled");
				String Unit = ((String) userData.getExpandoBridge().getAttribute("Unit"));
				String Region = ((String) userData.getExpandoBridge().getAttribute("Region"));
				String Location = ((String) userData.getExpandoBridge().getAttribute("Location"));
				String Function = ((String) userData.getExpandoBridge().getAttribute("Functionname"));
				String Zone = ((String) userData.getExpandoBridge().getAttribute("Zone"));
				String Branch = ((String) userData.getExpandoBridge().getAttribute("Branch"));
				String Designation = ((String) userData.getExpandoBridge().getAttribute("Designation"));
				String Department = ((String) userData.getExpandoBridge().getAttribute("Department"));
				String Grade = ((String) userData.getExpandoBridge().getAttribute("Grade"));
				//String Product = ((String) userData.getExpandoBridge().getAttribute("Product"));
				
			List<UserGroupRole> userGroupRoleList = UserGroupRoleLocalServiceUtil.getUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId());

			//System.out.println("--> "+userGroupRoleList);
			
		
		    boolean flag = containsRoles(userGroupRoleList , "ALL");
		    
		    if(flag==false)
				{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),"ALL");
					if(liferayRole!=null)
		        	{
					long[] SiteroleIds = {liferayRole.getRoleId()};
					UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
					System.out.println("All Roles assigned Successfully !!!" + " to "+userData.getUserId());
		        	}
				}
				
		    boolean JVBranchFlag = containsRoles(userGroupRoleList , businessName);

		    if(JVBranchFlag==false)
				{
			    Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(),businessName+"-JVBranch-"+JVBranch);
		       
			    if(liferayRole!=null )
		        	{
						long[] SiteroleIds = {liferayRole.getRoleId()};
				        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				        System.out.println("JVBranch Roles assigned Successfully !!!" + " to "+userData.getUserId());
		        	}
		        }
				
		    boolean businessFlag = containsRoles(userGroupRoleList , businessName);

		    if(businessFlag==false)
				{
				Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName);
					
				if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Business Roles assigned Successfully !!!" + " to "+userData.getUserId());
		        	}	
				}
			
		    
		    	boolean areaFlag = containsRoles(userGroupRoleList , businessName+"-AreaHandled-"+Areahandled);

			    if(areaFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-AreaHandled-"+Areahandled);
					if(liferayRole!=null )
		        	{
					long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("AreaHandled Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean unitFlag = containsRoles(userGroupRoleList , businessName+"-Unit-"+Unit);

			    if(unitFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Unit-"+Unit);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Unit Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean regionFlag = containsRoles(userGroupRoleList , businessName+"-Region-"+Region);

			    if(regionFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Region-"+Region);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Region Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean LocFlag = containsRoles(userGroupRoleList , businessName+"-Location-"+Location);

			    if(LocFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Location-"+Location);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Location Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean funcFlag = containsRoles(userGroupRoleList , businessName+"-Function-"+Function);

			    if(funcFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Function-"+Function);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Function Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean zoneFlag = containsRoles(userGroupRoleList , businessName+"-Zone-"+Zone);

			    if(zoneFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Zone-"+Zone);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Zone Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean desigFlag = containsRoles(userGroupRoleList , businessName+"-Designation-"+Designation);

			    if(desigFlag==false)
					{
					
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Designation-"+Designation);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Designation Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean departFlag = containsRoles(userGroupRoleList , businessName+"-Department-"+Department);

			    if(departFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Department-"+Department);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Department Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean gradeFlag = containsRoles(userGroupRoleList , businessName+"-Grade-"+Grade);

			    if(gradeFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Grade-"+Grade);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Grade Roles assigned Successfully !!!");
		        	}
				}
				
			    boolean branchFlag = containsRoles(userGroupRoleList , businessName+"-Branch-"+Branch);

			    if(branchFlag==false)
					{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Branch-"+Branch);
					if(liferayRole!=null )
		        	{
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Branch Roles assigned Successfully !!!");
		        	}
				}
				
				/*if(!role.getRole().getName().equalsIgnoreCase(businessName+"-Product-"+Product))
				{
					Role liferayRole = RoleLocalServiceUtil.fetchRole(serviceContext.getCompanyId(),businessName+"-Product-"+Product);
			        long[] SiteroleIds = {liferayRole.getRoleId()};
			        UserGroupRoleLocalServiceUtil.addUserGroupRoles(userData.getUserId(), serviceContext.getScopeGroupId(), SiteroleIds);
				    System.out.println("Product Roles assigned Successfully !!!");
				}*/
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private boolean containsRoles(List<UserGroupRole> userGroupRoleList,String role) throws PortalException {
		for (UserGroupRole roleData : userGroupRoleList) {
	        if (roleData.getRole().getName().equalsIgnoreCase(role)) 
	        {
	            return true;
	        }
	    }
	    return false;
	}



	private String getBusinessShortName(String businessName) 
	{
		if(businessName.equalsIgnoreCase("Chola Business Services Limited"))
		{
			businessName = "CBSL";
		}
		
		if(businessName.equalsIgnoreCase("Cholamandalam Investment & Finance Company Ltd"))
		{
			businessName = "CIFCL";
		}
		
		if(businessName.equalsIgnoreCase("Cholamandalam Securities Limited"))
		{
			businessName = "CSEC";
		}
		
		if(businessName.equalsIgnoreCase("Cholamandalam Distribution Services Ltd"))
		{
			businessName = "CDSL";
		}
		
		return businessName;
	}



	public void createRole(RenderRequest renderRequest, RenderResponse renderResponse, ServiceContext serviceContext) {
		try 
		{
		//createBusinessRoles(renderRequest,renderResponse,serviceContext); 
		
		//createBusinessGradeRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessZoneRoles(renderRequest,renderResponse,serviceContext); 
		
		//createBusinessUnitRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessRegionRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessFunctionRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessBranchRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessDepartmentRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessLocationRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessDesignationRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessAreaHandledRoles(renderRequest,renderResponse,serviceContext);
		
		//createBusinessJVBranchRoles(renderRequest,renderResponse,serviceContext);
			
			//createBusinessProductRoles(renderRequest,renderResponse,serviceContext);
		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}



	/*private void createBusinessProductRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext)
	{
		List<> jvbranchData = jvbranchLocalService.getjvbranchs(0, jvbranchLocalService.getjvbranchsCount());

		for(jvbranch data : jvbranchData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		role.setDescription(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		role.setTitle(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}*/



	private void createBusinessJVBranchRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<jvbranch> jvbranchData = jvbranchLocalService.getjvbranchs(0, jvbranchLocalService.getjvbranchsCount());

		for(jvbranch data : jvbranchData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		role.setDescription(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		role.setTitle(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-JVBranch-"+data.getJvbranch()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}



	private void createBusinessAreaHandledRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<areahandled> areahandledData = areahandledLocalService.getareahandleds(0, areahandledLocalService.getareahandledsCount());

		for(areahandled data : areahandledData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-AreaHandled-"+data.getArea());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-AreaHandled-"+data.getArea());
		role.setDescription(businessData.getShort_name()+"-AreaHandled-"+data.getArea());
		role.setTitle(businessData.getShort_name()+"-AreaHandled-"+data.getArea());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-AreaHandled-"+data.getArea()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}



	private void createBusinessDesignationRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<designation> designationData = designationLocalService.getdesignations(0, designationLocalService.getdesignationsCount());

		for(designation data : designationData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Designation-"+data.getDesignation());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Designation-"+data.getDesignation());
		role.setDescription(businessData.getShort_name()+"-Designation-"+data.getDesignation());
		role.setTitle(businessData.getShort_name()+"-Designation-"+data.getDesignation());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Designation-"+data.getDesignation()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessLocationRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<locationtable> locationtableData = locationtableLocalService.getlocationtables(0, locationtableLocalService.getlocationtablesCount());

		for(locationtable data : locationtableData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Location-"+data.getLocation());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Location-"+data.getLocation());
		role.setDescription(businessData.getShort_name()+"-Location-"+data.getLocation());
		role.setTitle(businessData.getShort_name()+"-Location-"+data.getLocation());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Location-"+data.getLocation()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessDepartmentRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<department> departmentData = departmentLocalService.getdepartments(0, departmentLocalService.getdepartmentsCount());

		for(department data : departmentData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Department-"+data.getDepartment());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Department-"+data.getDepartment());
		role.setDescription(businessData.getShort_name()+"-Department-"+data.getDepartment());
		role.setTitle(businessData.getShort_name()+"-Department-"+data.getDepartment());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Department-"+data.getDepartment()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessBranchRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<branch> branchData = branchLocalService.getbranchs(0, branchLocalService.getbranchsCount());

		for(branch data : branchData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Branch-"+data.getBranch());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Branch-"+data.getBranch());
		role.setDescription(businessData.getShort_name()+"-Branch-"+data.getBranch());
		role.setTitle(businessData.getShort_name()+"-Branch-"+data.getBranch());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Branch-"+data.getBranch()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessFunctionRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<functiontable> functiontableData = functiontableLocalService.getfunctiontables(0, functiontableLocalService.getfunctiontablesCount());

		for(functiontable data : functiontableData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Function-"+data.getFunction());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Function-"+data.getFunction());
		role.setDescription(businessData.getShort_name()+"-Function-"+data.getFunction());
		role.setTitle(businessData.getShort_name()+"-Function-"+data.getFunction());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Function-"+data.getFunction()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessRegionRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		
		try
		{
		List<regiontable> regiontableData = regiontableLocalService.getregiontables(0, regiontableLocalService.getregiontablesCount());

		for(regiontable data : regiontableData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Region-"+data.getRegion());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Region-"+data.getRegion());
		role.setDescription(businessData.getShort_name()+"-Region-"+data.getRegion());
		role.setTitle(businessData.getShort_name()+"-Region-"+data.getRegion());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Region-"+data.getRegion()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessUnitRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<unit> unitData = unitLocalService.getunits(0, unitLocalService.getunitsCount());

		for(unit data : unitData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Unit-"+data.getUnit());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Unit-"+data.getUnit());
		role.setDescription(businessData.getShort_name()+"-Unit-"+data.getUnit());
		role.setTitle(businessData.getShort_name()+"-Unit-"+data.getUnit());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Unit-"+data.getUnit()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessZoneRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<zone> zoneData = zoneLocalService.getzones(0, zoneLocalService.getzonesCount());

		for(zone data : zoneData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Zone-"+data.getZone());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Zone-"+data.getZone());
		role.setDescription(businessData.getShort_name()+"-Zone-"+data.getZone());
		role.setTitle(businessData.getShort_name()+"-Zone-"+data.getZone());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Zone-"+data.getZone()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessGradeRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<grade> gradeData = gradeLocalService.getgrades(0, gradeLocalService.getgradesCount());

		for(grade data : gradeData)
		{
		business businessData = businessLocalService.getbusiness(data.getBusiness_id());
			
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), businessData.getShort_name()+"-Grade-"+data.getGrade());
		System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null && data.getIsactive()==1)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(businessData.getShort_name()+"-Grade-"+data.getGrade());
		role.setDescription(businessData.getShort_name()+"-Grade-"+data.getGrade());
		role.setTitle(businessData.getShort_name()+"-Grade-"+data.getGrade());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println(businessData.getShort_name()+"-Grade-"+data.getGrade()+" --> Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	private void createBusinessRoles(RenderRequest renderRequest, RenderResponse renderResponse,
			ServiceContext serviceContext) {
		try
		{
		List<business> businessData = businessLocalService.getbusinesses(0, businessLocalService.getbusinessesCount());

		for(business data : businessData)
		{
		Role liferayRole = roleLocalService.fetchRole(serviceContext.getCompanyId(), data.getShort_name());
		//System.out.println("liferayRole : "+liferayRole);
		
		if(liferayRole==null)
		{
		Role role=roleLocalService.createRole(CounterLocalServiceUtil.increment());
		role.setCompanyId(serviceContext.getCompanyId());
		role.setClassNameId(PortalUtil.getClassNameId(Role.class));
		role.setClassPK(role.getRoleId());
		role.setName(data.getShort_name());
		role.setDescription(data.getBusiness());
		role.setTitle(data.getShort_name());
		role.getExpandoBridge().setAttribute("Peoplepowerflag", "True");
		role.setType(RoleConstants.TYPE_SITE);
		role.setUserId(serviceContext.getUserId());
		role.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		role=roleLocalService.addRole(role);
		System.out.println("Role Added Successfully !!!");
		
		String[] keys = new String[] {ActionKeys.VIEW,ActionKeys.UPDATE,ActionKeys.MANAGE_ANNOUNCEMENTS,ActionKeys.ASSIGN_MEMBERS,ActionKeys.DEFINE_PERMISSIONS,ActionKeys.PERMISSIONS,ActionKeys.DELETE};
		ResourcePermissionLocalServiceUtil.setResourcePermissions(serviceContext.getCompanyId(), Role.class.getName(),4,String.valueOf(role.getRoleId()),20124, keys);
		System.out.println("Permission Added Successfully !!!");
	
		}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}



	public void updateUserInfo(RenderRequest renderRequest, RenderResponse renderResponse) 
	{
		try
		{
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		if(themeDisplay.isSignedIn())
		{
			List<User> userData = userLocalService.getUsers(0, userLocalService.getUsersCount());
			for(User userInfo : userData)
			{
				
				List<screennameempidmapping> data = screennameempidmappingLocalService.getEmpIdbyScreenName(userInfo.getScreenName());
				if(!data.isEmpty())
				{
					System.out.println("ScreenName : "+userInfo.getScreenName());
				}
				
				for(screennameempidmapping mapping : data)
				{
				System.out.println("EmpId : "+mapping.getEmpid());	
				List<activeemployeeinfosample> activeemployeeinfosamples = activeemployeeinfosampleLocalService.getEmpDetailsByEmpId(mapping.getEmpid());
				System.out.println(activeemployeeinfosamples);
				for(activeemployeeinfosample activeemployeeinfoData : activeemployeeinfosamples)
				{
					User user = userLocalService.getUserById(userInfo.getUserId());
					user.getExpandoBridge().setAttribute("Designation", activeemployeeinfoData.getDesignation());
					user.getExpandoBridge().setAttribute("Areahandled",activeemployeeinfoData.getAreaHandled());
					user.getExpandoBridge().setAttribute("Branch",activeemployeeinfoData.getBranch());
					user.getExpandoBridge().setAttribute("Business",activeemployeeinfoData.getBusiness());
					user.getExpandoBridge().setAttribute("Costcenter",activeemployeeinfoData.getCostcenter());
					user.getExpandoBridge().setAttribute("Department",activeemployeeinfoData.getDepartment());
					user.getExpandoBridge().setAttribute("Functionname",activeemployeeinfoData.getFunctionName());
					user.getExpandoBridge().setAttribute("Grade",activeemployeeinfoData.getGrade());
					user.getExpandoBridge().setAttribute("Gradegroup",activeemployeeinfoData.getGradeGroup());
					user.getExpandoBridge().setAttribute("Jvbranch",activeemployeeinfoData.getJVBranch());
					user.getExpandoBridge().setAttribute("Location",activeemployeeinfoData.getLocation());
					user.getExpandoBridge().setAttribute("Product",activeemployeeinfoData.getProduct());
					user.getExpandoBridge().setAttribute("Region",activeemployeeinfoData.getRegion());
					user.getExpandoBridge().setAttribute("Unit",activeemployeeinfoData.getUnit());
					user.getExpandoBridge().setAttribute("Zone",activeemployeeinfoData.getZone());
					user.setJobTitle(activeemployeeinfoData.getDesignation());
				
					userLocalService.updateUser(user);
					
					System.out.println("userInfo : "+activeemployeeinfoData.getName());
				}
				
				}
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Reference
	userapi.service.areahandledLocalService areahandledLocalService;
	
	@Reference
	userapi.service.jvbranchLocalService jvbranchLocalService;
	
	@Reference
	userapi.service.designationLocalService designationLocalService;
	
	@Reference
	userapi.service.departmentLocalService departmentLocalService;
	
	@Reference
	userapi.service.locationtableLocalService locationtableLocalService;
	
	@Reference
	userapi.service.branchLocalService branchLocalService;
	
	@Reference
	userapi.service.functiontableLocalService functiontableLocalService;
	
	@Reference
	userapi.service.regiontableLocalService regiontableLocalService;

	@Reference
	userapi.service.unitLocalService unitLocalService;
	
	@Reference
	userapi.service.zoneLocalService zoneLocalService;

	@Reference
	userapi.service.gradeLocalService gradeLocalService;
	
	@Reference
	businessLocalService businessLocalService;

	@Reference
	UserLocalService userLocalService;
	
	@Reference
	activeemployeeinfosampleLocalService activeemployeeinfosampleLocalService;
	
	@Reference
	userapi.service.screennameempidmappingLocalService screennameempidmappingLocalService;
	
	@Reference
	RoleLocalService roleLocalService;
	
	@Reference
	ClassNameLocalService classNameLocalService;
	
	@Reference
	ResourcePermissionLocalService resourcePermissionLocalService;
	
	@Reference
	AssetEntryLocalService assetEntryLocalService;
	
	@Reference
	JournalArticleLocalService journalArticleLocalService;
	
	public void addEntry(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		try 
		{
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		/*ServiceContext ctx = ServiceContextFactory.getInstance(actionRequest);
		
		System.out.println("UserId : "+themeDisplay.getUserId());
		
		String notifyText = actionRequest.getParameter("name");
		System.out.println("notifyText : "+notifyText);
		JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
		payloadJSON.put("userId", themeDisplay.getUserId());
		payloadJSON.put("notificationText", "Web Content Added");
		
		UserNotificationEventLocalServiceUtil.addUserNotificationEvent(themeDisplay.getUserId(),
				"HI", (new Date()).getTime(), themeDisplay.getUserId(),
				payloadJSON.toString(), false, ctx);*/
		
			/*String date = actionRequest.getParameter("date");
			System.out.println("Date : "+date);*/
			String article []={"76202"};
			
			List<JournalArticle> data = journalArticleLocalService.getIndexableArticlesByDDMStructureKey(article);
			System.out.println("data : "+data);
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}