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

package userapi.service.impl;

import com.liferay.portal.kernel.model.Contact;

import java.util.List;

import userapi.model.screennameempidmapping;
import userapi.service.base.screennameempidmappingLocalServiceBaseImpl;

/**
 * The implementation of the screennameempidmapping local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link userapi.service.screennameempidmappingLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see screennameempidmappingLocalServiceBaseImpl
 * @see userapi.service.screennameempidmappingLocalServiceUtil
 */
public class screennameempidmappingLocalServiceImpl
	extends screennameempidmappingLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link userapi.service.screennameempidmappingLocalServiceUtil} to access the screennameempidmapping local service.
	 */
	public List<screennameempidmapping> getEmpIdbyScreenName(String screename)
	{
	return screennameempidmappingPersistence.findByscreenname(screename);
	}
	
	public List getEmpBirthday() 
	{
		
	return screennameempidmappingFinder.getEmpBirthday();
	}
	
	public List getEmpAnniversary() 
	{
	return screennameempidmappingFinder.getEmpAnniversary();
	}
	
	public List getMilestone() 
	{
	return screennameempidmappingFinder.getMilestone();
	}
	
}