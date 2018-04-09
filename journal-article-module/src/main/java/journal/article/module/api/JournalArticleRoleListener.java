package journal.article.module.api;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;
import com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.taglib.ui.JournalArticleTag;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	    immediate = true,
	    service = ModelListener.class
	)
public class JournalArticleRoleListener extends BaseModelListener<JournalArticle>{

	@Override
	public void onAfterCreate(JournalArticle model) throws ModelListenerException {
		// TODO Auto-generated method stub
	
		String articleId=  model.getArticleId();
		
	//	System.out.println("Article ID added "+articleId);
		
		
		super.onAfterCreate(model);
	}
  
	@Override
	public void onAfterAddAssociation(Object classPK, String associationClassName, Object associationClassPK)
			throws ModelListenerException {
		
		
		// TODO Auto-generated method stub
	
		
		/*System.out.println("inside association");
	           try {
	        	   
	        	   ServiceContext ctx= new ServiceContext();
			//if(journalArticleLocalService.getJournalArticle((long)classPK)!=null && roleLocalService.getRole((long)associationClassPK)!=null)
	        //	{
				JournalArticle journalArticle=   journalArticleLocalService.getJournalArticle((long)classPK);
	        	Role role = roleLocalService.getRole((long)associationClassPK);
	        	 
	        	System.out.println(journalArticle.getTitle(ctx.getLocale())+" has assigned to "+role.getTitle(ctx.getLocale()));
	        	
	        	long roleId = role.getRoleId();
	        List<User> roleUsers= 	userLocalService.getRoleUsers(roleId);
	        	
	        for (User user : roleUsers) {
				if (user.getUserId() != ctx.getUserId()) {
					
					JSONObject payloadJSON = JSONFactoryUtil.createJSONObject();
					
					payloadJSON.put("userId", user.getUserId());
					String notificationText= "Web Content Added";
					
					// payloadJSON.put("customEntityId",user.getUserId());
					payloadJSON.put("notificationText", notificationText);
					payloadJSON.put("urlname", "http://localhost:8080/web/guest/display-page");
					
					UserNotificationEventLocalServiceUtil.addUserNotificationEvent(user.getUserId(),
							NotificationDemoHandler.PORTLET_ID, (new Date()).getTime(), user.getUserId(),
							payloadJSON.toString(), false, ctx);
				}
			}
	        
	        	
	        //	}
			
	           
	           } catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		
		super.onAfterAddAssociation(classPK, associationClassName, associationClassPK);
	}
	
	
	@Reference
	protected RoleLocalService roleLocalService;
	
	@Reference
	protected com.liferay.journal.service.JournalArticleLocalService journalArticleLocalService;
	
	@Reference
	protected UserLocalService userLocalService;
	
}
