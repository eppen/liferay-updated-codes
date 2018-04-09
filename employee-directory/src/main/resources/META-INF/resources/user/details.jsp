<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/init.jsp" %>
<style>
  .property-list hr {margin-top:10px; margin-bottom:10px;}
  .property-list dt {font-size:16px; position:relative; padding-bottom:8px; margin-bottom:10px;}
  .property-list dt::before{position:absolute; content:""; width:20px;  left:0px; border:1px solid #008ed4; bottom:0px; }
  .user-icon {border-radius: 100%; font-size: 18px; text-align: center;overflow: hidden;height: 60px;line-height: 60px;width: 60px;
}
</style>
<%
User selUser = (User)request.getAttribute("user.selUser");
Contact selContact = (Contact)request.getAttribute("user.selContact");
List<Organization> organizations = (List<Organization>)request.getAttribute("user.organizations");

String organizationsHTML = StringPool.BLANK;

if (!organizations.isEmpty()) {
	organizationsHTML = organizations.get(0).getName();
}

for (int i = 1; i<organizations.size(); i++) {
	organizationsHTML += ", "+ organizations.get(i).getName();
}
%>

<h2><%= selUser.getFullName() %></h2>

<div class="details">
	<liferay-ui:user-portrait
		imageCssClass="user-icon-lg"
		user="<%= selUser %>"
	/>

	<dl class="property-list">
		<c:if test="<%= Validator.isNotNull(selUser.getDisplayEmailAddress()) %>">
			<dt>
				<liferay-ui:message key="email-address" />
			</dt>
			<dd>
				<%= selUser.getDisplayEmailAddress() %>
			</dd>
			<hr>
		</c:if>
             
		<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_BIRTHDAY) %>">
			<dt>
				<liferay-ui:message key="birthday" />
			</dt>
			<dd>
				<%= dateFormatDate.format(selUser.getBirthday()) %>
			</dd>
			<hr>
		</c:if>
		      
			<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Business")) %>">
			<dt>
				<liferay-ui:message key="Business" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Business") %>
			</dd>
			<hr>
		</c:if>
		     
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Jvbranch")) %>">
			<dt>
				<liferay-ui:message key="Jvbranch" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Jvbranch") %>
			</dd>
			 <hr>
		</c:if>
		   
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Areahandled")) %>">
			<dt>
				<liferay-ui:message key="Areahandled" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Areahandled") %>
			</dd>
			 <hr>
		</c:if>
		    
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Unit")) %>">
			<dt>
				<liferay-ui:message key="Unit" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Unit") %>
			</dd>
			  <hr>
		</c:if>
		    
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Region")) %>">
			<dt>
				<liferay-ui:message key="Region" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Region") %>
			</dd>
			 <hr>
		</c:if>
		     
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Location")) %>">
			<dt>
				<liferay-ui:message key="Location" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Location") %>
			</dd>
			 <hr>
		</c:if>
		    
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Functionname")) %>">
			<dt>
				<liferay-ui:message key="Functionname" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Functionname") %>
			</dd>
			<hr>
		</c:if>
		      
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Zone")) %>">
			<dt>
				<liferay-ui:message key="Zone" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Zone") %>
			</dd>
			 <hr>
		</c:if>
		    
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Branch")) %>">
			<dt>
				<liferay-ui:message key="Branch" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Branch") %>
			</dd>
			<hr>
		</c:if>
		    
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Designation")) %>">
			<dt>
				<liferay-ui:message key="Designation" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Designation") %>
			</dd>
			<hr>
		</c:if>
		    
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Department")) %>">
			<dt>
				<liferay-ui:message key="Department" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Department") %>
			</dd>
			
			 <hr>
		</c:if>
		   
		<c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Grade")) %>">
			<dt>
				<liferay-ui:message key="Grade" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Grade") %>
			</dd>
			<hr>
		</c:if>
		
		
		
		

		<%-- <c:if test="<%= Validator.isNotNull(selContact.getJobTitle()) %>">
			<dt>
				<liferay-ui:message key="job-title" />
			</dt>
			<dd>
				<%= HtmlUtil.escape(selContact.getJobTitle()) %>
			</dd>
		</c:if> --%>

		<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_MALE) %>">
			<dt>
				<liferay-ui:message key="gender" />
			</dt>
			<dd>
				<%= LanguageUtil.get(request, selUser.isMale() ? "male" : "female") %>
			</dd>
		</c:if>
		

		<%-- <c:if test="<%= !organizations.isEmpty() %>">
			<dt>
				<c:choose>
					<c:when test="<%= organizations.size() > 1 %>">
						<liferay-ui:message key="organizations" />
					</c:when>
					<c:otherwise>
						<liferay-ui:message key="organization" />
					</c:otherwise>
				</c:choose>
			</dt>
			<dd>
				<%= HtmlUtil.escape(organizationsHTML) %>
			</dd>
		</c:if> --%>
	</dl>
</div>