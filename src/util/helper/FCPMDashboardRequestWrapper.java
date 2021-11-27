/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.Date;
import java.util.List;

/**
 *
 * @author rayta
 */
public class FCPMDashboardRequestWrapper {

    private Date startDate;
    private Date endDate;
    private Long pmId;
    private Long[] programmeIds;
    private Long[] agencyIds;
    private Long versionNumber;

    public FCPMDashboardRequestWrapper() {
    }

    public FCPMDashboardRequestWrapper(Date startDate, Date endDate, Long pmId, Long[] programmeIds, Long[] agencyIds, Long versionNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.pmId = pmId;
        this.programmeIds = programmeIds;
        this.agencyIds = agencyIds;
        this.versionNumber = versionNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }

    public Long[] getProgrammeIds() {
        return programmeIds;
    }

    public void setProgrammeIds(Long[] programmeIds) {
        this.programmeIds = programmeIds;
    }

    public Long[] getAgencyIds() {
        return agencyIds;
    }

    public void setAgencyIds(Long[] agencyIds) {
        this.agencyIds = agencyIds;
    }

    public Long getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

   
}
