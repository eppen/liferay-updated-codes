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

package userapi.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the locationtable service. Represents a row in the &quot;locationtable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link userapi.model.impl.locationtableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link userapi.model.impl.locationtableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationtable
 * @see userapi.model.impl.locationtableImpl
 * @see userapi.model.impl.locationtableModelImpl
 * @generated
 */
@ProviderType
public interface locationtableModel extends BaseModel<locationtable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a locationtable model instance should use the {@link locationtable} interface instead.
	 */

	/**
	 * Returns the primary key of this locationtable.
	 *
	 * @return the primary key of this locationtable
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this locationtable.
	 *
	 * @param primaryKey the primary key of this locationtable
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the loc_id of this locationtable.
	 *
	 * @return the loc_id of this locationtable
	 */
	public int getLoc_id();

	/**
	 * Sets the loc_id of this locationtable.
	 *
	 * @param loc_id the loc_id of this locationtable
	 */
	public void setLoc_id(int loc_id);

	/**
	 * Returns the location of this locationtable.
	 *
	 * @return the location of this locationtable
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this locationtable.
	 *
	 * @param location the location of this locationtable
	 */
	public void setLocation(String location);

	/**
	 * Returns the business_id of this locationtable.
	 *
	 * @return the business_id of this locationtable
	 */
	public int getBusiness_id();

	/**
	 * Sets the business_id of this locationtable.
	 *
	 * @param business_id the business_id of this locationtable
	 */
	public void setBusiness_id(int business_id);

	/**
	 * Returns the isactive of this locationtable.
	 *
	 * @return the isactive of this locationtable
	 */
	public int getIsactive();

	/**
	 * Sets the isactive of this locationtable.
	 *
	 * @param isactive the isactive of this locationtable
	 */
	public void setIsactive(int isactive);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(userapi.model.locationtable locationtable);

	@Override
	public int hashCode();

	@Override
	public CacheModel<userapi.model.locationtable> toCacheModel();

	@Override
	public userapi.model.locationtable toEscapedModel();

	@Override
	public userapi.model.locationtable toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}