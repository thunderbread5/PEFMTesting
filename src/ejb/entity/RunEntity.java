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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

/**
 *
 * @author nickg
 */
@Entity
public class RunEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long runEntityId;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date runDate;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgRunCompetenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgRunAdherenceScore;

    @NotNull
    @Column(scale = 2, nullable = false)
    private Double avgRunClientComplexity;

    @NotNull
    @Column(scale = 2, nullable = false)
    private boolean ratingDisabled;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDisabled;

    @NotNull
    @Size(min = 1, max = 20000000)
    private String runComment;

    @OneToMany(mappedBy = "run")
    private List<FCRatingEntity> listOfFCRatings;

    @ManyToOne
    private AgencyEntity agency;

    public RunEntity() {
        this.listOfFCRatings = new ArrayList();
    }

    public RunEntity(Date runDate, String runComment, AgencyEntity agency) {
        this();
        this.runDate = runDate;
        this.avgRunAdherenceScore = 0.00;
        this.avgRunClientComplexity = 0.00;
        this.avgRunCompetenceScore = 0.00;
        this.runComment = runComment;
        this.dateDisabled = null;
        this.ratingDisabled = false;
        this.agency = agency;
    }

    public RunEntity(Date runDate, String runComment, AgencyEntity agency, boolean isDisabled) {
        this();
        this.runDate = runDate;
        this.avgRunAdherenceScore = 0.00;
        this.avgRunClientComplexity = 0.00;
        this.avgRunCompetenceScore = 0.00;
        this.runComment = runComment;
        if (isDisabled) {
            this.dateDisabled = new Date();
        } else {
            this.dateDisabled = null;
        }
        this.ratingDisabled = isDisabled;
        this.agency = agency;
    }

    public Long getRunEntityId() {
        return runEntityId;
    }

    public void setRunEntityId(Long runEntityId) {
        this.runEntityId = runEntityId;
    }

    public Date getRunDate() {
        return runDate;
    }

    public void setRunDate(Date runDate) {
        this.runDate = runDate;
    }

    public Double getAvgRunCompetenceScore() {
        return avgRunCompetenceScore;
    }

    public void setAvgRunCompetenceScore(Double avgRunCompetenceScore) {
        this.avgRunCompetenceScore = avgRunCompetenceScore;
    }

    public Double getAvgRunAdherenceScore() {
        return avgRunAdherenceScore;
    }

    public void setAvgRunAdherenceScore(Double avgRunAdherenceScore) {
        this.avgRunAdherenceScore = avgRunAdherenceScore;
    }

    public Double getAvgRunClientComplexity() {
        return avgRunClientComplexity;
    }

    public void setAvgRunClientComplexity(Double avgRunClientComplexity) {
        this.avgRunClientComplexity = avgRunClientComplexity;
    }

    public boolean isRatingDisabled() {
        return ratingDisabled;
    }

    public void setRatingDisabled(boolean ratingDisabled) {
        this.ratingDisabled = ratingDisabled;
    }

    public Date getDateDisabled() {
        return dateDisabled;
    }

    public void setDateDisabled(Date dateDisabled) {
        this.dateDisabled = dateDisabled;
    }

    public String getRunComment() {
        return runComment;
    }

    public void setRunComment(String runComment) {
        this.runComment = runComment;
    }

    public List<FCRatingEntity> getListOfFCRatings() {
        return listOfFCRatings;
    }

    public void setListOfFCRatings(List<FCRatingEntity> listOfFCRatings) {
        this.listOfFCRatings = listOfFCRatings;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (runEntityId != null ? runEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the runEntityId fields are not set
        if (!(object instanceof RunEntity)) {
            return false;
        }
        RunEntity other = (RunEntity) object;
        if ((this.runEntityId == null && other.runEntityId != null) || (this.runEntityId != null && !this.runEntityId.equals(other.runEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.RunEntity[ id=" + runEntityId + " ]";
    }

    public AgencyEntity getAgency() {
        return agency;
    }

    public void setAgency(AgencyEntity agency) {
        this.agency = agency;
    }

}
