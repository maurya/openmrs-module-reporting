/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.data.person.definition;

import org.openmrs.module.reporting.common.Localized;
import org.openmrs.module.reporting.common.VitalStatus;
import org.openmrs.module.reporting.data.BaseDataDefinition;
import org.openmrs.module.reporting.data.DataDefinition;
import org.openmrs.module.reporting.definition.configuration.ConfigurationPropertyCachingStrategy;
import org.openmrs.module.reporting.evaluation.caching.Caching;

/**
 * Vital Status Data
 */
@Caching(strategy=ConfigurationPropertyCachingStrategy.class)
@Localized("reporting.VitalStatusDataDefinition")
public class VitalStatusDataDefinition  extends BaseDataDefinition implements PersonDataDefinition {
	
	public static final long serialVersionUID = 1L;
	
	/**
	 * Default Constructor
	 */
	public VitalStatusDataDefinition() {
		super();
	}
	
	/**
	 * Constructor to populate name only
	 */
	public VitalStatusDataDefinition(String name) {
		super(name);
	}

	//***** INSTANCE METHODS *****
	
	/** 
	 * @see DataDefinition#getDataType()
	 */
	public Class<?> getDataType() {
		return VitalStatus.class;
	}
}