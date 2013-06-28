package org.openmrs.module.reporting.cohort.definition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openmrs.Program;
import org.openmrs.module.reporting.common.Localized;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;
import org.openmrs.module.reporting.definition.configuration.ConfigurationPropertyCachingStrategy;
import org.openmrs.module.reporting.evaluation.caching.Caching;

/**
 * Query for whether the patient was in a program on a date or date range
 * (Using onDate is equivalent to setting onOrAfter==onOrBefore, but may be more efficient and readable
 */
@Caching(strategy=ConfigurationPropertyCachingStrategy.class)
@Localized("reporting.InProgramCohortDefinition")
public class InProgramCohortDefinition extends BaseCohortDefinition {

	public static final long serialVersionUID = 1L;

	@ConfigurationProperty(required=true, group="programsGroup")
	private List<Program> programs;
	
	@ConfigurationProperty(group="dateRangeGroup")
	private Date onOrAfter;

	@ConfigurationProperty(group="dateRangeGroup")
	private Date onOrBefore;

	@ConfigurationProperty(group="onDateGroup")
	private Date onDate;

	/**
	 * Default constructor
	 */
	public InProgramCohortDefinition() { }
	
    /**
     * @return the programs
     */
    public List<Program> getPrograms() {
    	return programs;
    }

    /**
     * @param programs the programs to set
     */
    public void setPrograms(List<Program> programs) {
    	this.programs = programs;
    }
    
    /**
     * @param program the program to add
     */
    public void addProgram(Program program) {
    	if (programs == null) {
    		programs = new ArrayList<Program>();
    	}
    	programs.add(program);
    }
	
    /**
     * @return the onOrAfter
     */
    public Date getOnOrAfter() {
    	return onOrAfter;
    }
	
    /**
     * @param onOrAfter the onOrAfter to set
     */
    public void setOnOrAfter(Date onOrAfter) {
    	this.onOrAfter = onOrAfter;
    }
	
    /**
     * @return the onOrBefore
     */
    public Date getOnOrBefore() {
    	return onOrBefore;
    }
	
    /**
     * @param onOrBefore the onOrBefore to set
     */
    public void setOnOrBefore(Date onOrBefore) {
    	this.onOrBefore = onOrBefore;
    }
	
    /**
     * @return the onDate
     */
    public Date getOnDate() {
    	return onDate;
    }
	
    /**
     * @param onDate the onDate to set
     */
    public void setOnDate(Date onDate) {
    	this.onDate = onDate;
    }
}
