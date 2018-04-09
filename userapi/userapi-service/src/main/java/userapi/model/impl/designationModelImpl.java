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

import userapi.model.designation;
import userapi.model.designationModel;
import userapi.model.designationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the designation service. Represents a row in the &quot;designation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link designationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link designationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see designationImpl
 * @see designation
 * @see designationModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class designationModelImpl extends BaseModelImpl<designation>
	implements designationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a designation model instance should use the {@link designation} interface instead.
	 */
	public static final String TABLE_NAME = "designation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "desig_id", Types.INTEGER },
			{ "designation", Types.VARCHAR },
			{ "business_id", Types.INTEGER },
			{ "isactive", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("desig_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("designation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("business_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("isactive", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table designation (desig_id INTEGER not null primary key,designation VARCHAR(75) null,business_id INTEGER,isactive INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table designation";
	public static final String ORDER_BY_JPQL = " ORDER BY designation.desig_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY designation.desig_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.userapi.model.designation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.userapi.model.designation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static designation toModel(designationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		designation model = new designationImpl();

		model.setDesig_id(soapModel.getDesig_id());
		model.setDesignation(soapModel.getDesignation());
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
	public static List<designation> toModels(designationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<designation> models = new ArrayList<designation>(soapModels.length);

		for (designationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(userapi.service.util.ServiceProps.get(
				"lock.expiration.time.userapi.model.designation"));

	public designationModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _desig_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setDesig_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _desig_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return designation.class;
	}

	@Override
	public String getModelClassName() {
		return designation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("desig_id", getDesig_id());
		attributes.put("designation", getDesignation());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer desig_id = (Integer)attributes.get("desig_id");

		if (desig_id != null) {
			setDesig_id(desig_id);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
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
	public int getDesig_id() {
		return _desig_id;
	}

	@Override
	public void setDesig_id(int desig_id) {
		_desig_id = desig_id;
	}

	@JSON
	@Override
	public String getDesignation() {
		if (_designation == null) {
			return StringPool.BLANK;
		}
		else {
			return _designation;
		}
	}

	@Override
	public void setDesignation(String designation) {
		_designation = designation;
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
	public designation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (designation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		designationImpl designationImpl = new designationImpl();

		designationImpl.setDesig_id(getDesig_id());
		designationImpl.setDesignation(getDesignation());
		designationImpl.setBusiness_id(getBusiness_id());
		designationImpl.setIsactive(getIsactive());

		designationImpl.resetOriginalValues();

		return designationImpl;
	}

	@Override
	public int compareTo(designation designation) {
		int primaryKey = designation.getPrimaryKey();

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

		if (!(obj instanceof designation)) {
			return false;
		}

		designation designation = (designation)obj;

		int primaryKey = designation.getPrimaryKey();

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
	public CacheModel<designation> toCacheModel() {
		designationCacheModel designationCacheModel = new designationCacheModel();

		designationCacheModel.desig_id = getDesig_id();

		designationCacheModel.designation = getDesignation();

		String designation = designationCacheModel.designation;

		if ((designation != null) && (designation.length() == 0)) {
			designationCacheModel.designation = null;
		}

		designationCacheModel.business_id = getBusiness_id();

		designationCacheModel.isactive = getIsactive();

		return designationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{desig_id=");
		sb.append(getDesig_id());
		sb.append(", designation=");
		sb.append(getDesignation());
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
		sb.append("userapi.model.designation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>desig_id</column-name><column-value><![CDATA[");
		sb.append(getDesig_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
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

	private static final ClassLoader _classLoader = designation.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			designation.class
		};
	private int _desig_id;
	private String _designation;
	private int _business_id;
	private int _isactive;
	private designation _escapedModel;
}