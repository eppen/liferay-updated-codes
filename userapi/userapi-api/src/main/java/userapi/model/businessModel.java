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
 * The base model interface for the business service. Represents a row in the &quot;business&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link userapi.model.impl.businessModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link userapi.model.impl.businessImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see business
 * @see userapi.model.impl.businessImpl
 * @see userapi.model.impl.businessModelImpl
 * @generated
 */
@ProviderType
public interface businessModel extends BaseModel<business> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a business model instance should use the {@link business} interface instead.
	 */

	/**
	 * Returns the primary key of this business.
	 *
	 * @return the primary key of this business
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this business.
	 *
	 * @param primaryKey the primary key of this business
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the business_id of this business.
	 *
	 * @return the business_id of this business
	 */
	public int getBusiness_id();

	/**
	 * Sets the business_id of this business.
	 *
	 * @param business_id the business_id of this business
	 */
	public void setBusiness_id(int business_id);

	/**
	 * Returns the business of this business.
	 *
	 * @return the business of this business
	 */
	@AutoEscape
	public String getBusiness();

	/**
	 * Sets the business of this business.
	 *
	 * @param business the business of this business
	 */
	public void setBusiness(String business);

	/**
	 * Returns the short_name of this business.
	 *
	 * @return the short_name of this business
	 */
	@AutoEscape
	public String getShort_name();

	/**
	 * Sets the short_name of this business.
	 *
	 * @param short_name the short_name of this business
	 */
	public void setShort_name(String short_name);

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
	public int compareTo(userapi.model.business business);

	@Override
	public int hashCode();

	@Override
	public CacheModel<userapi.model.business> toCacheModel();

	@Override
	public userapi.model.business toEscapedModel();

	@Override
	public userapi.model.business toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}