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

/**
 *
 * @author nickg
 */
@Entity
public class FileEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fileEntityId;

    @NotNull
    private String fileName;

    @NotNull
    private String fileDirectory;

    @NotNull
    private boolean isNew;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fileUploadedDate;

    @OneToOne
    private DocumentRelevanceEntity documentRelevance;

    @ManyToOne()
    private UserEntity uploadBy;

    public FileEntity() {
    }

    public FileEntity(FileEntity file) {
        this.fileName = file.getFileName();
        this.fileDirectory = file.getFileDirectory();
        this.isNew = file.isIsNew();
        this.documentRelevance = new DocumentRelevanceEntity(file.getDocumentRelevance());
        this.fileUploadedDate = file.getFileUploadedDate();
        this.uploadBy = file.getUploadBy();
        this.fileEntityId = null;
    }

    public FileEntity(String fileName, String fileDirectory, boolean isNew, DocumentRelevanceEntity documentRelevance, UserEntity uploadBy) {
        this.fileName = fileName;
        this.fileDirectory = fileDirectory;
        this.isNew = isNew;
        this.documentRelevance = documentRelevance;
        this.fileUploadedDate = new Date();
        this.uploadBy = uploadBy;
    }

    public Long getFileEntityId() {
        return fileEntityId;
    }

    public void setFileEntityId(Long fileEntityId) {
        this.fileEntityId = fileEntityId;
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

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public Date getFileUploadedDate() {
        return fileUploadedDate;
    }

    public void setFileUploadedDate(Date fileUploadedDate) {
        this.fileUploadedDate = fileUploadedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fileEntityId != null ? fileEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the fileEntityId fields are not set
        if (!(object instanceof FileEntity)) {
            return false;
        }
        FileEntity other = (FileEntity) object;
        if ((this.fileEntityId == null && other.fileEntityId != null) || (this.fileEntityId != null && !this.fileEntityId.equals(other.fileEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.FileEntity[ id=" + fileEntityId + " ]";
    }

    /**
     * @return the uploadBy
     */
    public UserEntity getUploadBy() {
        return uploadBy;
    }

    /**
     * @param uploadBy the uploadBy to set
     */
    public void setUploadBy(UserEntity uploadBy) {
        this.uploadBy = uploadBy;
    }

    public DocumentRelevanceEntity getDocumentRelevance() {
        return documentRelevance;
    }

    public void setDocumentRelevance(DocumentRelevanceEntity documentRelevance) {
        this.documentRelevance = documentRelevance;
    }

}
