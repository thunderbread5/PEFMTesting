/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author zongh
 */
@Entity
public class LoggingRecordEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loggingRecordId;

    @NotNull
    private String valueDescription;

    @NotNull
    @Column(name="oldValue", length = 1000)
    private String oldValue;

    @NotNull
    @Column(name="updatedValue", length = 1000)
    private String updatedValue;
    

    public LoggingRecordEntity() {
    }

    public LoggingRecordEntity(String valueDescription, String oldValue, String updatedValue) {
        this.valueDescription = valueDescription;
        this.oldValue = oldValue;
        this.updatedValue = updatedValue;
    }
    

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getUpdatedValue() {
        return updatedValue;
    }

    public void setUpdatedValue(String updatedValue) {
        this.updatedValue = updatedValue;
    }

    public String getValueDescription() {
        return valueDescription;
    }

    public void setValueDescription(String valueDescription) {
        this.valueDescription = valueDescription;
    }

    public Long getLoggingRecordId() {
        return loggingRecordId;
    }

    public void setLoggingRecordId(Long loggingRecordId) {
        this.loggingRecordId = loggingRecordId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loggingRecordId != null ? loggingRecordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoggingRecordEntity)) {
            return false;
        }
        LoggingRecordEntity other = (LoggingRecordEntity) object;
        if ((this.loggingRecordId == null && other.loggingRecordId != null) || (this.loggingRecordId != null && !this.loggingRecordId.equals(other.loggingRecordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.LoggingRecordEntity[ id=" + loggingRecordId + " ]";
    }

}
