/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

/**
 *
 * @author nickg
 */
@Entity
public class FCProgrammeInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fcProgrammeInfoEntityId;

    private String fcProgrammeName;

    @NotNull
    @Positive
    private Integer sessionsForProgramme;

    @NotNull
    @Positive
    private Integer sessionsToRate;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgProgrammeCompetenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgProgrammeAdherenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgProgrammeClientComplexity;

    @OneToMany
    @JoinTable(name = "listOfUserProgrammeRaters")
    private List<UserEntity> listOfProgrammeRaters;

    @OneToMany
    @JoinTable(name = "listOfUserProgrammePractitioners")
    private List<UserEntity> listOfProgrammePractitioners;

    @OneToMany
    @JoinTable(name = "listOfUserProgrammeSupervisors")
    private List<UserEntity> listOfProgrammeSupervisors;

    @ManyToMany(mappedBy = "listOfProgrammeInfo")
    private List<AgencyEntity> listOfAgencies;

    @OneToMany
    @JoinColumn(nullable = true)
    private List<RunEntity> listOfRuns;

    public FCProgrammeInfoEntity() {
        this.listOfAgencies = new ArrayList();
        this.listOfProgrammePractitioners = new ArrayList();
        this.listOfProgrammeRaters = new ArrayList();
        this.listOfProgrammeSupervisors = new ArrayList();
        this.listOfRuns = new ArrayList();
    }

    public FCProgrammeInfoEntity(String fcProgrammeName, Integer sessionsForProgramme, Integer sessionsToRate) {
        this();
        this.fcProgrammeName = fcProgrammeName;
        this.sessionsForProgramme = sessionsForProgramme;
        this.sessionsToRate = sessionsToRate;
        this.avgProgrammeAdherenceScore = 0.00;
        this.avgProgrammeClientComplexity = 0.00;
        this.avgProgrammeCompetenceScore = 0.00;
    }

    public FCProgrammeInfoEntity(String fcProgrammeName, Integer sessionsForProgramme, Integer sessionsToRate, List<UserEntity> listOfProgrammeRaters, List<UserEntity> listOfProgrammePractitioners, List<UserEntity> listOfProgrammeSupervisors) {
        this.fcProgrammeName = fcProgrammeName;
        this.sessionsForProgramme = sessionsForProgramme;
        this.sessionsToRate = sessionsToRate;
        this.listOfProgrammeRaters = listOfProgrammeRaters;
        this.listOfProgrammePractitioners = listOfProgrammePractitioners;
        this.listOfProgrammeSupervisors = listOfProgrammeSupervisors;
        this.avgProgrammeAdherenceScore = 0.00;
        this.avgProgrammeClientComplexity = 0.00;
        this.avgProgrammeCompetenceScore = 0.00;
    }

    public Long getFcProgrammeInfoEntityId() {
        return fcProgrammeInfoEntityId;
    }

    public void setFcProgrammeInfoEntityId(Long fcProgrammeInfoEntityId) {
        this.fcProgrammeInfoEntityId = fcProgrammeInfoEntityId;
    }

    public String getFcProgrammeName() {
        return fcProgrammeName;
    }

    public void setFcProgrammeName(String fcProgrammeName) {
        this.fcProgrammeName = fcProgrammeName;
    }

    public Integer getSessionsForProgramme() {
        return sessionsForProgramme;
    }

    public void setSessionsForProgramme(Integer sessionsForProgramme) {
        this.sessionsForProgramme = sessionsForProgramme;
    }

    public Integer getSessionsToRate() {
        return sessionsToRate;
    }

    public void setSessionsToRate(Integer sessionsToRate) {
        this.sessionsToRate = sessionsToRate;
    }

    public Double getAvgProgrammeCompetenceScore() {
        return avgProgrammeCompetenceScore;
    }

    public void setAvgProgrammeCompetenceScore(Double avgProgrammeCompetenceScore) {
        this.avgProgrammeCompetenceScore = avgProgrammeCompetenceScore;
    }

    public Double getAvgProgrammeAdherenceScore() {
        return avgProgrammeAdherenceScore;
    }

    public void setAvgProgrammeAdherenceScore(Double avgProgrammeAdherenceScore) {
        this.avgProgrammeAdherenceScore = avgProgrammeAdherenceScore;
    }

    public Double getAvgProgrammeClientComplexity() {
        return avgProgrammeClientComplexity;
    }

    public void setAvgProgrammeClientComplexity(Double avgProgrammeClientComplexity) {
        this.avgProgrammeClientComplexity = avgProgrammeClientComplexity;
    }

    public List<UserEntity> getListOfProgrammeRaters() {
        return listOfProgrammeRaters;
    }

    public void setListOfProgrammeRaters(List<UserEntity> listOfProgrammeRaters) {
        this.listOfProgrammeRaters = listOfProgrammeRaters;
    }

    public List<UserEntity> getListOfProgrammePractitioners() {
        return listOfProgrammePractitioners;
    }

    public void setListOfProgrammePractitioners(List<UserEntity> listOfProgrammePractitioners) {
        this.listOfProgrammePractitioners = listOfProgrammePractitioners;
    }

    public List<UserEntity> getListOfProgrammeSupervisors() {
        return listOfProgrammeSupervisors;
    }

    public void setListOfProgrammeSupervisors(List<UserEntity> listOfProgrammeSupervisors) {
        this.listOfProgrammeSupervisors = listOfProgrammeSupervisors;
    }

    public List<AgencyEntity> getListOfAgencies() {
        return listOfAgencies;
    }

    public void setListOfAgencies(List<AgencyEntity> listOfAgencies) {
        this.listOfAgencies = listOfAgencies;
    }

    public List<RunEntity> getListOfRuns() {
        return listOfRuns;
    }

    public void setListOfRuns(List<RunEntity> listOfRuns) {
        this.listOfRuns = listOfRuns;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fcProgrammeInfoEntityId != null ? fcProgrammeInfoEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the fcProgrammeInfoEntityId fields are not set
        if (!(object instanceof FCProgrammeInfoEntity)) {
            return false;
        }
        FCProgrammeInfoEntity other = (FCProgrammeInfoEntity) object;
        if ((this.fcProgrammeInfoEntityId == null && other.fcProgrammeInfoEntityId != null) || (this.fcProgrammeInfoEntityId != null && !this.fcProgrammeInfoEntityId.equals(other.fcProgrammeInfoEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.FCProgrammeInfoEntity[ id=" + fcProgrammeInfoEntityId + " ]";
    }

}
