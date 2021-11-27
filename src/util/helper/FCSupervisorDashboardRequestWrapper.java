/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.Date;

/**
 *
 * @author rayta
 */
public class FCSupervisorDashboardRequestWrapper {

    private Date startDate;
    private Date endDate;
    private Long supervisorId;
    private Long[] practitionerIds;

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

    public Long getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Long supervisorId) {
        this.supervisorId = supervisorId;
    }

    public Long[] getPractitionerIds() {
        return practitionerIds;
    }

    public void setPractitionerIds(Long[] practitionerIds) {
        this.practitionerIds = practitionerIds;
    }

    public Long getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    public FCSupervisorDashboardRequestWrapper(Date startDate, Date endDate, Long supervisorId, Long[] practitionerIds, Long versionNumber) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.supervisorId = supervisorId;
        this.practitionerIds = practitionerIds;
        this.versionNumber = versionNumber;
    }

    public FCSupervisorDashboardRequestWrapper() {
    }
    private Long versionNumber;
}
