/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.Calendar;
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
public class PECRatingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pecRatingEntityId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date deadline;

    @Enumerated(EnumType.STRING)
    private PECRatingStatusEnum status;

    @NotNull
    private boolean isEndorsed;

    @NotNull
    private boolean isReference;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date assignedDate;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSubmittedDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ProgressStatusEnum ratingStatus;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDraftSavedDateTime;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity rater;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private PECProgrammeInfoEntity pecProgrammeInfo;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private PECRatingDurationEntity pecRatingDuration;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private ChecklistEntity ratedPecChecklist;
    
    @OneToOne(optional = true)
    @JoinColumn(nullable = true)
    private FileEntity ratingReport;

    @NotNull
    private boolean isDeleted;

    private Long raterCycle;

    private Long pmCycle;

    public PECRatingEntity() {
    }

    public PECRatingEntity(UserEntity rater, PECProgrammeInfoEntity pecProgrammeInfo, PECRatingDurationEntity pecRatingDuration, ChecklistEntity ratedPecChecklist) {

        this.status = PECRatingStatusEnum.PENDING_RATING;
        this.assignedDate = new Date();
        this.lastSubmittedDate = new Date();
        this.deadline = getRatingDeadLine(pecRatingDuration.getPecRatingDurationInDays());
        this.rater = rater;
        this.pecProgrammeInfo = pecProgrammeInfo;
        this.pecRatingDuration = pecRatingDuration;
        this.ratedPecChecklist = ratedPecChecklist;
        this.isEndorsed = false;
        this.isReference = false;
        this.ratingStatus = ProgressStatusEnum.DRAFT;
        this.lastDraftSavedDateTime = new Date();
        this.raterCycle = pecProgrammeInfo.getRaterTotalCycle();
        this.pmCycle = pecProgrammeInfo.getPmTotalCycle();
    }

    public PECRatingEntity(UserEntity rater, PECProgrammeInfoEntity pecProgrammeInfo, PECRatingDurationEntity pecRatingDuration, ChecklistEntity ratedPecChecklist, Date ratingDeadline) {

        this.status = PECRatingStatusEnum.PENDING_RATING;
        this.assignedDate = new Date();
        this.lastSubmittedDate = new Date();
        this.deadline = ratingDeadline;
        this.rater = rater;
        this.pecProgrammeInfo = pecProgrammeInfo;
        this.pecRatingDuration = pecRatingDuration;
        this.ratedPecChecklist = ratedPecChecklist;
        this.isEndorsed = false;
        this.isReference = false;
        this.ratingStatus = ProgressStatusEnum.DRAFT;
        this.lastDraftSavedDateTime = new Date();
        this.raterCycle = pecProgrammeInfo.getRaterTotalCycle();
        this.pmCycle = pecProgrammeInfo.getPmTotalCycle();
    }

    public PECRatingEntity(Date deadline, PECRatingStatusEnum status, Date assignedDate, Date lastSubmittedDate, UserEntity rater, PECProgrammeInfoEntity pecProgrammeInfo, PECRatingDurationEntity pecRatingDuration, ChecklistEntity ratedPecChecklist) {
        this.deadline = deadline;
        this.status = status;
        this.assignedDate = assignedDate;
        this.lastSubmittedDate = lastSubmittedDate;
        this.rater = rater;
        this.pecProgrammeInfo = pecProgrammeInfo;
        this.pecRatingDuration = pecRatingDuration;
        this.ratedPecChecklist = ratedPecChecklist;
        this.isEndorsed = false;
        this.isReference = false;
        this.ratingStatus = ProgressStatusEnum.DRAFT;
        this.lastDraftSavedDateTime = new Date();
        this.raterCycle = pecProgrammeInfo.getRaterTotalCycle();
        this.pmCycle = pecProgrammeInfo.getPmTotalCycle();
    }

    public FileEntity getRatingReport() {
        return ratingReport;
    }

    public void setRatingReport(FileEntity ratingReport) {
        this.ratingReport = ratingReport;
    }
    
    public Long getRaterCycle() {
        return raterCycle;
    }

    public void setRaterCycle(Long raterCycle) {
        this.raterCycle = raterCycle;
    }

    public Long getPecRatingEntityId() {
        return pecRatingEntityId;
    }

    public void setPecRatingEntityId(Long pecRatingEntityId) {
        this.pecRatingEntityId = pecRatingEntityId;
    }

    public Long getPmCycle() {
        return pmCycle;
    }

    public void setPmCycle(Long pmCycle) {
        this.pmCycle = pmCycle;
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

    public boolean isIsEndorsed() {
        return isEndorsed;
    }

    public void setIsEndorsed(boolean isEndorsed) {
        this.isEndorsed = isEndorsed;
    }

    public boolean isIsReference() {
        return isReference;
    }

    public void setIsReference(boolean isReference) {
        this.isReference = isReference;
    }

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public Date getLastSubmittedDate() {
        return lastSubmittedDate;
    }

    public void setLastSubmittedDate(Date lastSubmittedDate) {
        this.lastSubmittedDate = lastSubmittedDate;
    }

    public UserEntity getRater() {
        return rater;
    }

    public void setRater(UserEntity rater) {
        this.rater = rater;
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

    public ChecklistEntity getRatedPecChecklist() {
        return ratedPecChecklist;
    }

    public void setRatedPecChecklist(ChecklistEntity ratedPecChecklist) {
        this.ratedPecChecklist = ratedPecChecklist;
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
        hash += (pecRatingEntityId != null ? pecRatingEntityId.hashCode() : 0);
        return hash;
    }

    private Date getRatingDeadLine(int nbDays) {
        String format = "MM/dd/yyyy";
        Date dateAsObj = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateAsObj);
        cal.add(Calendar.DATE, nbDays);
        Date dateAsObjAfterAMonth = cal.getTime();
        return dateAsObjAfterAMonth;

    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the pecRatingEntityId fields are not set
        if (!(object instanceof PECRatingEntity)) {
            return false;
        }
        PECRatingEntity other = (PECRatingEntity) object;
        if ((this.pecRatingEntityId == null && other.pecRatingEntityId != null) || (this.pecRatingEntityId != null && !this.pecRatingEntityId.equals(other.pecRatingEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.PECRatingEntity[ id=" + pecRatingEntityId + " ]";
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

}
