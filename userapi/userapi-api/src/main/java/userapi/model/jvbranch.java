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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the jvbranch service. Represents a row in the &quot;jvbranch&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see jvbranchModel
 * @see userapi.model.impl.jvbranchImpl
 * @see userapi.model.impl.jvbranchModelImpl
 * @generated
 */
@ImplementationClassName("userapi.model.impl.jvbranchImpl")
@ProviderType
public interface jvbranch extends jvbranchModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link userapi.model.impl.jvbranchImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<jvbranch, Integer> JVBRANCH_ID_ACCESSOR = new Accessor<jvbranch, Integer>() {
			@Override
			public Integer get(jvbranch jvbranch) {
				return jvbranch.getJvbranch_id();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<jvbranch> getTypeClass() {
				return jvbranch.class;
			}
		};
}