<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalService"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="userapi.service.screennameempidmappingLocalServiceUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>

<div class="col-md-12 panel_adj">    
         <div class="col-md-12" style="padding:0px;">
         <div class="col-md-12 bd_panel">
	<%
		ThemeDisplay themeDisplays = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

			if (themeDisplays.isSignedIn()) 
			{
			
			List birthdayData = screennameempidmappingLocalServiceUtil.getEmpBirthday();
			
			//System.out.println("COntact Data : "+birthdayData);
			
			Iterator itr = birthdayData.iterator();
			while (itr.hasNext()) {
				Object[] obj = (Object[]) itr.next();
				
				//System.out.println("While Data : "+String.valueOf(obj[0])+" -> "+String.valueOf(obj[1])+" -> "+String.valueOf(obj[2])+" -> "+String.valueOf(obj[3]));
				
				User userData = UserLocalServiceUtil.getUserByContactId(Long.parseLong(String.valueOf(obj[0])));
				String Location = ((String) userData.getExpandoBridge().getAttribute("Location"));
				
				String jobTitle = String.valueOf(obj[3]);
				String date =  new SimpleDateFormat("dd-MMM").format(obj[4]);
				
	%>
			<div class="row">
				<div class="col-md-4 bd_panel_img">
					<img src="<%=userData.getPortraitURL(themeDisplays)%>"
						class="img-circle bd_img_fixed">
				</div>
				<div class="col-md-5 bd_panel_text">
					<span class="bd_panel_head"> <%=userData.getFirstName() + " " + userData.getLastName()%></span>
					<span class="bd_panel_subtext"> <%=jobTitle%> - <%=Location%></span><br> <span
						class="bd_panel_subtext"><%=date%></span> <span
						class="bd_img_wishbtn"> <a
						style="border: none; background: none;" target="_blank"
						href="/web/<%=userData.getScreenName()%>"> SEND WISH </a>
					</span>
				</div>
				<div class="col-md-3 bd_subimg_wish">
					<img src="/theme/images/bd_wish2.jpg" class="img-circle bd_img_wish">
				</div>
			</div>
			<%
				}

					List anniversaryData = screennameempidmappingLocalServiceUtil.getEmpAnniversary();

					//System.out.println("anniversaryData Data : "+anniversaryData);

					Iterator itr1 = anniversaryData.iterator();
					while (itr1.hasNext()) {
						Object[] obj = (Object[]) itr1.next();

						//System.out.println("While Data : "+String.valueOf(obj[0])+" -> "+String.valueOf(obj[1])+" -> "+String.valueOf(obj[2])+" -> "+String.valueOf(obj[3]));

						User userData = UserLocalServiceUtil.getUser(Long.parseLong(String.valueOf(obj[6])));

						String date = new SimpleDateFormat("dd-MMM").format(obj[9]);
						
						String Location = ((String) userData.getExpandoBridge().getAttribute("Location"));
						
			%>
	
			<div class="row">
				<div class="col-md-4 bd_panel_img">
					<img src="<%=userData.getPortraitURL(themeDisplays)%>"
						class="img-circle bd_img_fixed">
				</div>
				<div class="col-md-5 bd_panel_text">
					<span class="bd_panel_head"> <%=userData.getFullName()%></span>
					<span class="bd_panel_subtext"> <%=userData.getJobTitle()%>- <%=Location%></span><br> <span
						class="bd_panel_subtext"><%=date%></span> <span
						class="bd_img_wishbtn"> <a
						style="border: none; background: none;" target="_blank"
						href="/web/<%=userData.getScreenName()%>"> SEND WISH </a>
					</span>
				</div>
				<div class="col-md-3 bd_subimg_wish">
					<img src="/theme/images/bd_wish.jpg" class="img-circle bd_img_wish">
				</div>
			</div>
			
	<%
		}
		} 
		else {
			%>
			Please Login to see Birthday / Anniversary List
			<%
		}
	%>
</div>
</div>
</div>

