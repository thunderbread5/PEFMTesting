/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import util.enumeration.SystemTypeEnum;

/**
 *
 * @author nickg
 */
@Entity
public class ModuleEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moduleEntityId;
   
    @NotNull
    @Size(min = 1)
    private String moduleName;
    
    @OneToMany
    private List<FunctionEntity> listOfFunctions;
    
    @Enumerated(EnumType.STRING)
    @NotNull
    private SystemTypeEnum systemAccess;
    
    @NotNull
    private boolean isTemplate;

    public ModuleEntity() {
        this.listOfFunctions = new ArrayList();
    }

    public ModuleEntity(String moduleName, SystemTypeEnum systemAccess) {
        this();
        this.moduleName = moduleName;
        this.systemAccess = systemAccess;
    }
    

    public ModuleEntity(String moduleName, List<FunctionEntity> listOfFunctions, SystemTypeEnum systemAccess, boolean isTemplate) {
        this.moduleName = moduleName;
        this.listOfFunctions = listOfFunctions;
        this.systemAccess = systemAccess;
        this.isTemplate = isTemplate;
    }
    

    public Long getModuleEntityId() {
        return moduleEntityId;
    }

    public void setModuleEntityId(Long moduleEntityId) {
        this.moduleEntityId = moduleEntityId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public List<FunctionEntity> getListOfFunctions() {
        return listOfFunctions;
    }

    public void setListOfFunctions(List<FunctionEntity> listOfFunctions) {
        this.listOfFunctions = listOfFunctions;
    }

    public SystemTypeEnum getSystemAccess() {
        return systemAccess;
    }

    public void setSystemAccess(SystemTypeEnum systemAccess) {
        this.systemAccess = systemAccess;
    }

    public boolean isIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moduleEntityId != null ? moduleEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the moduleEntityId fields are not set
        if (!(object instanceof ModuleEntity)) {
            return false;
        }
        ModuleEntity other = (ModuleEntity) object;
        if ((this.moduleEntityId == null && other.moduleEntityId != null) || (this.moduleEntityId != null && !this.moduleEntityId.equals(other.moduleEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.ModuleEntity[ id=" + moduleEntityId + " ]";
    }
    
}
