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

import userapi.model.branch;
import userapi.model.branchModel;
import userapi.model.branchSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the branch service. Represents a row in the &quot;branch&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link branchModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link branchImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see branchImpl
 * @see branch
 * @see branchModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class branchModelImpl extends BaseModelImpl<branch>
	implements branchModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a branch model instance should use the {@link branch} interface instead.
	 */
	public static final String TABLE_NAME = "branch";
	public static final Object[][] TABLE_COLUMNS = {
			{ "branch_id", Types.INTEGER },
			{ "branch", Types.VARCHAR },
			{ "business_id", Types.INTEGER },
			{ "isactive", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("branch_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("branch", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("business_id", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("isactive", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table branch (branch_id INTEGER not null primary key,branch VARCHAR(75) null,business_id INTEGER,isactive INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table branch";
	public static final String ORDER_BY_JPQL = " ORDER BY branch.branch_id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY branch.branch_id ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.userapi.model.branch"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(userapi.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.userapi.model.branch"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static branch toModel(branchSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		branch model = new branchImpl();

		model.setBranch_id(soapModel.getBranch_id());
		model.setBranch(soapModel.getBranch());
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
	public static List<branch> toModels(branchSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<branch> models = new ArrayList<branch>(soapModels.length);

		for (branchSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(userapi.service.util.ServiceProps.get(
				"lock.expiration.time.userapi.model.branch"));

	public branchModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _branch_id;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setBranch_id(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _branch_id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return branch.class;
	}

	@Override
	public String getModelClassName() {
		return branch.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("branch_id", getBranch_id());
		attributes.put("branch", getBranch());
		attributes.put("business_id", getBusiness_id());
		attributes.put("isactive", getIsactive());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer branch_id = (Integer)attributes.get("branch_id");

		if (branch_id != null) {
			setBranch_id(branch_id);
		}

		String branch = (String)attributes.get("branch");

		if (branch != null) {
			setBranch(branch);
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
	public int getBranch_id() {
		return _branch_id;
	}

	@Override
	public void setBranch_id(int branch_id) {
		_branch_id = branch_id;
	}

	@JSON
	@Override
	public String getBranch() {
		if (_branch == null) {
			return StringPool.BLANK;
		}
		else {
			return _branch;
		}
	}

	@Override
	public void setBranch(String branch) {
		_branch = branch;
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
	public branch toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (branch)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		branchImpl branchImpl = new branchImpl();

		branchImpl.setBranch_id(getBranch_id());
		branchImpl.setBranch(getBranch());
		branchImpl.setBusiness_id(getBusiness_id());
		branchImpl.setIsactive(getIsactive());

		branchImpl.resetOriginalValues();

		return branchImpl;
	}

	@Override
	public int compareTo(branch branch) {
		int primaryKey = branch.getPrimaryKey();

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

		if (!(obj instanceof branch)) {
			return false;
		}

		branch branch = (branch)obj;

		int primaryKey = branch.getPrimaryKey();

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
	public CacheModel<branch> toCacheModel() {
		branchCacheModel branchCacheModel = new branchCacheModel();

		branchCacheModel.branch_id = getBranch_id();

		branchCacheModel.branch = getBranch();

		String branch = branchCacheModel.branch;

		if ((branch != null) && (branch.length() == 0)) {
			branchCacheModel.branch = null;
		}

		branchCacheModel.business_id = getBusiness_id();

		branchCacheModel.isactive = getIsactive();

		return branchCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{branch_id=");
		sb.append(getBranch_id());
		sb.append(", branch=");
		sb.append(getBranch());
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
		sb.append("userapi.model.branch");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>branch_id</column-name><column-value><![CDATA[");
		sb.append(getBranch_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>branch</column-name><column-value><![CDATA[");
		sb.append(getBranch());
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

	private static final ClassLoader _classLoader = branch.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			branch.class
		};
	private int _branch_id;
	private String _branch;
	private int _business_id;
	private int _isactive;
	private branch _escapedModel;
}