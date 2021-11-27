/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.Date;

/**
 *
 * @author nickg
 */
public class RunSessionsRatedWrapper {
    private Date runStartDate;
    private Integer numSessionRated;
    private Long agencyId;
    private String agencyName;

    public RunSessionsRatedWrapper() {
    }

    public RunSessionsRatedWrapper(Date runStartDate, Integer numSessionRated, Long agencyId, String agencyName) {
        this.runStartDate = runStartDate;
        this.numSessionRated = numSessionRated;
        this.agencyId = agencyId;
        this.agencyName = agencyName;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

 

    public Date getRunStartDate() {
        return runStartDate;
    }

    public void setRunStartDate(Date runStartDate) {
        this.runStartDate = runStartDate;
    }

    public Integer getNumSessionRated() {
        return numSessionRated;
    }

    public void setNumSessionRated(Integer numSessionRated) {
        this.numSessionRated = numSessionRated;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }
    
    
    
}
