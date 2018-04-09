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

import userapi.model.department;
import userapi.model.departmentModel;
import userapi.model.departmentSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the department service. Represents a row in the &quot;department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link departmentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link departmentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see departmentImpl
 * @see department
 * @see departmentModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class departmentModelImpl extends BaseModelImpl<department>
	implements departmentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a department model instance should use the {@link department} interface instead.
	 */
	public static final String TABLE_NAME = "department";
	public static final Object[][] TABLE_COLUMNS = {
			{ "dept_id", Types.INTEGER },
			{ "department", Types.VARCHAR },
			{ "business_id", Types.INTEGER },
			{ "isactive", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("dept_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("department", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("business_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("isactive", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table department (dept_id INTEGER not null primary key,department VARCHAR(75) null,business_id INTEGER,isactive INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table department";
	public static final String ORDER_BY_JPQL = " ORDER BY department.dept_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY department.dept_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.userapi.model.department"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.userapi.model.department"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static department toModel(departmentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		department model = new departmentImpl();

		model.setDept_id(soapModel.getDept_id());
		model.setDepartment(soapModel.getDepartment());
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
	public static List<department> toModels(departmentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<department> models = new ArrayList<department>(soapModels.length);

		for (departmentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(userapi.service.util.ServiceProps.get(
				"lock.expiration.time.userapi.model.department"));

	public departmentModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _dept_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setDept_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dept_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return department.class;
	}

	@Override
	public String getModelClassName() {
		return department.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dept_id", getDept_id());
		attributes.put("department", getDepartment());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer dept_id = (Integer)attributes.get("dept_id");

		if (dept_id != null) {
			setDept_id(dept_id);
		}

		String department = (String)attributes.get("department");

		if (department != null) {
			setDepartment(department);
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
	public int getDept_id() {
		return _dept_id;
	}

	@Override
	public void setDept_id(int dept_id) {
		_dept_id = dept_id;
	}

	@JSON
	@Override
	public String getDepartment() {
		if (_department == null) {
			return StringPool.BLANK;
		}
		else {
			return _department;
		}
	}

	@Override
	public void setDepartment(String department) {
		_department = department;
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
	public department toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (department)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		departmentImpl departmentImpl = new departmentImpl();

		departmentImpl.setDept_id(getDept_id());
		departmentImpl.setDepartment(getDepartment());
		departmentImpl.setBusiness_id(getBusiness_id());
		departmentImpl.setIsactive(getIsactive());

		departmentImpl.resetOriginalValues();

		return departmentImpl;
	}

	@Override
	public int compareTo(department department) {
		int primaryKey = department.getPrimaryKey();

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

		if (!(obj instanceof department)) {
			return false;
		}

		department department = (department)obj;

		int primaryKey = department.getPrimaryKey();

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
	public CacheModel<department> toCacheModel() {
		departmentCacheModel departmentCacheModel = new departmentCacheModel();

		departmentCacheModel.dept_id = getDept_id();

		departmentCacheModel.department = getDepartment();

		String department = departmentCacheModel.department;

		if ((department != null) && (department.length() == 0)) {
			departmentCacheModel.department = null;
		}

		departmentCacheModel.business_id = getBusiness_id();

		departmentCacheModel.isactive = getIsactive();

		return departmentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{dept_id=");
		sb.append(getDept_id());
		sb.append(", department=");
		sb.append(getDepartment());
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
		sb.append("userapi.model.department");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dept_id</column-name><column-value><![CDATA[");
		sb.append(getDept_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>department</column-name><column-value><![CDATA[");
		sb.append(getDepartment());
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

	private static final ClassLoader _classLoader = department.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			department.class
		};
	private int _dept_id;
	private String _department;
	private int _business_id;
	private int _isactive;
	private department _escapedModel;
}