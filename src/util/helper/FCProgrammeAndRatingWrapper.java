/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import ejb.entity.FCRatingEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nickg
 */
public class FCProgrammeAndRatingWrapper {

    private String ratingName;
    private Long ratingId;
    private Date sessionDate;
    private List<FCIndividualCompetencyItemWrapper> listOfRatings;
    private FCIndividualAdherenceWrapper adherenceRating;

    public FCProgrammeAndRatingWrapper(Long ratingId, String programmmeName, List<FCIndividualCompetencyItemWrapper> listOfRatings, FCIndividualAdherenceWrapper adherenceRating, Date sessionDate) {
        this.ratingId = ratingId;
        this.ratingName = programmmeName;
        this.listOfRatings = listOfRatings;
        this.adherenceRating = adherenceRating;
        this.sessionDate = sessionDate;
    }

    public String getRatingName() {
        return ratingName;
    }

    public void setRatingName(String ratingName) {
        this.ratingName = ratingName;
    }

    public List<FCIndividualCompetencyItemWrapper> getListOfRatings() {
        return listOfRatings;
    }

    public void setListOfRatings(List<FCIndividualCompetencyItemWrapper> listOfRatings) {
        this.listOfRatings = listOfRatings;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public FCIndividualAdherenceWrapper getAdherenceRating() {
        return adherenceRating;
    }

    public void setAdherenceRating(FCIndividualAdherenceWrapper adherenceRating) {
        this.adherenceRating = adherenceRating;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

}
