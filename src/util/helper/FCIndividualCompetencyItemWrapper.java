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
public class FCIndividualCompetencyItemWrapper implements Comparable<FCIndividualCompetencyItemWrapper> {

    private Long programmeId;
    private Long questionId;
    private Double ratingScore;
    private String ratingComment;
    private String question;

    public FCIndividualCompetencyItemWrapper(Long programmeId, Long questionId, Double ratingScore, String ratingComment, String question) {
        this.programmeId = programmeId;
        this.questionId = questionId;
        this.ratingScore = ratingScore;
        this.ratingComment = ratingComment;
        this.question = question;
    }

    public Long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Long programmeId) {
        this.programmeId = programmeId;
    }

    public Double getRatingScore() {
        return ratingScore;
    }

    public void setRatingScore(Double ratingScore) {
        this.ratingScore = ratingScore;
    }

    public String getRatingComment() {
        return ratingComment;
    }

    public void setRatingComment(String ratingComment) {
        this.ratingComment = ratingComment;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public int compareTo(FCIndividualCompetencyItemWrapper question) {
        return (int) (this.getQuestionId() - question.getQuestionId());
    }

}
