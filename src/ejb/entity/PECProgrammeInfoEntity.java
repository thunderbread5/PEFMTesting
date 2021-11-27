/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import util.enumeration.PECProgrammeTierEnum;
import util.enumeration.ProgressStatusEnum;

/**
 *
 * @author nickg
 */
@Entity
public class PECProgrammeInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pecProgrammeInfoEntityId;

    private String pecProgrammeName;

    @Temporal(TemporalType.DATE)
    private Date endorsementRatingDeadline;

    @Enumerated(EnumType.STRING)
    private PECProgrammeTierEnum programmeTier;

    @Enumerated(EnumType.STRING)
    private PECProgrammeTierEnum newProgrammeTier;

    @NotNull
    private boolean isNewProgramme;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ProgressStatusEnum programmeStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDraftSavedDateTime;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private DivisionEntity division;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private PECFrequencyReviewEntity programmeFrequency;

    @OneToOne(optional = true)
    private PECFrequencyReviewEntity newProgrammeFrequency;
    //optional
    @OneToMany(mappedBy = "pecProgrammeInfo")
    private List<PECRatingEntity> listOfRatings;

    //optional
//    @OneToMany(mappedBy = "listOfTrainingRatings")
//    private List<PECTrainingRatingEntity> listOfTrainingRatings;
    @OneToOne
    private ChecklistEntity checklistTemplate;

    @OneToOne
    private ChecklistEntity prevChecklistTemplate;

    private Long raterTotalCycle;
    
    private Long pmTotalCycle;

    @Temporal(TemporalType.DATE)
    private Date lastReviewDate;

    public PECProgrammeInfoEntity() {
        this.listOfRatings = new ArrayList();
        // this.listOfTrainingRatings = new ArrayList();
        this.checklistTemplate = null;
        prevChecklistTemplate = null;
        this.lastReviewDate = new Date();
        this.newProgrammeFrequency = null;
        this.raterTotalCycle = 0L;
        this.pmTotalCycle = 0L;
    }

    public PECProgrammeInfoEntity(String pecProgrammeName, Date endorsementRatingDeadline, PECProgrammeTierEnum programmeTier, boolean isNewProgramme, ProgressStatusEnum programmeStatus, Date lastDraftSavedDateTime, DivisionEntity division, PECFrequencyReviewEntity programmeFrequency) {
        this();
        this.pecProgrammeName = pecProgrammeName;
        this.endorsementRatingDeadline = this.getEndorsementDate(programmeFrequency.getFrequencyMonth());
        this.programmeTier = programmeTier;
        this.isNewProgramme = isNewProgramme;
        this.programmeStatus = programmeStatus;
        this.lastDraftSavedDateTime = lastDraftSavedDateTime;
        this.division = division;
        this.programmeFrequency = programmeFrequency;
        this.raterTotalCycle = 0L;
        this.pmTotalCycle = 0L;
    }

    public PECProgrammeInfoEntity(String pecProgrammeName, Date endorsementRatingDeadline, PECProgrammeTierEnum programmeTier, boolean isNewProgramme, DivisionEntity division, PECFrequencyReviewEntity programmeFrequency, List<PECRatingEntity> listOfRatings, List<PECTrainingRatingEntity> listOfTrainingRatings) {
        this.pecProgrammeName = pecProgrammeName;
        this.endorsementRatingDeadline = this.getEndorsementDate(programmeFrequency.getFrequencyMonth());
        this.programmeTier = programmeTier;
        this.isNewProgramme = isNewProgramme;
        this.division = division;
        this.programmeFrequency = programmeFrequency;
        this.listOfRatings = listOfRatings;
        // this.listOfTrainingRatings = listOfTrainingRatings;
        this.programmeStatus = ProgressStatusEnum.DRAFT;
        this.lastDraftSavedDateTime = new Date();
        this.checklistTemplate = null;
        this.prevChecklistTemplate = null;
        this.lastReviewDate = new Date();
        this.newProgrammeFrequency = null;
        this.raterTotalCycle = 0L;
        this.pmTotalCycle = 0L;
    }

    public PECProgrammeTierEnum getNewProgrammeTier() {
        return newProgrammeTier;
    }

    public void setNewProgrammeTier(PECProgrammeTierEnum newProgrammeTier) {
        this.newProgrammeTier = newProgrammeTier;
    }

    public Long getPmTotalCycle() {
        return pmTotalCycle;
    }

    public void setPmTotalCycle(Long pmTotalCycle) {
        this.pmTotalCycle = pmTotalCycle;
    }
    

    public PECFrequencyReviewEntity getNewProgrammeFrequency() {
        return newProgrammeFrequency;
    }

    public void setNewProgrammeFrequency(PECFrequencyReviewEntity newProgrammeFrequency) {
        this.newProgrammeFrequency = newProgrammeFrequency;
    }

    public Long getRaterTotalCycle() {
        return raterTotalCycle;
    }

    public void setRaterTotalCycle(Long raterTotalCycle) {
        this.raterTotalCycle = raterTotalCycle;
    }

    public Long getPecProgrammeInfoEntityId() {
        return pecProgrammeInfoEntityId;
    }

    public void setPecProgrammeInfoEntityId(Long pecProgrammeInfoEntityId) {
        this.pecProgrammeInfoEntityId = pecProgrammeInfoEntityId;
    }

    public Date getLastReviewDate() {
        return lastReviewDate;
    }

    public void setLastReviewDate(Date lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public String getPecProgrammeName() {
        return pecProgrammeName;
    }

    public void setPecProgrammeName(String pecProgrammeName) {
        this.pecProgrammeName = pecProgrammeName;
    }

    public Date getEndorsementRatingDeadline() {
        return endorsementRatingDeadline;
    }

    public void setEndorsementRatingDeadline(Date endorsementRatingDeadline) {
        this.endorsementRatingDeadline = endorsementRatingDeadline;
    }

    public PECProgrammeTierEnum getProgrammeTier() {
        return programmeTier;
    }

    public void setProgrammeTier(PECProgrammeTierEnum programmeTier) {
        this.programmeTier = programmeTier;
    }

    public boolean isIsNewProgramme() {
        return isNewProgramme;
    }

    public void setIsNewProgramme(boolean isNewProgramme) {
        this.isNewProgramme = isNewProgramme;
    }

    public DivisionEntity getDivision() {
        return division;
    }

    public void setDivision(DivisionEntity division) {
        this.division = division;
    }

    public PECFrequencyReviewEntity getProgrammeFrequency() {
        return programmeFrequency;
    }

    public void setProgrammeFrequency(PECFrequencyReviewEntity programmeFrequency) {
        this.programmeFrequency = programmeFrequency;
    }

    public List<PECRatingEntity> getListOfRatings() {
        return listOfRatings;
    }

    public void setListOfRatings(List<PECRatingEntity> listOfRatings) {
        this.listOfRatings = listOfRatings;
    }

//    public List<PECTrainingRatingEntity> getListOfTrainingRatings() {
//        return listOfTrainingRatings;
//    }
//
//    public void setListOfTrainingRatings(List<PECTrainingRatingEntity> listOfTrainingRatings) {
//        this.listOfTrainingRatings = listOfTrainingRatings;
//    }
    public ProgressStatusEnum getProgrammeStatus() {
        return programmeStatus;
    }

    public void setProgrammeStatus(ProgressStatusEnum programmeStatus) {
        this.programmeStatus = programmeStatus;
    }

    public Date getLastDraftSavedDateTime() {
        return lastDraftSavedDateTime;
    }

    public void setLastDraftSavedDateTime(Date lastDraftSavedDateTime) {
        this.lastDraftSavedDateTime = lastDraftSavedDateTime;
    }

    public ChecklistEntity getChecklistTemplate() {
        return checklistTemplate;
    }

    public void setChecklistTemplate(ChecklistEntity checklistTemplate) {
        this.checklistTemplate = checklistTemplate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    private Date getEndorsementDate(int nbMonths) {
        String format = "MM/dd/yyyy";
        Date dateAsObj = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateAsObj);
        cal.add(Calendar.MONTH, nbMonths);
        Date dateAsObjAfterAMonth = cal.getTime();
        return dateAsObjAfterAMonth;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PECProgrammeInfoEntity other = (PECProgrammeInfoEntity) obj;
        if (this.isNewProgramme != other.isNewProgramme) {
            return false;
        }
        if (!Objects.equals(this.pecProgrammeName, other.pecProgrammeName)) {
            return false;
        }
        if (!Objects.equals(this.pecProgrammeInfoEntityId, other.pecProgrammeInfoEntityId)) {
            return false;
        }
        if (!Objects.equals(this.endorsementRatingDeadline, other.endorsementRatingDeadline)) {
            return false;
        }
        if (this.programmeTier != other.programmeTier) {
            return false;
        }
        if (this.programmeStatus != other.programmeStatus) {
            return false;
        }
        if (!Objects.equals(this.lastDraftSavedDateTime, other.lastDraftSavedDateTime)) {
            return false;
        }
        if (!Objects.equals(this.division, other.division)) {
            return false;
        }
        if (!Objects.equals(this.programmeFrequency, other.programmeFrequency)) {
            return false;
        }
        if (!Objects.equals(this.listOfRatings, other.listOfRatings)) {
            return false;
        }
//        if (!Objects.equals(this.listOfTrainingRatings, other.listOfTrainingRatings)) {
//            return false;
//        }
        if (!Objects.equals(this.checklistTemplate, other.checklistTemplate)) {
            return false;
        }
        return true;
    }
//
//    @Override
//    public String toString() {
//        return "PECProgrammeInfoEntity{" + "pecProgrammeInfoEntityId=" + pecProgrammeInfoEntityId + ", pecProgrammeName=" + pecProgrammeName + ", endorsementRatingDeadline=" + endorsementRatingDeadline + ", programmeTier=" + programmeTier + ", isNewProgramme=" + isNewProgramme + ", programmeStatus=" + programmeStatus + ", lastDraftSavedDateTime=" + lastDraftSavedDateTime + ", division=" + division + ", programmeFrequency=" + programmeFrequency + ", listOfRatings=" + listOfRatings + ", listOfTrainingRatings=" + listOfTrainingRatings + ", checklistTemplate=" + checklistTemplate + '}';
//    }

    public ChecklistEntity getPrevChecklistTemplate() {
        return prevChecklistTemplate;
    }

    public void setPrevChecklistTemplate(ChecklistEntity prevChecklistTemplate) {
        this.prevChecklistTemplate = prevChecklistTemplate;
    }

}
