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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import util.enumeration.ProgressStatusEnum;

/**
 *
 * @author nickg
 */
@Entity
public class FCRatingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fcRatingEntityId;

    @NotNull
    private String fcRatingName;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double competenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double adherenceScore;

    @NotNull
    @Column(nullable = false)
    private Integer clientComplexity;

    @ManyToOne
    @JoinColumn(nullable = false)
    private RunEntity run;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity rater;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private ChecklistEntity ratedFCChecklist;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ProgressStatusEnum ratingStatus;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDraftSavedDateTime;
    
    @OneToOne(optional = false)
    private UserEntity practitionerRated;
    
    @NotNull
    private boolean isDeleted;
    
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date sessionDate;

    public FCRatingEntity() {
    }

    public FCRatingEntity(String fcRatingName, Double competenceScore, Double adherenceScore, Integer clientComplexity, RunEntity run, UserEntity rater, ChecklistEntity ratedFCChecklist, UserEntity practitioner, Date sessionDate) {
        this.fcRatingName = fcRatingName;
        this.competenceScore = competenceScore;
        this.adherenceScore = adherenceScore;
        this.clientComplexity = clientComplexity;
        this.run = run;
        this.rater = rater;
        this.ratedFCChecklist = ratedFCChecklist;
        this.dateCreated = new Date();
        this.ratingStatus = ProgressStatusEnum.DRAFT;
        this.lastDraftSavedDateTime = new Date();
        this.practitionerRated = practitioner;
        this.sessionDate = sessionDate;
    }

    public FCRatingEntity(String fcRatingName, Double competenceScore, Double adherenceScore, Integer clientComplexity, RunEntity run, UserEntity rater, ChecklistEntity ratedFCChecklist, ProgressStatusEnum ratingStatus, UserEntity practitioner, Date sessionDate) {
        this.fcRatingName = fcRatingName;
        this.competenceScore = competenceScore;
        this.adherenceScore = adherenceScore;
        this.clientComplexity = clientComplexity;
        this.run = run;
        this.rater = rater;
        this.ratedFCChecklist = ratedFCChecklist;
        this.ratingStatus = ratingStatus;
        this.practitionerRated = practitioner;
        this.isDeleted = false;
        this.dateCreated = new Date();
        this.lastDraftSavedDateTime = new Date();
        this.sessionDate = sessionDate;
    }

    public Long getFCRatingEntityId() {
        return fcRatingEntityId;
    }

    public void setFCRatingEntityId(Long fcRatingEntityId) {
        this.fcRatingEntityId = fcRatingEntityId;
    }

    public String getFCRatingName() {
        return fcRatingName;
    }

    public void setFCRatingName(String fcRatingName) {
        this.fcRatingName = fcRatingName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Double getCompetenceScore() {
        return competenceScore;
    }

    public void setCompetenceScore(Double competenceScore) {
        this.competenceScore = competenceScore;
    }

    public Double getAdherenceScore() {
        return adherenceScore;
    }

    public void setAdherenceScore(Double adherenceScore) {
        this.adherenceScore = adherenceScore;
    }

    public Integer getClientComplexity() {
        return clientComplexity;
    }

    public void setClientComplexity(Integer clientComplexity) {
        this.clientComplexity = clientComplexity;
    }

  
    public RunEntity getRun() {
        return run;
    }

    public void setRun(RunEntity run) {
        this.run = run;
    }

    public UserEntity getRater() {
        return rater;
    }

    public void setRater(UserEntity rater) {
        this.rater = rater;
    }

    public ChecklistEntity getRatedFCChecklist() {
        return ratedFCChecklist;
    }

    public void setRatedFCChecklist(ChecklistEntity ratedFCChecklist) {
        this.ratedFCChecklist = ratedFCChecklist;
    }

    public ProgressStatusEnum getRatingStatus() {
        return ratingStatus;
    }

    public void setRatingStatus(ProgressStatusEnum ratingStatus) {
        this.ratingStatus = ratingStatus;
    }

    public Date getLastDraftSavedDateTime() {
        return lastDraftSavedDateTime;
    }

    public void setLastDraftSavedDateTime(Date lastDraftSavedDateTime) {
        this.lastDraftSavedDateTime = lastDraftSavedDateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fcRatingEntityId != null ? fcRatingEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the fcRatingEntityId fields are not set
        if (!(object instanceof FCRatingEntity)) {
            return false;
        }
        FCRatingEntity other = (FCRatingEntity) object;
        if ((this.fcRatingEntityId == null && other.fcRatingEntityId != null) || (this.fcRatingEntityId != null && !this.fcRatingEntityId.equals(other.fcRatingEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.FCRatingEntity[ id=" + fcRatingEntityId + " ]";
    }

    /**
     * @return the isDeleted
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * @param isDeleted the isDeleted to set
     */
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * @return the practitionerRated
     */
    public UserEntity getPractitionerRated() {
        return practitionerRated;
    }

    /**
     * @param practitionerRated the practitionerRated to set
     */
    public void setPractitionerRated(UserEntity practitionerRated) {
        this.practitionerRated = practitionerRated;
    }

    /**
     * @return the sessionDate
     */
    public Date getSessionDate() {
        return sessionDate;
    }

    /**
     * @param sessionDate the sessionDate to set
     */
    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

}
