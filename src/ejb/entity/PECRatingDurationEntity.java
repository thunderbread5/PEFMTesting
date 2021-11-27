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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

/**
 *
 * @author nickg
 */
@Entity
public class PECRatingDurationEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pecRatingDurationEntityId;
    
    @NotNull
    @PositiveOrZero
    private Integer pecRatingDurationInDays;
    
    @NotNull
    private String pecRatingDurationDescription;

    public PECRatingDurationEntity() {
    }

    public PECRatingDurationEntity(Integer pecRatingDurationInDays, String pecRatingDurationDescription) {
        this.pecRatingDurationInDays = pecRatingDurationInDays;
        this.pecRatingDurationDescription = pecRatingDurationDescription;
    }

    public Long getPecRatingDurationEntityId() {
        return pecRatingDurationEntityId;
    }

    public void setPecRatingDurationEntityId(Long pecRatingDurationEntityId) {
        this.pecRatingDurationEntityId = pecRatingDurationEntityId;
    }

    public Integer getPecRatingDurationInDays() {
        return pecRatingDurationInDays;
    }

    public void setPecRatingDurationInDays(Integer pecRatingDurationInDays) {
        this.pecRatingDurationInDays = pecRatingDurationInDays;
    }

    public String getPecRatingDurationDescription() {
        return pecRatingDurationDescription;
    }

    public void setPecRatingDurationDescription(String pecRatingDurationDescription) {
        this.pecRatingDurationDescription = pecRatingDurationDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pecRatingDurationEntityId != null ? pecRatingDurationEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the pecRatingDurationEntityId fields are not set
        if (!(object instanceof PECRatingDurationEntity)) {
            return false;
        }
        PECRatingDurationEntity other = (PECRatingDurationEntity) object;
        if ((this.pecRatingDurationEntityId == null && other.pecRatingDurationEntityId != null) || (this.pecRatingDurationEntityId != null && !this.pecRatingDurationEntityId.equals(other.pecRatingDurationEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.PECRatingDurationEntity[ id=" + pecRatingDurationEntityId + " ]";
    }
    
}
