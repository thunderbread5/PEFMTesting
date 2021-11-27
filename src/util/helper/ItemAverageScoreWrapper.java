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
public class ItemAverageScoreWrapper implements Comparable<ItemAverageScoreWrapper> {

    private Long counter;
    private Double totalScore;
    private String question;
    private String programmeName;
    private Long questionId;

    public ItemAverageScoreWrapper() {
    }

    public ItemAverageScoreWrapper(Long counter, Double totalScore, String question, String programmeName, Long questionId) {
        this.counter = counter;
        this.totalScore = totalScore;
        this.question = question;
        this.programmeName = programmeName;
        this.questionId = questionId;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


    public void addScoreToTotalScore(Double newScore) {
        this.totalScore += newScore;
    }

    public void addCount() {
        this.counter++;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    @Override
    public int compareTo(ItemAverageScoreWrapper question) {
        return (int) (this.getQuestionId() - question.getQuestionId());
    }

}
