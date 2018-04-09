
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.knowarth.notifications.portlet.PeoplePowerAPI"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="org.apache.commons.collections.map.MultiValueMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@ include file="init.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%-- <link href="<%=request.getContextPath()%>/css/custom.css"
	rel="stylesheet">
<link href="<%=request.getContextPath()%>/css/main.css" rel="stylesheet">
<script src="<%=request.getContextPath()%>/js/custom.js"></script> 
 --%>
 <portlet:resourceURL var="ajaxURL"></portlet:resourceURL>
 
 <script type="text/javascript">
 function markAsRead(parentVal, parameter){
	       $.ajax({
	                url : '${ajaxURL}',
	                data : {
	                	<portlet:namespace/>callfor:"markAsRead",
	                	<portlet:namespace/>userNotificationEventId:parameter
	                }, 
	
	               type: 'POST',
	               dataType : "json",
	               success : function(data) {
	            	   console.log("Success");
	            	   var eventId = '#'+parameter;
	 	               $(eventId).hide();
	 	              var countVal = $("#count_"+parentVal).html();
	 	              $("#count_"+parentVal).text(countVal-1);
	               },
	               error: function () {
	                    console.log('Error Occurred');
	                    var eventId = '#'+parameter;
		 	               $(eventId).hide();
		 	               var countVal = $("#count_"+parentVal).html();
		 	              $("#count_"+parentVal).text(countVal-1);
	                }
	       });
	}

 </script>
 
 <style type="text/css">
.panel-heading .accordion-toggle:after {
	/* symbol for "opening" panels */
	font-family: 'Glyphicons Halflings';
	/* essential for enabling glyphicon */
	content: "\e114"; /* adjust as needed, taken from bootstrap.css */
	float: right; /* adjust as needed */
	color: grey; /* adjust as needed */
}

.panel-heading .accordion-toggle.collapsed:after {
	/* symbol for "collapsed" panels */
	content: "\e080"; /* adjust as needed, taken from bootstrap.css */
}
</style>
</head>
<body>
	<ul class="list-group">
<li class="list-group-item active">Notifications</li>

<!-- <div class="col-md-12 noti_panel_inn panel_adj">
<div class="panel-group" id="accordion"> -->

	<c:if test="<%=themeDisplay.isSignedIn()%>">

		<%
					List<UserNotificationEvent> events = UserNotificationEventLocalServiceUtil
							.getArchivedUserNotificationEvents(themeDisplay.getUserId(), false, false);

					int userNotificationEventsCount = UserNotificationEventLocalServiceUtil
							.getArchivedUserNotificationEventsCount(themeDisplay.getUserId(), false, false);
					
					List list;
				        MultiValueMap map = new MultiValueMap();  
			
			%>
		

			<%
					for (UserNotificationEvent eventsDetail : events) {
							UserNotificationEvent userNotificationEvent = UserNotificationEventLocalServiceUtil
									.getUserNotificationEvent(eventsDetail.getUserNotificationEventId());

							UserNotificationFeedEntry userNotificationFeedEntry = UserNotificationManagerUtil.interpret(
									StringPool.BLANK, userNotificationEvent, ServiceContextFactory.getInstance(request));

							JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());

							System.out.println("Object : " + jsonObject);

							String classPK = jsonObject.getString("classPK");
							
							String contentType = jsonObject.getString("contentType");

							System.out.println("contentType : " + jsonObject.getString("contentType"));

							long userNotificationEventUserId = jsonObject.getLong("userId");
				
							if(userNotificationFeedEntry!=null)
							{
						        map.put(contentType, jsonObject.getString("notificationText")+"|"+userNotificationEvent.getUserNotificationEventId());
							}
					} 

				 Set entrySet = map.entrySet();
			        Iterator it = entrySet.iterator();
			        
						        while (it.hasNext()) {
						            Map.Entry mapEntry = (Map.Entry) it.next();
						            list = (List) map.get(mapEntry.getKey());
						           
						            String parentId = mapEntry.getKey().toString().replaceAll(" ","");
						        
				%>
				
				<li class="list-group-item">
<div class="panel-group">
<div class="panel panel-default">
<a data-toggle="collapse" href="#collapse2"><%=mapEntry.getKey()%>
<i class="fa fa-caret-down pull-right"></i> </a>
<div id="collapse2" class="panel-collapse collapse">
<div class="panel-body">
<%
									for (int j = 0; j < list.size(); j++) 
									{
										String eventId = list.get(j).toString().substring(list.get(j).toString().indexOf("|")+1,list.get(j).toString().length());
										String eventName= list.get(j).toString().substring(0,list.get(j).toString().indexOf("|"));
									%>
									<div onclick="markAsRead('<%=parentId%>','<%=eventId%>')" id="<%=eventId%>">
									<%
									out.println(eventName);
									%>
									</div>
									<%
						           }
						     %>
</div>

</div>
</div>
</div>
</li>
			 <%-- <div class="panel panel-default">
				<div class="body-container">
					<div class="panel-heading"> 
                     	<span class="glyphicon glyphicon-bell noti_bell" id="count_<%=parentId%>"><%=list.size() %></span>
							<a class="accordion-toggle" data-toggle="collapse"
								data-parent="#accordion"
								href="#<%=parentId%>">
								<%=mapEntry.getKey()%>
							</a>
							
					 </div> 
					<div
						id="<%=parentId%>"
						class="panel-collapse collapse">
						<div class="panel-body"> 
							<%
									for (int j = 0; j < list.size(); j++) 
									{
										String eventId = list.get(j).toString().substring(list.get(j).toString().indexOf("|")+1,list.get(j).toString().length());
										String eventName= list.get(j).toString().substring(0,list.get(j).toString().indexOf("|"));
									%>
									<div onclick="markAsRead('<%=parentId%>','<%=eventId%>')" id="<%=eventId%>">
									<%
									out.println(eventName);
									%>
									&nbsp;&nbsp;&nbsp;<a href="javascript:markAsRead('<%=parentId%>','<%=eventId%>');" >
									Mark as Read
									</a> 
									</div>
									<%
						           }
						     %>
						</div>

					</div>
				 </div>
			</div> --%>
			<%
						}
					%>
		
		<%--  <!-- code for people power API notification starts-->
		<%
		JSONArray objectData = PeoplePowerAPI.getPeoplePowerNotificationList("a447");
		
		
		if(objectData!=null)
		{
			System.out.println("objectData : "+objectData);
			
			%>
			<div class="panel panel-default">
			<%
			System.out.println("People Power Data Object : "+objectData);
			int count= 0;
			String parentId ="Peoplepower";
			
			for(int i = 0; i < objectData.length(); i++)
			{
			      JSONObject objects = objectData.getJSONObject(i);
			      count = objects.getInt("ModCnt")+count;
			}
			System.out.println("People Power Count : "+count);

				  	%>
				  	
				<div class="body-container">
					<div class="panel-heading">
							<span class="glyphicon glyphicon-bell noti_bell" id="count_<%=parentId%>"><%=count %></span>
							<a class="accordion-toggle" data-toggle="collapse"
								data-parent="#accordion"
								href="#<%=parentId%>">
								People Power
							</a>
					</div>
					<div
						id="<%=parentId%>"
						class="panel-collapse collapse">
						<div class="panel-body">
							<%
							for(int i = 0; i < objectData.length(); i++)
							{
							      JSONObject objects = objectData.getJSONObject(i);
							      String Notification_Text = objects.getString("Notification_Text");
							      String ApprovalCategory = objects.getString("ApprovalCategory");
							      int counts = objects.getInt("ModCnt");
							      out.println(ApprovalCategory+" ("+Notification_Text+")"+" ("+counts+") <br>");
							}
						     %>
						      
						</div>
 
					</div>
				</div>
			
			</div>
			<%
			}
			%>
			<!-- code for people power API notification starts-->   --%>
	</c:if>
<!-- </div>
</div> -->
</ul>
</body>
</html>