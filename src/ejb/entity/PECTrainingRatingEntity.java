/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import util.enumeration.PECRatingStatusEnum;
import util.enumeration.ProgressStatusEnum;

/**
 *
 * @author nickg
 */
@Entity
public class PECTrainingRatingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pecTrainingRatingEntityId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date deadline;

    @Enumerated(EnumType.STRING)
    private PECRatingStatusEnum status;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date submittedDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ProgressStatusEnum ratingStatus;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDraftSavedDateTime;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private PECProgrammeInfoEntity pecProgrammeInfo;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private PECRatingDurationEntity pecRatingDuration;
    
    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity traineeRater;

    public PECTrainingRatingEntity() {
    }

    public PECTrainingRatingEntity(Date deadline, PECRatingStatusEnum status, Date submittedDate, PECProgrammeInfoEntity pecProgrammeInfo, PECRatingDurationEntity pecRatingDuration,
            UserEntity traineeRater) {
        this.deadline = deadline;
        this.status = status;
        this.submittedDate = submittedDate;
        this.pecProgrammeInfo = pecProgrammeInfo;
        this.pecRatingDuration = pecRatingDuration;
        this.traineeRater = traineeRater;
        this.ratingStatus = ProgressStatusEnum.DRAFT;
        this.lastDraftSavedDateTime = new Date();
    }

    public Long getPecTrainingRatingEntityId() {
        return pecTrainingRatingEntityId;
    }

    public void setPecTrainingRatingEntityId(Long pecTrainingRatingEntityId) {
        this.pecTrainingRatingEntityId = pecTrainingRatingEntityId;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public PECRatingStatusEnum getStatus() {
        return status;
    }

    public void setStatus(PECRatingStatusEnum status) {
        this.status = status;
    }

    public Date getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    public PECProgrammeInfoEntity getPecProgrammeInfo() {
        return pecProgrammeInfo;
    }

    public void setPecProgrammeInfo(PECProgrammeInfoEntity pecProgrammeInfo) {
        this.pecProgrammeInfo = pecProgrammeInfo;
    }

    public PECRatingDurationEntity getPecRatingDuration() {
        return pecRatingDuration;
    }

    public void setPecRatingDuration(PECRatingDurationEntity pecRatingDuration) {
        this.pecRatingDuration = pecRatingDuration;
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

    public UserEntity getTraineeRater() {
        return traineeRater;
    }

    public void setTraineeRater(UserEntity traineeRater) {
        this.traineeRater = traineeRater;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecTrainingRatingEntityId != null ? pecTrainingRatingEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the pecTrainingRatingEntityId fields are not set
        if (!(object instanceof PECTrainingRatingEntity)) {
            return false;
        }
        PECTrainingRatingEntity other = (PECTrainingRatingEntity) object;
        if ((this.pecTrainingRatingEntityId == null && other.pecTrainingRatingEntityId != null) || (this.pecTrainingRatingEntityId != null && !this.pecTrainingRatingEntityId.equals(other.pecTrainingRatingEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.PECTrainingRatingEntity[ id=" + pecTrainingRatingEntityId + " ]";
    }

}
