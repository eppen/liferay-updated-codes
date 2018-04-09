<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="userapi.service.screennameempidmappingLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
<style type="text/css">
	.send-wish-btn{background:#294E60; color:#fff; padding:0px 2px; margin-top:45px;}
	.send-wish-btn:hover{background:#395e70; color:#fff;}
	.award-box{margin-top:10px;}
	.award-box h4 {font-size:16px; margin-bottom:0px; margin-top:30px;
	text-transform:uppercase;}
    .award-box p {text-transform:uppercase;}
	.award-image {height:80px; width:100%;}
	.award-image img{height:100%; width:100%;}
	.milestone-box .nav{background:#0098DB;}
	.milestone-box .nav-pills > li > a{border-radius:0px; color:#fff; padding:0px;}
	.milestone-box .nav-pills > li.active a{background:#FFCC2A;}
	.milestone-box .nav-pills > li > a:hover{background:#FFCC2A;}
	.milestone-box h4 span{color:#D40C0C;}
	.border-bx hr{border-bottom:3px solid #E7E8EA; margin-bottom:0px;}
</style>  
  
<body>

<%
ThemeDisplay themeDisplays = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplays.isSignedIn()){
	try
	{
		Map<String, String> fiveYears = new HashMap<String,String>();
		Map<String, String> tenYears = new HashMap<String,String>();
		Map<String, String> fifteenYears = new HashMap<String,String>();
		Map<String, String> twentyYears = new HashMap<String,String>();
		Map<String, String> twentyFiveYears = new HashMap<String,String>();
		Map<String, String> thirtyYears = new HashMap<String,String>();
	
	List milestones = screennameempidmappingLocalServiceUtil.getMilestone();
	
	Iterator its = milestones.iterator();
	while (its.hasNext()) {
		Object[] obj = (Object[]) its.next();
		
		int years = Integer.parseInt(String.valueOf(obj[9]));
		
		User userData = UserLocalServiceUtil.getUser(Long.parseLong(String.valueOf(obj[6])));
		
		String date =  new SimpleDateFormat("dd-MMM-yyyy").format(obj[9]);
		
		if(years>=5 && years<10)
		{
			fiveYears.put(userData.getScreenName(),userData.getFullName()+"<br>"+userData.getJobTitle());
		}
		if(years>=10 && years<15)
		{
			tenYears.put(userData.getScreenName(),userData.getFullName()+"<br>"+userData.getJobTitle());
		}
		if(years>=15 && years<20)
		{
			fifteenYears.put(userData.getScreenName(),userData.getFullName()+"<br>"+userData.getJobTitle());
		}
		if(years>=20 && years<25)
		{
			twentyYears.put(userData.getScreenName(),userData.getFullName()+"<br>"+userData.getJobTitle());
		}
		if(years>=25) 
		{
			twentyFiveYears.put(userData.getScreenName(),userData.getFullName()+"<br>"+userData.getJobTitle());
		}
		if(years==30)
		{
			thirtyYears.put(userData.getScreenName(),userData.getFullName()+"<br>"+userData.getJobTitle());
		} 
		
	}

%>
<div class="container">
	<div class="row">
		<div class="col-md-6 milestone-box">
	
  <ul class="nav nav-pills nav-justified">
    <li class="active"><a data-toggle="pill" href="#home">5 Years</a></li>
    <li><a data-toggle="pill" href="#menu1">10 Years</a></li>
    <li><a data-toggle="pill" href="#menu2">15 Years</a></li>
    <li><a data-toggle="pill" href="#menu3">20 Years</a></li>
    <li><a data-toggle="pill" href="#menu4">25 Years</a></li>
    <li><a data-toggle="pill" href="#menu5">30 Years</a></li>
  </ul>

<div class="tab-content">
<div id="home" class="tab-pane fade in active ">
   <%
   if(!fiveYears.isEmpty())
   {
   for (Map.Entry<String, String> entry : fiveYears.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	User userData = UserLocalServiceUtil.getUserByScreenName(themeDisplays.getCompanyId(),entry.getKey());
	%>
	
	<div class="row award-box">
       
      <div class="col-sm-2  ">
        <div class="award-image">
      	<img src="<%=userData.getPortraitURL(themeDisplays)%>"  alt="">
      	</div>
      </div>
      <div class="col-sm-7 ">
       <%=entry.getValue() %>	
      </div>
        <div class="col-sm-2 ">
      	  <a style="border: none; background: none;" target="_blank"
					href="/web/<%=entry.getKey() %>">
				<span class="btn send-wish-btn">Send Wish</span>
		</a>
      </div>
       <div class="col-xs-12 border-bx"> <hr> </div>
     </div>
				
	<%
   }
}
   else
   {
   	%>
   	No 5 Years Milestone Today
   	<%
   }
    %>
</div>
 
 <div id="menu1" class="tab-pane fade">
   <%
   if(!tenYears.isEmpty())
   {
   for (Map.Entry<String, String> entry : tenYears.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	User userData = UserLocalServiceUtil.getUserByScreenName(themeDisplays.getCompanyId(),entry.getKey());
	%>
	<div class="row award-box">
       
      <div class="col-sm-2  ">
        <div class="award-image">
      	<img src="<%=userData.getPortraitURL(themeDisplays)%>"  alt="">
      	</div>
      </div>
      <div class="col-sm-7 ">
       <%=entry.getValue() %>	
      </div>
        <div class="col-sm-2 ">
      	  <a style="border: none; background: none;" target="_blank"
					href="/web/<%=entry.getKey() %>">
				<span class="btn send-wish-btn">Send Wish</span>
		</a>
      </div>
       <div class="col-xs-12 border-bx"> <hr> </div>
     </div>
				
	<%
   }
}
   else
   {
   	%>
   	No 10 Years Milestone Today
   	<%
   }
    %>
</div>

<div id="menu2" class="tab-pane fade">
  <%
   if(!fifteenYears.isEmpty())
   {
   for (Map.Entry<String, String> entry : fifteenYears.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	User userData = UserLocalServiceUtil.getUserByScreenName(themeDisplays.getCompanyId(),entry.getKey());
	%>
	<div class="row award-box">
       
      <div class="col-sm-2  ">
        <div class="award-image">
      	<img src="<%=userData.getPortraitURL(themeDisplays)%>"  alt="">
      	</div>
      </div>
      <div class="col-sm-7 ">
       <%=entry.getValue() %>	
      </div>
        <div class="col-sm-2 ">
      	  <a style="border: none; background: none;" target="_blank"
					href="/web/<%=entry.getKey() %>">
				<span class="btn send-wish-btn">Send Wish</span>
		</a>
      </div>
       <div class="col-xs-12 border-bx"> <hr> </div>
     </div>
				
	<%
   }
}
   else
   {
   	%>
   	No 15 Years Milestone Today
   	<%
   }
    %>
</div>

<div id="menu3" class="tab-pane fade">
    <%
   if(!twentyYears.isEmpty())
   {
   for (Map.Entry<String, String> entry : twentyYears.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	User userData = UserLocalServiceUtil.getUserByScreenName(themeDisplays.getCompanyId(),entry.getKey());
	%>
	<div class="row award-box">
       
      <div class="col-sm-2  ">
        <div class="award-image">
      	<img src="<%=userData.getPortraitURL(themeDisplays)%>"  alt="">
      	</div>
      </div>
      <div class="col-sm-7 ">
       <%=entry.getValue() %>	
      </div>
        <div class="col-sm-2 ">
      	  <a style="border: none; background: none;" target="_blank"
					href="/web/<%=entry.getKey() %>">
				<span class="btn send-wish-btn">Send Wish</span>
		</a>
      </div>
       <div class="col-xs-12 border-bx"> <hr> </div>
     </div>
				
	<%
   }
}
   else
   {
   	%>
   	No 20 Years Milestone Today
   	<%
   }
    %>
</div> 

<div id="menu4" class="tab-pane fade">
	 <%
   if(!twentyFiveYears.isEmpty())
   {
   for (Map.Entry<String, String> entry : twentyFiveYears.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	User userData = UserLocalServiceUtil.getUserByScreenName(themeDisplays.getCompanyId(),entry.getKey());
	%>
	<div class="row award-box">
       
      <div class="col-sm-2  ">
        <div class="award-image">
      	<img src="<%=userData.getPortraitURL(themeDisplays)%>"  alt="">
      	</div>
      </div>
      <div class="col-sm-7 ">
       <%=entry.getValue() %>	
      </div>
        <div class="col-sm-2 ">
      	  <a style="border: none; background: none;" target="_blank"
					href="/web/<%=entry.getKey() %>">
				<span class="btn send-wish-btn">Send Wish</span>
		</a>
      </div>
       <div class="col-xs-12 border-bx"> <hr> </div>
     </div>
				
	<%
   }
}
   else
   {
   	%>
   	No 25 Years Milestone Today
   	<%
   }
    %>
</div> 

<div id="menu5" class="tab-pane fade">
	 <%
   if(!thirtyYears.isEmpty())
   {
   for (Map.Entry<String, String> entry : thirtyYears.entrySet()) {
		//System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	User userData = UserLocalServiceUtil.getUserByScreenName(themeDisplays.getCompanyId(),entry.getKey());
	%>
	<div class="row award-box">
       
      <div class="col-sm-2  ">
        <div class="award-image">
      	<img src="<%=userData.getPortraitURL(themeDisplays)%>"  alt="">
      	</div>
      </div>
      <div class="col-sm-7 ">
       <%=entry.getValue() %>	
      </div>
        <div class="col-sm-2 ">
      	  <a style="border: none; background: none;" target="_blank"
					href="/web/<%=entry.getKey() %>">
				<span class="btn send-wish-btn">Send Wish</span>
		</a>
      </div>
       <div class="col-xs-12 border-bx"> <hr> </div>
     </div>
				
	<%
   }
}
   else
   {
   	%>
   	No 30 Years Milestone Today
   	<%
   }
    %>
  </div>
</div>  
<%
	}
	catch(Exception e)
	{
		//e.printStackTrace();
	}
}
%>
</div>
</div>
</div>
</body>
</html>
  