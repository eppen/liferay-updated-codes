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

<%
String viewUsersRedirect = ParamUtil.getString(request, "viewUsersRedirect");

PortletURL portletURL = (PortletURL)request.getAttribute("view.jsp-portletURL");

if (Validator.isNotNull(viewUsersRedirect)) {
	portletURL.setParameter("viewUsersRedirect", viewUsersRedirect);
}

UserSearch searchContainer = new UserSearch(renderRequest, portletURL);

UserDisplayTerms displayTerms = (UserDisplayTerms)searchContainer.getDisplayTerms();
%>

<liferay-ui:search-toggle
	buttonLabel="search"
	displayTerms="<%= displayTerms %>"
	id="toggle_id_user_search"
	markupView="lexicon"
>
	<aui:fieldset>
		<aui:input inlineField="<%= true %>" name="<%= UserDisplayTerms.FIRST_NAME %>" size="20" type="text" value="<%= displayTerms.getFirstName() %>" />

		<aui:input inlineField="<%= true %>" name="<%= UserDisplayTerms.MIDDLE_NAME %>" size="20" type="text" value="<%= displayTerms.getMiddleName() %>" />

		<aui:input inlineField="<%= true %>" name="<%= UserDisplayTerms.LAST_NAME %>" size="20" type="text" value="<%= displayTerms.getLastName() %>" />
	</aui:fieldset>

	<aui:fieldset>
		<aui:input inlineField="<%= true %>" name="<%= UserDisplayTerms.SCREEN_NAME %>" size="20" type="text" value="<%= displayTerms.getScreenName() %>" />

		<aui:input inlineField="<%= true %>" name="<%= UserDisplayTerms.EMAIL_ADDRESS %>" size="20" type="text" value="<%= displayTerms.getEmailAddress() %>" />
		
	</aui:fieldset>
</liferay-ui:search-toggle>