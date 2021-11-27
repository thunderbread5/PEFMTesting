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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import util.enumeration.CommandTypeEnum;
import util.enumeration.EntityTypeEnum;
import util.enumeration.SystemTypeEnum;

/**
 *
 * @author zongh
 */
@Entity
public class LoggingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loggingEntityId;

    private UserEntity createdBy;

    private CommandTypeEnum commandType;

    private SystemTypeEnum systemType;

    private EntityTypeEnum entity;

    private long entityId;

    private String description;
    
    @OneToMany
    private List<LoggingRecordEntity> loggingRecords;
    
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeCreated;

    public LoggingEntity() {
        loggingRecords = new ArrayList();
    }

    public LoggingEntity(UserEntity createdBy, CommandTypeEnum commandType, SystemTypeEnum systemType, EntityTypeEnum entity, long entityId, String name) {
        this();
        this.createdBy = createdBy;
        this.commandType = commandType;
        this.systemType = systemType;
        this.entity = entity;
        this.entityId = entityId;
        this.description = this.generateDescription() + name;
        this.dateTimeCreated = new Date();
    }
    
        public LoggingEntity(UserEntity createdBy, CommandTypeEnum commandType, SystemTypeEnum systemType, EntityTypeEnum entity, long entityId, String name, String description) {
        this();
        this.createdBy = createdBy;
        this.commandType = commandType;
        this.systemType = systemType;
        this.entity = entity;
        this.entityId = entityId;
        this.description = description;
        this.dateTimeCreated = new Date();
    }

    public LoggingEntity(UserEntity createdBy, CommandTypeEnum commandType, SystemTypeEnum systemType, EntityTypeEnum entity, long entityId, String name, List<LoggingRecordEntity> loggingRecords) {
        this.createdBy = createdBy;
        this.commandType = commandType;
        this.systemType = systemType;
        this.entity = entity;
        this.entityId = entityId;
        this.description = this.generateDescription() + name;
        this.loggingRecords = loggingRecords;
        this.dateTimeCreated = new Date();
    }
    
        public LoggingEntity(UserEntity createdBy, CommandTypeEnum commandType, SystemTypeEnum systemType, EntityTypeEnum entity, long entityId, String name, List<LoggingRecordEntity> loggingRecords, String description) {
        this.createdBy = createdBy;
        this.commandType = commandType;
        this.systemType = systemType;
        this.entity = entity;
        this.entityId = entityId;
        this.description = description;
        this.loggingRecords = loggingRecords;
        this.dateTimeCreated = new Date();
    }
    
    
    

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public CommandTypeEnum getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandTypeEnum commandType) {
        this.commandType = commandType;
    }

    public EntityTypeEnum getEntity() {
        return entity;
    }

    public void setEntity(EntityTypeEnum entity) {
        this.entity = entity;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public String getDescription() {
        return description;
    }

    public SystemTypeEnum getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemTypeEnum systemType) {
        this.systemType = systemType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String generateDescription() {
        return this.createdBy.getUserEmail()+ " " + this.generateCommandType() + " " + this.generateEntityType();
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public List<LoggingRecordEntity> getLoggingRecords() {
        return loggingRecords;
    }

    public void setLoggingRecords(List<LoggingRecordEntity> loggingRecords) {
        this.loggingRecords = loggingRecords;
    }
    
    
    private String generateCommandType() {
        if (this.commandType == CommandTypeEnum.CREATE) {
            return "has created";
        } else if (this.commandType == CommandTypeEnum.DELETE) {
            return "has deleted";
        } else if (this.commandType == CommandTypeEnum.DISABLE) {
            return "has disabled";
        } else if (this.commandType == CommandTypeEnum.ENABLE) {
            return "has enabled";
        } else if (this.commandType == CommandTypeEnum.UPDATE) {
            return "has updated";
        } else {
            return "general";
        }
    }

    private String generateEntityType() {
        if (this.entity == EntityTypeEnum.USERENTITY) {
            return "user: ";
        } else if (this.entity == EntityTypeEnum.USERROLEENTITY) {
            return "user role: ";
        } else if (this.entity == EntityTypeEnum.AGENCYENTITY) {
            return "agency: ";
        } else if (this.entity == EntityTypeEnum.CHECKLISTENTITY) {
            return "checklist: ";
        } else if (this.entity == EntityTypeEnum.DIVISIONENTITY) {
            return "division: ";
        } else if (this.entity == EntityTypeEnum.FCPROGRAMMEINFOENTITY) {
            return "FC Programme: ";
        } else if (this.entity == EntityTypeEnum.PECPROGRAMMEINFOENTITY) {
            return "PEC Programme: ";
        } else if (this.entity == EntityTypeEnum.FREQUENCYREVIEWENTITY) {
            return "frequency of review: ";
        } else if (this.entity == EntityTypeEnum.RATINGDURATIONENTITY) {
            return "rating duration: ";
        } else if (this.entity == EntityTypeEnum.PROGRAMMEENTITY) {
            return "Programme: ";
        } else {
            return "";
        }

//        
//            USERENTITY,
//    USERROLEENTITY,
//    DIVISIONENTITY,
//    FREQUENCYREVIEWENTITY,
//    RATINGDURATIONENTITY,
//    PROGRAMMEENTITY,
//    CHECKLISTENTITY,
//    AGENCYENTITY,
//    FCPROGRAMMEINFOENTITY,
//    PECPROGRAMMEINFOENTITY
    }

    public Long getLoggingEntityId() {
        return loggingEntityId;
    }

    public void setLoggingEntityId(Long loggingEntityId) {
        this.loggingEntityId = loggingEntityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loggingEntityId != null ? loggingEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoggingEntity)) {
            return false;
        }
        LoggingEntity other = (LoggingEntity) object;
        if ((this.loggingEntityId == null && other.loggingEntityId != null) || (this.loggingEntityId != null && !this.loggingEntityId.equals(other.loggingEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.LoggingEntity[ id=" + loggingEntityId + " ]";
    }

}
