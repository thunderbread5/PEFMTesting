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
public class PractitionerDashboardAvgOvertimeWrapper {
    private Long programmeId;
    private String programmeName;
    private Double progAvgCompetency;
    private Double progAvgAdherence;
    private Integer month;

    public PractitionerDashboardAvgOvertimeWrapper() {
    }

    public PractitionerDashboardAvgOvertimeWrapper(Long programmeId, String programmeName, Double progAvgCompetency, Double progAvgAdherence, Integer month) {
        this.programmeId = programmeId;
        this.programmeName = programmeName;
        this.progAvgCompetency = progAvgCompetency;
        this.progAvgAdherence = progAvgAdherence;
        this.month = month;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    

    public Long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Long programmeId) {
        this.programmeId = programmeId;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public Double getProgAvgCompetency() {
        return progAvgCompetency;
    }

    public void setProgAvgCompetency(Double progAvgCompetency) {
        this.progAvgCompetency = progAvgCompetency;
    }

    public Double getProgAvgAdherence() {
        return progAvgAdherence;
    }

    public void setProgAvgAdherence(Double progAvgAdherence) {
        this.progAvgAdherence = progAvgAdherence;
    }
    
}
