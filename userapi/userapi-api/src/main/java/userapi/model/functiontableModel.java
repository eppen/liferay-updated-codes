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
 * The base model interface for the functiontable service. Represents a row in the &quot;functiontable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link userapi.model.impl.functiontableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link userapi.model.impl.functiontableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see functiontable
 * @see userapi.model.impl.functiontableImpl
 * @see userapi.model.impl.functiontableModelImpl
 * @generated
 */
@ProviderType
public interface functiontableModel extends BaseModel<functiontable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a functiontable model instance should use the {@link functiontable} interface instead.
	 */

	/**
	 * Returns the primary key of this functiontable.
	 *
	 * @return the primary key of this functiontable
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this functiontable.
	 *
	 * @param primaryKey the primary key of this functiontable
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the function_id of this functiontable.
	 *
	 * @return the function_id of this functiontable
	 */
	public int getFunction_id();

	/**
	 * Sets the function_id of this functiontable.
	 *
	 * @param function_id the function_id of this functiontable
	 */
	public void setFunction_id(int function_id);

	/**
	 * Returns the function of this functiontable.
	 *
	 * @return the function of this functiontable
	 */
	@AutoEscape
	public String getFunction();

	/**
	 * Sets the function of this functiontable.
	 *
	 * @param function the function of this functiontable
	 */
	public void setFunction(String function);

	/**
	 * Returns the business_id of this functiontable.
	 *
	 * @return the business_id of this functiontable
	 */
	public int getBusiness_id();

	/**
	 * Sets the business_id of this functiontable.
	 *
	 * @param business_id the business_id of this functiontable
	 */
	public void setBusiness_id(int business_id);

	/**
	 * Returns the isactive of this functiontable.
	 *
	 * @return the isactive of this functiontable
	 */
	public int getIsactive();

	/**
	 * Sets the isactive of this functiontable.
	 *
	 * @param isactive the isactive of this functiontable
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
	public int compareTo(userapi.model.functiontable functiontable);

	@Override
	public int hashCode();

	@Override
	public CacheModel<userapi.model.functiontable> toCacheModel();

	@Override
	public userapi.model.functiontable toEscapedModel();

	@Override
	public userapi.model.functiontable toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}