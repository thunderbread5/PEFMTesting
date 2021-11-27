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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

/**
 *
 * @author nickg
 */
@Entity
public class FCRaterInfoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fcRaterInfoEntityId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date certifiedDate;

    @NotNull
    @OneToMany
    private List<ProgrammeEntity> listOfQualifiedProgrammes;

    public FCRaterInfoEntity() {
        this.listOfQualifiedProgrammes = new ArrayList();
    }

    public FCRaterInfoEntity(Date certifiedDate, List<ProgrammeEntity> listOfQualifiedProgrammes) {
        this.certifiedDate = certifiedDate;
        this.listOfQualifiedProgrammes = listOfQualifiedProgrammes;
    }

    public FCRaterInfoEntity(List<ProgrammeEntity> listOfQualifiedProgrammes) {
        this.certifiedDate = new Date();
        this.listOfQualifiedProgrammes = listOfQualifiedProgrammes;
    }

    public Long getFcRaterInfoEntityId() {
        return fcRaterInfoEntityId;
    }

    public void setFcRaterInfoEntityId(Long fcRaterInfoEntityId) {
        this.fcRaterInfoEntityId = fcRaterInfoEntityId;
    }

    public Date getCertifiedDate() {
        return certifiedDate;
    }

    public void setCertifiedDate(Date certifiedDate) {
        this.certifiedDate = certifiedDate;
    }

    public List<ProgrammeEntity> getListOfQualifiedProgrammes() {
        return listOfQualifiedProgrammes;
    }

    public void setListOfQualifiedProgrammes(List<ProgrammeEntity> listOfQualifiedProgrammes) {
        this.listOfQualifiedProgrammes = listOfQualifiedProgrammes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fcRaterInfoEntityId != null ? fcRaterInfoEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the fcRaterInfoEntityId fields are not set
        if (!(object instanceof FCRaterInfoEntity)) {
            return false;
        }
        FCRaterInfoEntity other = (FCRaterInfoEntity) object;
        if ((this.fcRaterInfoEntityId == null && other.fcRaterInfoEntityId != null) || (this.fcRaterInfoEntityId != null && !this.fcRaterInfoEntityId.equals(other.fcRaterInfoEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.FCRaterInfoEntity[ id=" + fcRaterInfoEntityId + " ]";
    }

}
