/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nickg
 */
@Entity
public class PECFrequencyReviewEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pecFrequencyReviewEntityId;

    @NotNull
    @Min(value = 1)
    @Max(value = 36)
    private Integer frequencyMonth;

    @NotNull
    private String frequencyName;

    public PECFrequencyReviewEntity() {
    }

    
    public PECFrequencyReviewEntity(Integer frequencyMonth, String frequencyName) {
        this.frequencyMonth = frequencyMonth;
        this.frequencyName = frequencyName;
    }

    
    public Long getPecFrequencyReviewEntityId() {
        return pecFrequencyReviewEntityId;
    }

    public void setPecFrequencyReviewEntityId(Long pecFrequencyReviewEntityId) {
        this.pecFrequencyReviewEntityId = pecFrequencyReviewEntityId;
    }

    public Integer getFrequencyMonth() {
        return frequencyMonth;
    }

    public void setFrequencyMonth(Integer frequencyMonth) {
        this.frequencyMonth = frequencyMonth;
    }

    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecFrequencyReviewEntityId != null ? pecFrequencyReviewEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the pecFrequencyReviewEntityId fields are not set
        if (!(object instanceof PECFrequencyReviewEntity)) {
            return false;
        }
        PECFrequencyReviewEntity other = (PECFrequencyReviewEntity) object;
        if ((this.pecFrequencyReviewEntityId == null && other.pecFrequencyReviewEntityId != null) || (this.pecFrequencyReviewEntityId != null && !this.pecFrequencyReviewEntityId.equals(other.pecFrequencyReviewEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.PECFrequencyReviewEntity[ id=" + pecFrequencyReviewEntityId + " ]";
    }

}
