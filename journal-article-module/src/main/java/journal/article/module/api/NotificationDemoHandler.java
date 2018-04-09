
package journal.article.module.api;

import org.osgi.service.component.annotations.Component;

import com.liferay.journal.constants.JournalPortletKeys;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;


@Component(
		immediate = true,
		property = {"javax.portlet.name=" + JournalPortletKeys.JOURNAL},
		service = UserNotificationHandler.class
	)
public class NotificationDemoHandler extends BaseUserNotificationHandler {
	public static final String PORTLET_ID = JournalPortletKeys.JOURNAL;

	public NotificationDemoHandler() {
		setPortletId(PORTLET_ID);
	}
	
	@Override
	protected String getBody(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext)
			throws Exception {
		
		String notificationText=null;
		JSONObject jsonObject = JSONFactoryUtil
				.createJSONObject(userNotificationEvent.getPayload());
	    notificationText=jsonObject.getString("notificationText");
		String urlname=jsonObject.getString("urlname");
		
		String title = "";
		String body = StringUtil.replace(getBodyTemplate(), new String[] {
				"[$TITLE$]", "[$BODY_TEXT$]" },
				new String[] { title, notificationText });
		return body;
	}

	
	protected String getBodyTemplate() throws Exception {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">[$TITLE$]</div><div ");
		sb.append("class=\"body\">[$BODY_TEXT$]</div>");
		return sb.toString();
	}


	
}
