/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nickg
 */
public class MonthlyCompetencyItemLevelWrapper {

    private String monthLabel;
    private Double adherenceScore;
    private String qnForActivitiesInManual;
    private String qnForActivitiesCompleted;
    private List<ItemAverageScoreWrapper> listOfItemScoreAvg;

    public MonthlyCompetencyItemLevelWrapper() {
    }

    public MonthlyCompetencyItemLevelWrapper(String monthLabel, List<ItemAverageScoreWrapper> listOfItemScoreAvg) {
        this.monthLabel = monthLabel;
        this.listOfItemScoreAvg = listOfItemScoreAvg;
        this.adherenceScore = 0.0;
    }

    public MonthlyCompetencyItemLevelWrapper(String monthLabel, Double adherenceScore, String qnForActivitiesInManual, String qnForActivitiesCompleted) {
        this.monthLabel = monthLabel;
        this.adherenceScore = adherenceScore;
        this.listOfItemScoreAvg = new ArrayList();
        this.qnForActivitiesInManual = qnForActivitiesInManual;
        this.qnForActivitiesCompleted = qnForActivitiesCompleted;
    }

    public String getMonthLabel() {
        return monthLabel;
    }

    public void setMonthLabel(String monthLabel) {
        this.monthLabel = monthLabel;
    }

    public List<ItemAverageScoreWrapper> getListOfItemScoreAvg() {
        return listOfItemScoreAvg;
    }

    public void setListOfItemScoreAvg(List<ItemAverageScoreWrapper> listOfItemScoreAvg) {
        this.listOfItemScoreAvg = listOfItemScoreAvg;
    }

    public Double getAdherenceScore() {
        return adherenceScore;
    }

    public void setAdherenceScore(Double adherenceScore) {
        this.adherenceScore = adherenceScore;
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

}
