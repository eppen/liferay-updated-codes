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

import userapi.model.locationtable;
import userapi.model.locationtableModel;
import userapi.model.locationtableSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the locationtable service. Represents a row in the &quot;locationtable&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link locationtableModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link locationtableImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see locationtableImpl
 * @see locationtable
 * @see locationtableModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class locationtableModelImpl extends BaseModelImpl<locationtable>
	implements locationtableModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a locationtable model instance should use the {@link locationtable} interface instead.
	 */
	public static final String TABLE_NAME = "locationtable";
	public static final Object[][] TABLE_COLUMNS = {
			{ "loc_id", Types.INTEGER },
			{ "location", Types.VARCHAR },
			{ "business_id", Types.INTEGER },
			{ "isactive", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("loc_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("business_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("isactive", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table locationtable (loc_id INTEGER not null primary key,location VARCHAR(75) null,business_id INTEGER,isactive INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table locationtable";
	public static final String ORDER_BY_JPQL = " ORDER BY locationtable.loc_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY locationtable.loc_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.userapi.model.locationtable"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.userapi.model.locationtable"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static locationtable toModel(locationtableSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		locationtable model = new locationtableImpl();

		model.setLoc_id(soapModel.getLoc_id());
		model.setLocation(soapModel.getLocation());
		model.setBusiness_id(soapModel.getBusiness_id());
		model.setIsactive(soapModel.getIsactive());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<locationtable> toModels(locationtableSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<locationtable> models = new ArrayList<locationtable>(soapModels.length);

		for (locationtableSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(userapi.service.util.ServiceProps.get(
				"lock.expiration.time.userapi.model.locationtable"));

	public locationtableModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _loc_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setLoc_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _loc_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return locationtable.class;
	}

	@Override
	public String getModelClassName() {
		return locationtable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loc_id", getLoc_id());
		attributes.put("location", getLocation());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer loc_id = (Integer)attributes.get("loc_id");

		if (loc_id != null) {
			setLoc_id(loc_id);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Integer business_id = (Integer)attributes.get("business_id");

		if (business_id != null) {
			setBusiness_id(business_id);
		}

		Integer isactive = (Integer)attributes.get("isactive");

		if (isactive != null) {
			setIsactive(isactive);
		}
	}

	@JSON
	@Override
	public int getLoc_id() {
		return _loc_id;
	}

	@Override
	public void setLoc_id(int loc_id) {
		_loc_id = loc_id;
	}

	@JSON
	@Override
	public String getLocation() {
		if (_location == null) {
			return StringPool.BLANK;
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		_location = location;
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
	public int getIsactive() {
		return _isactive;
	}

	@Override
	public void setIsactive(int isactive) {
		_isactive = isactive;
	}

	@Override
	public locationtable toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (locationtable)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		locationtableImpl locationtableImpl = new locationtableImpl();

		locationtableImpl.setLoc_id(getLoc_id());
		locationtableImpl.setLocation(getLocation());
		locationtableImpl.setBusiness_id(getBusiness_id());
		locationtableImpl.setIsactive(getIsactive());

		locationtableImpl.resetOriginalValues();

		return locationtableImpl;
	}

	@Override
	public int compareTo(locationtable locationtable) {
		int primaryKey = locationtable.getPrimaryKey();

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

		if (!(obj instanceof locationtable)) {
			return false;
		}

		locationtable locationtable = (locationtable)obj;

		int primaryKey = locationtable.getPrimaryKey();

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
	public CacheModel<locationtable> toCacheModel() {
		locationtableCacheModel locationtableCacheModel = new locationtableCacheModel();

		locationtableCacheModel.loc_id = getLoc_id();

		locationtableCacheModel.location = getLocation();

		String location = locationtableCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			locationtableCacheModel.location = null;
		}

		locationtableCacheModel.business_id = getBusiness_id();

		locationtableCacheModel.isactive = getIsactive();

		return locationtableCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{loc_id=");
		sb.append(getLoc_id());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", business_id=");
		sb.append(getBusiness_id());
		sb.append(", isactive=");
		sb.append(getIsactive());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("userapi.model.locationtable");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loc_id</column-name><column-value><![CDATA[");
		sb.append(getLoc_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>business_id</column-name><column-value><![CDATA[");
		sb.append(getBusiness_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isactive</column-name><column-value><![CDATA[");
		sb.append(getIsactive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = locationtable.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			locationtable.class
		};
	private int _loc_id;
	private String _location;
	private int _business_id;
	private int _isactive;
	private locationtable _escapedModel;
}