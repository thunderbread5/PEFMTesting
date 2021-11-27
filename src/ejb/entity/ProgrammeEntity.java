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
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import util.enumeration.SystemTypeEnum;

/**
 *
 * @author nickg
 */
@Entity
public class ProgrammeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programmeEntityId;

    @NotNull
    private String programmeName;

    @Enumerated(EnumType.STRING)
    private SystemTypeEnum programmeCategory;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date programmeCreated;

    @OneToOne
    private FCProgrammeInfoEntity fcProgrammeInfo;

    @ManyToMany
    @JoinTable(name = "listOfProgrammeOwners")
    private List<UserEntity> listOfProgrammeOwners;

    @ManyToMany
    @JoinTable(name = "listOfExtraAccessRights")
    private List<UserEntity> listOfCEISStaffWithExtraAccessRight;

    @OneToOne
    private PECProgrammeInfoEntity pecProgrammeInfo;

    @NotNull
    private boolean isDeleted;

    @NotNull
    private boolean isDisabled;

    @NotNull
    private String programmeDescription;

    public ProgrammeEntity() {
        this.listOfCEISStaffWithExtraAccessRight = new ArrayList();
        this.listOfProgrammeOwners = new ArrayList();
    }

    public ProgrammeEntity(String programmeName, SystemTypeEnum programmeCategory, FCProgrammeInfoEntity fcProgrammeInfo, List<UserEntity> listOfProgrammeOwners, List<UserEntity> listOfCEISStaffWithExtraAccessRight, PECProgrammeInfoEntity pecProgrammeInfo, String programmeDescription) {
        this.programmeName = programmeName;
        this.programmeCategory = programmeCategory;
        this.fcProgrammeInfo = fcProgrammeInfo;
        this.listOfProgrammeOwners = listOfProgrammeOwners;
        this.listOfCEISStaffWithExtraAccessRight = listOfCEISStaffWithExtraAccessRight;
        this.pecProgrammeInfo = pecProgrammeInfo;
        this.programmeCreated = new Date();
        this.isDeleted = false;
        this.isDisabled = false;
        this.programmeDescription = programmeDescription;
    }

    public ProgrammeEntity(String programmeName, SystemTypeEnum programmeCategory, FCProgrammeInfoEntity fcProgrammeInfo, PECProgrammeInfoEntity pecProgrammeInfo, String programmeDescription) {
        this();
        this.programmeName = programmeName;
        this.programmeCategory = programmeCategory;
        this.fcProgrammeInfo = fcProgrammeInfo;
        this.pecProgrammeInfo = pecProgrammeInfo;
        this.programmeCreated = new Date();
        this.isDeleted = false;
        this.isDisabled = false;
        this.programmeDescription = programmeDescription;
    }

    public ProgrammeEntity(String programmeName, SystemTypeEnum programmeCategory, String programmeDescription) {
        this();
        this.programmeName = programmeName;
        this.programmeCategory = programmeCategory;
        this.fcProgrammeInfo = null;
        this.pecProgrammeInfo = null;
        this.programmeCreated = new Date();
        this.isDeleted = false;
        this.isDisabled = false;
        this.programmeDescription = programmeDescription;
    }

    public Long getProgrammeEntityId() {
        return programmeEntityId;
    }

    public void setProgrammeEntityId(Long programmeEntityId) {
        this.programmeEntityId = programmeEntityId;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public SystemTypeEnum getProgrammeCategory() {
        return programmeCategory;
    }

    public void setProgrammeCategory(SystemTypeEnum programmeCategory) {
        this.programmeCategory = programmeCategory;
    }

    public Date getProgrammeCreated() {
        return programmeCreated;
    }

    public void setProgrammeCreated(Date programmeCreated) {
        this.programmeCreated = programmeCreated;
    }

    public FCProgrammeInfoEntity getFcProgrammeInfo() {
        return fcProgrammeInfo;
    }

    public void setFcProgrammeInfo(FCProgrammeInfoEntity fcProgrammeInfo) {
        this.fcProgrammeInfo = fcProgrammeInfo;
    }

    public List<UserEntity> getListOfProgrammeOwners() {
        return listOfProgrammeOwners;
    }

    public void setListOfProgrammeOwners(List<UserEntity> listOfProgrammeOwners) {
        this.listOfProgrammeOwners = listOfProgrammeOwners;
    }

    public List<UserEntity> getListOfCEISStaffWithExtraAccessRight() {
        return listOfCEISStaffWithExtraAccessRight;
    }

    public void setListOfCEISStaffWithExtraAccessRight(List<UserEntity> listOfCEISStaffWithExtraAccessRight) {
        this.listOfCEISStaffWithExtraAccessRight = listOfCEISStaffWithExtraAccessRight;
    }

    public PECProgrammeInfoEntity getPecProgrammeInfo() {
        return pecProgrammeInfo;
    }

    public void setPecProgrammeInfo(PECProgrammeInfoEntity pecProgrammeInfo) {
        this.pecProgrammeInfo = pecProgrammeInfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programmeEntityId != null ? programmeEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the programmeEntityId fields are not set
        if (!(object instanceof ProgrammeEntity)) {
            return false;
        }
        ProgrammeEntity other = (ProgrammeEntity) object;
        if ((this.programmeEntityId == null && other.programmeEntityId != null) || (this.programmeEntityId != null && !this.programmeEntityId.equals(other.programmeEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.ProgrammeEntity[ id=" + programmeEntityId + " ]";
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean isIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public String getProgrammeDescription() {
        return programmeDescription;
    }

    public void setProgrammeDescription(String programmeDescription) {
        this.programmeDescription = programmeDescription;
    }

}
