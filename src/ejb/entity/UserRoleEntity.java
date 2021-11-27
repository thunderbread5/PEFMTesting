/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import util.enumeration.FCAccessLevelEnum;
import util.enumeration.PECAccessLevelEnum;
import util.enumeration.SystemTypeEnum;

/**
 *
 * @author nickg
 */
@Entity
public class UserRoleEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleEntityId;

    @Enumerated(EnumType.STRING)
    private FCAccessLevelEnum fcAccessRole;

    @Enumerated(EnumType.STRING)
    private PECAccessLevelEnum pecAccessRole;

    @Enumerated(EnumType.STRING)
    private SystemTypeEnum systemAccess;

    @NotNull
    @Size(min = 1)
    private String userRoleName;

    @OneToMany
    private List<ModuleEntity> listOfModules;
    
    @NotNull
    private boolean isRestricted;
    
    @NotNull
    private boolean isDefault;

    public UserRoleEntity() {
        this.listOfModules = new ArrayList();
    }

    public UserRoleEntity(FCAccessLevelEnum fcAccessRole, PECAccessLevelEnum pecAccessRole, String userRoleName, List<ModuleEntity> listOfModules) {
        this.fcAccessRole = fcAccessRole;
        this.pecAccessRole = pecAccessRole;
        this.userRoleName = userRoleName;
        this.listOfModules = listOfModules;
    }

    public UserRoleEntity(FCAccessLevelEnum fcAccessRole, PECAccessLevelEnum pecAccessRole, SystemTypeEnum systemAccess, String userRoleName, List<ModuleEntity> listOfModules, boolean isRestricted, boolean isDefault) {
        this.fcAccessRole = fcAccessRole;
        this.pecAccessRole = pecAccessRole;
        this.systemAccess = systemAccess;
        this.userRoleName = userRoleName;
        this.listOfModules = listOfModules;
        this.isDefault = isDefault;
        this.isRestricted = isRestricted;
    }

    

    public boolean isIsRestricted() {
        return isRestricted;
    }

    public void setIsRestricted(boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
    
    public Long getUserRoleEntityId() {
        return userRoleEntityId;
    }

    public void setUserRoleEntityId(Long userRoleEntityId) {
        this.userRoleEntityId = userRoleEntityId;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public List<ModuleEntity> getListOfModules() {
        return listOfModules;
    }

    public PECAccessLevelEnum getPecAccessRole() {
        return pecAccessRole;
    }

    public void setPecAccessRole(PECAccessLevelEnum pecAccessRole) {
        this.pecAccessRole = pecAccessRole;
    }

    public SystemTypeEnum getSystemAccess() {
        return systemAccess;
    }

    public void setSystemAccess(SystemTypeEnum systemAccess) {
        this.systemAccess = systemAccess;
    }

    public FCAccessLevelEnum getFcAccessRole() {
        return fcAccessRole;
    }

    public void setFcAccessRole(FCAccessLevelEnum fcAccessRole) {
        this.fcAccessRole = fcAccessRole;
    }

    public void setListOfModules(List<ModuleEntity> listOfModules) {
        this.listOfModules = listOfModules;
    }

 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRoleEntityId != null ? userRoleEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the userRoleEntityId fields are not set
        if (!(object instanceof UserRoleEntity)) {
            return false;
        }
        UserRoleEntity other = (UserRoleEntity) object;
        if ((this.userRoleEntityId == null && other.userRoleEntityId != null) || (this.userRoleEntityId != null && !this.userRoleEntityId.equals(other.userRoleEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.UserRoleEntity[ id=" + userRoleEntityId + " ]";
    }

}
