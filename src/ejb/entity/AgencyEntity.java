/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nickg
 */
@Entity
public class AgencyEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agencyEntityId;

    @NotNull
    private String agencyName;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgAgencyCompetenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgAgencyAdherenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgAgencyClientComplexityScore;

    @NotNull
    private boolean isDisabled;

    @NotNull
    private boolean isDeleted;

    @OneToMany
    @JoinColumn(nullable = true)
    //@JoinTable(name = "listOfAgencyPractitioners")
    private List<UserEntity> listOfAgencyPractitioners;

    @OneToMany
    @JoinColumn(nullable = true)
    //@JoinTable(name = "listOfAgencySupervisors")
    private List<UserEntity> listOfAgencySupervisors;

    @OneToMany
    @JoinColumn(nullable = true)
    //@JoinTable(name = "listOfAgencyAdministrator")
    private List<UserEntity> listOfAgencyAdministrator;

    @ManyToMany
    private List<FCProgrammeInfoEntity> listOfProgrammeInfo;

    @OneToMany(mappedBy = "agency")
    private List<RunEntity> listOfRuns;

    public AgencyEntity() {
        this.listOfAgencyPractitioners = new ArrayList();
        this.listOfAgencySupervisors = new ArrayList();
        this.listOfRuns = new ArrayList<>();
        this.listOfProgrammeInfo = new ArrayList();
    }

    public AgencyEntity(String agencyName, List<UserEntity> listOfAgencyAdministrator) {
        this();
        this.agencyName = agencyName;
        this.listOfAgencyPractitioners = new ArrayList();
        this.listOfAgencySupervisors = new ArrayList();
        this.listOfAgencyAdministrator = listOfAgencyAdministrator;
        this.dateCreated = new Date();
        this.avgAgencyAdherenceScore = 0.00;
        this.avgAgencyClientComplexityScore = 0.00;
        this.avgAgencyCompetenceScore = 0.00;
        this.isDeleted = false;
        this.isDisabled = false;
    }

    public AgencyEntity(String agencyName, List<UserEntity> listOfAgencyPractitioners, List<UserEntity> listOfAgencySupervisors, List<UserEntity> listOfAgencyAdministrator) {
        this.agencyName = agencyName;
        this.listOfAgencyPractitioners = listOfAgencyPractitioners;
        this.listOfAgencySupervisors = listOfAgencySupervisors;
        this.listOfAgencyAdministrator = listOfAgencyAdministrator;
        this.dateCreated = new Date();
        this.avgAgencyAdherenceScore = 0.00;
        this.avgAgencyClientComplexityScore = 0.00;
        this.avgAgencyCompetenceScore = 0.00;
        this.isDeleted = false;
        this.isDisabled = false;
    }

    public Long getAgencyEntityId() {
        return agencyEntityId;
    }

    public void setAgencyEntityId(Long agencyEntityId) {
        this.agencyEntityId = agencyEntityId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Double getAvgAgencyCompetenceScore() {
        return avgAgencyCompetenceScore;
    }

    public void setAvgAgencyCompetenceScore(Double avgAgencyCompetenceScore) {
        this.avgAgencyCompetenceScore = avgAgencyCompetenceScore;
    }

    public Double getAvgAgencyAdherenceScore() {
        return avgAgencyAdherenceScore;
    }

    public void setAvgAgencyAdherenceScore(Double avgAgencyAdherenceScore) {
        this.avgAgencyAdherenceScore = avgAgencyAdherenceScore;
    }

    public Double getAvgAgencyClientComplexityScore() {
        return avgAgencyClientComplexityScore;
    }

    public void setAvgAgencyClientComplexityScore(Double avgAgencyClientComplexityScore) {
        this.avgAgencyClientComplexityScore = avgAgencyClientComplexityScore;
    }

    public boolean isIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public List<UserEntity> getListOfAgencyPractitioners() {
        return listOfAgencyPractitioners;
    }

    public void setListOfAgencyPractitioners(List<UserEntity> listOfAgencyPractitioners) {
        this.listOfAgencyPractitioners = listOfAgencyPractitioners;
    }

    public List<UserEntity> getListOfAgencySupervisors() {
        return listOfAgencySupervisors;
    }

    public void setListOfAgencySupervisors(List<UserEntity> listOfAgencySupervisors) {
        this.listOfAgencySupervisors = listOfAgencySupervisors;
    }

    public List<UserEntity> getListOfAgencyAdministrator() {
        return listOfAgencyAdministrator;
    }

    public void setListOfAgencyAdministrator(List<UserEntity> agencyAdministrator) {
        this.listOfAgencyAdministrator = agencyAdministrator;
    }

    public List<FCProgrammeInfoEntity> getListOfProgrammeInfo() {
        return listOfProgrammeInfo;
    }

    public void setListOfProgrammeInfo(List<FCProgrammeInfoEntity> listOfProgrammeInfo) {
        this.listOfProgrammeInfo = listOfProgrammeInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agencyEntityId != null ? agencyEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the agencyEntityId fields are not set
        if (!(object instanceof AgencyEntity)) {
            return false;
        }
        AgencyEntity other = (AgencyEntity) object;
        if ((this.agencyEntityId == null && other.agencyEntityId != null) || (this.agencyEntityId != null && !this.agencyEntityId.equals(other.agencyEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.AgencyEntity[ id=" + agencyEntityId + " ]";
    }

    public List<RunEntity> getListOfRuns() {
        return listOfRuns;
    }

    public void setListOfRuns(List<RunEntity> listOfRuns) {
        this.listOfRuns = listOfRuns;
    }

}
