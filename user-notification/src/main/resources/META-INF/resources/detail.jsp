<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ include file="init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <link href="<%=request.getContextPath()%>/css/custom.css" rel="stylesheet"> 
  <link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet">  
 <script src="<%=request.getContextPath()%>/js/custom.js"></script> 
 
</head>
<body>
<portlet:resourceURL var="resourceURL">
	<portlet:param name="callfor" value="markAsRead"/>
</portlet:resourceURL>

 
<%
DateFormat dateFormatDateTime = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
%>

<c:if test="<%=themeDisplay.isSignedIn() %>">
<input name="portletResourceURL" id="portletResourceURL" type="hidden" value="${resourceURL}" />
<input name="portletNameSpace" id="portletNameSpace" type="hidden" value="<portlet:namespace/>" />
	
	<div id="notification-data"  class="scrollportletId" >
		
			<liferay-ui:search-container>
			<liferay-ui:search-container-results>
               <% 
               
              /*  List<UserNotificationEvent> events = UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE, true,false,searchContainer.getStart(),searchContainer.getEnd()); */
              List<UserNotificationEvent> events = UserNotificationEventLocalServiceUtil.getArchivedUserNotificationEvents(themeDisplay.getUserId(), false, false, searchContainer.getStart(),searchContainer.getEnd());
              /*  int userNotificationEventsCount = UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEventsCount(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE, true, false); */
               int userNotificationEventsCount = UserNotificationEventLocalServiceUtil.getArchivedUserNotificationEventsCount(themeDisplay.getUserId(),false, false);
               searchContainer.setResults(events);
               searchContainer.setTotal(userNotificationEventsCount);
               
               
               %>
			   </liferay-ui:search-container-results>
			 
			<liferay-ui:search-container-row
						className="com.liferay.portal.kernel.model.UserNotificationEvent" keyProperty="userNotificationEventId"
						modelVar="userNotificationEvent"
			>
			<%
			UserNotificationFeedEntry userNotificationFeedEntry = UserNotificationManagerUtil.interpret(StringPool.BLANK, userNotificationEvent, ServiceContextFactory.getInstance(request));
			
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());
			
			boolean anonymous = jsonObject.getBoolean("anonymous");
			
			long userNotificationEventUserId = jsonObject.getLong("userId");
			%>
			
			<c:choose>
				<c:when test="<%= !anonymous %>">
					<liferay-ui:search-container-column-user
						showDetails="<%= false %>"
						userId="<%= userNotificationEventUserId %>"
					/>
				</c:when>
				<c:otherwise>
					<liferay-ui:search-container-column-text>
						<liferay-ui:user-portrait userId="<%= 0 %>" />
					</liferay-ui:search-container-column-text>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="<%= userNotificationFeedEntry == null %>">
					<liferay-ui:search-container-column-text colspan="<%= 2 %>">
						<liferay-ui:message key="notification-no-longer-applies" />
					</liferay-ui:search-container-column-text>
				</c:when>
				<c:otherwise>
			
			
				
					<liferay-ui:search-container-column-text colspan="<%= 2 %>" cssClass='<%= "notification_"+ userNotificationEvent.getUserNotificationEventId()  %>'>
					
						
							<div class="body-container">
								<%= userNotificationFeedEntry.getBody() %>
							</div>
			
							  <div class="timestamp">
								<span title="<%= dateFormatDateTime.format(userNotificationEvent.getTimestamp()) %>">
									<%= Time.getRelativeTimeDescription(userNotificationEvent.getTimestamp(), themeDisplay.getLocale(), themeDisplay.getTimeZone(), dateFormatDateTime) %>
								</span>
							</div> 
					</liferay-ui:search-container-column-text>
				</c:otherwise>
			</c:choose>
			<liferay-ui:search-container-column-jsp align="right" path="/notification_actions.jsp" />
			
			</liferay-ui:search-container-row>
			 
			<liferay-ui:search-iterator displayStyle="descriptive" markupView="lexicon" />
			</liferay-ui:search-container>
			<%-- <a class="alink" style="float: left;" href="<%=GetterUtil.getString(portletPreferences.getValue("notificationURL", "")) %>">View All Notifications</a> --%>			
		
		</div>
			
</c:if>
 
</body>
</html>