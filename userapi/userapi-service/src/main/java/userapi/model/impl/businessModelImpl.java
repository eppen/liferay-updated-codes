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

package userapi.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import userapi.model.business;
import userapi.model.businessModel;
import userapi.model.businessSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the business service. Represents a row in the &quot;business&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link businessModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link businessImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see businessImpl
 * @see business
 * @see businessModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class businessModelImpl extends BaseModelImpl<business>
	implements businessModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a business model instance should use the {@link business} interface instead.
	 */
	public static final String TABLE_NAME = "business";
	public static final Object[][] TABLE_COLUMNS = {
			{ "business_id", Types.INTEGER },
			{ "business", Types.VARCHAR },
			{ "short_name", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("business_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("business", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("short_name", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table business (business_id INTEGER not null primary key,business VARCHAR(75) null,short_name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table business";
	public static final String ORDER_BY_JPQL = " ORDER BY business.business_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY business.business_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.userapi.model.business"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.userapi.model.business"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static business toModel(businessSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		business model = new businessImpl();

		model.setBusiness_id(soapModel.getBusiness_id());
		model.setBusiness(soapModel.getBusiness());
		model.setShort_name(soapModel.getShort_name());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<business> toModels(businessSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<business> models = new ArrayList<business>(soapModels.length);

		for (businessSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(userapi.service.util.ServiceProps.get(
				"lock.expiration.time.userapi.model.business"));

	public businessModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _business_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setBusiness_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _business_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return business.class;
	}

	@Override
	public String getModelClassName() {
		return business.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("business_id", getBusiness_id());
		attributes.put("business", getBusiness());
		attributes.put("short_name", getShort_name());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer business_id = (Integer)attributes.get("business_id");

		if (business_id != null) {
			setBusiness_id(business_id);
		}

		String business = (String)attributes.get("business");

		if (business != null) {
			setBusiness(business);
		}

		String short_name = (String)attributes.get("short_name");

		if (short_name != null) {
			setShort_name(short_name);
		}
	}

	@JSON
	@Override
	public int getBusiness_id() {
		return _business_id;
	}

	@Override
	public void setBusiness_id(int business_id) {
		_business_id = business_id;
	}

	@JSON
	@Override
	public String getBusiness() {
		if (_business == null) {
			return StringPool.BLANK;
		}
		else {
			return _business;
		}
	}

	@Override
	public void setBusiness(String business) {
		_business = business;
	}

	@JSON
	@Override
	public String getShort_name() {
		if (_short_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _short_name;
		}
	}

	@Override
	public void setShort_name(String short_name) {
		_short_name = short_name;
	}

	@Override
	public business toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (business)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		businessImpl businessImpl = new businessImpl();

		businessImpl.setBusiness_id(getBusiness_id());
		businessImpl.setBusiness(getBusiness());
		businessImpl.setShort_name(getShort_name());

		businessImpl.resetOriginalValues();

		return businessImpl;
	}

	@Override
	public int compareTo(business business) {
		int primaryKey = business.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof business)) {
			return false;
		}

		business business = (business)obj;

		int primaryKey = business.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<business> toCacheModel() {
		businessCacheModel businessCacheModel = new businessCacheModel();

		businessCacheModel.business_id = getBusiness_id();

		businessCacheModel.business = getBusiness();

		String business = businessCacheModel.business;

		if ((business != null) && (business.length() == 0)) {
			businessCacheModel.business = null;
		}

		businessCacheModel.short_name = getShort_name();

		String short_name = businessCacheModel.short_name;

		if ((short_name != null) && (short_name.length() == 0)) {
			businessCacheModel.short_name = null;
		}

		return businessCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{business_id=");
		sb.append(getBusiness_id());
		sb.append(", business=");
		sb.append(getBusiness());
		sb.append(", short_name=");
		sb.append(getShort_name());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("userapi.model.business");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>business_id</column-name><column-value><![CDATA[");
		sb.append(getBusiness_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>business</column-name><column-value><![CDATA[");
		sb.append(getBusiness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>short_name</column-name><column-value><![CDATA[");
		sb.append(getShort_name());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = business.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			business.class
		};
	private int _business_id;
	private String _business;
	private String _short_name;
	private business _escapedModel;
}