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
import javax.validation.constraints.Positive;
import util.enumeration.SystemTypeEnum;

/**
 *
 * @author nickg
 */
@Entity
public class ChecklistEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long checklistEntityId;

    @NotNull
    private String checklistName;

    @Enumerated(EnumType.STRING)
    private SystemTypeEnum checklistType;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastChangedDate;

    @NotNull
    private boolean isMain;

    @NotNull
    private boolean isTemplate;

    @NotNull
    @Positive
    private Integer versionNumber;

    @NotNull
    private boolean isNewProgramme;

    @NotNull
    private String caseId;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity lastChangedBy;

    @OneToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity checklistCreator;

    @OneToMany
    private List<SectionEntity> listOfSections;

    @OneToMany
    private List<FileEntity> listOfChecklistFiles;

    public ChecklistEntity() {
        this.listOfChecklistFiles = new ArrayList();
        this.listOfSections = new ArrayList();
    }

    public ChecklistEntity(String checklistName, SystemTypeEnum checklistType, boolean isMain, Integer versionNumber, boolean isNewProgramme, String caseId, UserEntity lastChangedBy, UserEntity checklistCreator, List<SectionEntity> listOfSections, boolean isTemplate) {
        this.checklistName = checklistName;
        this.checklistType = checklistType;
        this.isMain = isMain;
        this.versionNumber = versionNumber;
        this.isNewProgramme = isNewProgramme;
        this.caseId = caseId;
        this.lastChangedBy = lastChangedBy;
        this.checklistCreator = checklistCreator;
        this.listOfSections = listOfSections;
        this.listOfChecklistFiles = new ArrayList();
        this.dateCreated = new Date();
        this.lastChangedDate = new Date();
        this.isTemplate = isTemplate;
    }

    public Long getChecklistEntityId() {
        return checklistEntityId;
    }

    public void setChecklistEntityId(Long checklistEntityId) {
        this.checklistEntityId = checklistEntityId;
    }

    public String getChecklistName() {
        return checklistName;
    }

    public void setChecklistName(String checklistName) {
        this.checklistName = checklistName;
    }

    public SystemTypeEnum getChecklistType() {
        return checklistType;
    }

    public void setChecklistType(SystemTypeEnum checklistType) {
        this.checklistType = checklistType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public boolean isIsMain() {
        return isMain;
    }

    public void setIsMain(boolean isMain) {
        this.isMain = isMain;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public boolean isIsNewProgramme() {
        return isNewProgramme;
    }

    public void setIsNewProgramme(boolean isNewProgramme) {
        this.isNewProgramme = isNewProgramme;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public UserEntity getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(UserEntity lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public UserEntity getChecklistCreator() {
        return checklistCreator;
    }

    public void setChecklistCreator(UserEntity checklistCreator) {
        this.checklistCreator = checklistCreator;
    }

    public List<FileEntity> getListOfChecklistFiles() {
        return listOfChecklistFiles;
    }

    public void setListOfChecklistFiles(List<FileEntity> listOfChecklistFiles) {
        this.listOfChecklistFiles = listOfChecklistFiles;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public List<SectionEntity> getListOfSections() {
        return listOfSections;
    }

    public void setListOfSections(List<SectionEntity> listOfSections) {
        this.listOfSections = listOfSections;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checklistEntityId != null ? checklistEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the checklistEntityId fields are not set
        if (!(object instanceof ChecklistEntity)) {
            return false;
        }
        ChecklistEntity other = (ChecklistEntity) object;
        if ((this.checklistEntityId == null && other.checklistEntityId != null) || (this.checklistEntityId != null && !this.checklistEntityId.equals(other.checklistEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.ChecklistEntity[ id=" + checklistEntityId + " ]";
    }

    public boolean isIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

}
