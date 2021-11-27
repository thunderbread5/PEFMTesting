/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

/**
 *
 * @author nickg
 */
public class FCIndividualAdherenceWrapper implements Comparable<FCIndividualAdherenceWrapper> {

    private Long programmeId;
    private Long questionId;
    private String qnForActivitiesInManual;
    private String qnForActivitiesCompleted;
    private Double numActivitiesPlanned;
    private Double numActivitiesCarriedOut;
    private String adherenceCommments;

    public FCIndividualAdherenceWrapper() {
    }

    public FCIndividualAdherenceWrapper(Long programmeId, Long questionId, String qnForActivitiesInManual, String qnForActivitiesCompleted, Double numActivitiesPlanned, Double numActivitiesCarriedOut, String adherenceCommments) {
        this.programmeId = programmeId;
        this.questionId = questionId;
        this.qnForActivitiesInManual = qnForActivitiesInManual;
        this.qnForActivitiesCompleted = qnForActivitiesCompleted;
        this.numActivitiesPlanned = numActivitiesPlanned;
        this.numActivitiesCarriedOut = numActivitiesCarriedOut;
        this.adherenceCommments = adherenceCommments;
    }

    public Long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Long programmeId) {
        this.programmeId = programmeId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQnForActivitiesInManual() {
        return qnForActivitiesInManual;
    }

    public void setQnForActivitiesInManual(String qnForActivitiesInManual) {
        this.qnForActivitiesInManual = qnForActivitiesInManual;
    }

    public String getQnForActivitiesCompleted() {
        return qnForActivitiesCompleted;
    }

    public void setQnForActivitiesCompleted(String qnForActivitiesCompleted) {
        this.qnForActivitiesCompleted = qnForActivitiesCompleted;
    }

    public Double getNumActivitiesPlanned() {
        return numActivitiesPlanned;
    }

    public void setNumActivitiesPlanned(Double numActivitiesPlanned) {
        this.numActivitiesPlanned = numActivitiesPlanned;
    }

    public Double getNumActivitiesCarriedOut() {
        return numActivitiesCarriedOut;
    }

    public void setNumActivitiesCarriedOut(Double numActivitiesCarriedOut) {
        this.numActivitiesCarriedOut = numActivitiesCarriedOut;
    }

    @Override
    public int compareTo(FCIndividualAdherenceWrapper question) {
        return (int) (this.getQuestionId() - question.getQuestionId());
    }

    public String getAdherenceCommments() {
        return adherenceCommments;
    }

    public void setAdherenceCommments(String adherenceCommments) {
        this.adherenceCommments = adherenceCommments;
    }
}
