/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author zongh
 */
@Entity
public class BackupEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long backupId;

    @NotNull
    private String fileName;

    @NotNull
    private String fileDirectory;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeCreated;

    public BackupEntity() {
    }

    public BackupEntity(String fileName, String fileDirectory) {
        this.fileName = fileName;
        this.fileDirectory = fileDirectory;
        this.dateTimeCreated = new Date();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDirectory() {
        return fileDirectory;
    }

    public void setFileDirectory(String fileDirectory) {
        this.fileDirectory = fileDirectory;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public Long getBackupId() {
        return backupId;
    }

    public void setBackupId(Long backupId) {
        this.backupId = backupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (backupId != null ? backupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BackupEntity)) {
            return false;
        }
        BackupEntity other = (BackupEntity) object;
        if ((this.backupId == null && other.backupId != null) || (this.backupId != null && !this.backupId.equals(other.backupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.BackupEntity[ id=" + backupId + " ]";
    }

}
