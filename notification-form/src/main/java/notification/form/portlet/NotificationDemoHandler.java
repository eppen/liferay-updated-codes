
package notification.form.portlet;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import notification.form.constants.NotificationFormPortletKeys;

@Component(
		immediate = true,
		property = {"javax.portlet.name=" + NotificationFormPortletKeys.NotificationForm},
		service = BaseUserNotificationHandler.class
)

public class NotificationDemoHandler extends BaseUserNotificationHandler {
	public static final String PORTLET_ID = "NotificationDemo_WAR_NotificationDemoportlet";

	public NotificationDemoHandler() {
		setPortletId(NotificationDemoHandler.PORTLET_ID);
	}

	@Override
	protected String getBody(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext)
			throws Exception {
		String notificationText = null;
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());
		notificationText = jsonObject.getString("notificationText");
		String urlname = jsonObject.getString("urlname");
		System.out.println("URL======" + urlname);
		if (urlname != null) {
			notificationText = "<a href=" + urlname + ">" + notificationText + "</a>";
		}
		// String title = "<strong>Dockbar Custom User Notification for
		// You</strong>";
		String title = "<strong>Notification.....</strong>";
		String body = StringUtil.replace(getBodyTemplate(), new String[] { "[$TITLE$]", "[$BODY_TEXT$]" },
				new String[] { title, notificationText });
		System.out.println("=========1111111==========");
		return body;
	}

	protected String getBodyTemplate() throws Exception {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">[$TITLE$]</div><div ");
		sb.append("class=\"body\">[$BODY_TEXT$]</div>");
		return sb.toString();
	}

}
