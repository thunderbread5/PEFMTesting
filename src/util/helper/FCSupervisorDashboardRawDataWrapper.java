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
public class FCSupervisorDashboardRawDataWrapper {

    private Long ratingId;
    private String ratingName;
    private Date sessionDate;
    private Long programmeId;
    private String programmeName;
    private Long userId;
    private String userFullname;
    private Long agencyId;
    private String agencyName;

    private List<FCIndividualCompetencyItemWrapper> listOfIndividualCompetenceScores;

    public FCSupervisorDashboardRawDataWrapper() {
    }

    public FCSupervisorDashboardRawDataWrapper(Long ratingId, String ratingName, Date sessionDate, Long programmeId, String programmeName, Long userId, String userFullname, Long agencyId, String agencyName, List<FCIndividualCompetencyItemWrapper> listOfIndividualCompetenceScores) {
        this.ratingId = ratingId;
        this.ratingName = ratingName;
        this.sessionDate = sessionDate;
        this.programmeId = programmeId;
        this.programmeName = programmeName;
        this.userId = userId;
        this.userFullname = userFullname;
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.listOfIndividualCompetenceScores = listOfIndividualCompetenceScores;
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

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public String getRatingName() {
        return ratingName;
    }

    public void setRatingName(String ratingName) {
        this.ratingName = ratingName;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public List<FCIndividualCompetencyItemWrapper> getListOfIndividualCompetenceScores() {
        return listOfIndividualCompetenceScores;
    }

    public void setListOfIndividualCompetenceScores(List<FCIndividualCompetencyItemWrapper> listOfIndividualCompetenceScores) {
        this.listOfIndividualCompetenceScores = listOfIndividualCompetenceScores;
    }

}
