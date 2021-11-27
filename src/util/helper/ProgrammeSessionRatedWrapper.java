/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nickg
 */
public class ProgrammeSessionRatedWrapper {

    private String programmeName;
    private Integer totalNumSessions;
    private Integer numSessionPlannedForRating;
    private Date runStartDate;
    private Integer numSessionRated;
    private Long agencyId;
    private String agencyName;
    private double fidelityMonitoringProgress;

    public ProgrammeSessionRatedWrapper() {
    }

    public ProgrammeSessionRatedWrapper(String programmeName, Integer totalNumSessions, Integer numSessionPlannedForRating, Date runStartDate, Integer numSessionRated, Long agencyId, String agencyName, double fidelityMonitoringProgress) {
        this.programmeName = programmeName;
        this.totalNumSessions = totalNumSessions;
        this.numSessionPlannedForRating = numSessionPlannedForRating;
        this.runStartDate = runStartDate;
        this.numSessionRated = numSessionRated;
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.fidelityMonitoringProgress = fidelityMonitoringProgress;
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

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public Integer getTotalNumSessions() {
        return totalNumSessions;
    }

    public void setTotalNumSessions(Integer totalNumSessions) {
        this.totalNumSessions = totalNumSessions;
    }

    public Integer getNumSessionPlannedForRating() {
        return numSessionPlannedForRating;
    }

    public void setNumSessionPlannedForRating(Integer numSessionPlannedForRating) {
        this.numSessionPlannedForRating = numSessionPlannedForRating;
    }

    public double getFidelityMonitoringProgress() {
        return fidelityMonitoringProgress;
    }

    public void setFidelityMonitoringProgress(double fidelityMonitoringProgress) {
        this.fidelityMonitoringProgress = fidelityMonitoringProgress;
    }

}
