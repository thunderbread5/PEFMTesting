/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.List;

/**
 *
 * @author rayta
 */
public class FCSupervisorDashboardOvertimeResultsWrapper {
    private String monthLabel;
    private List<FCSupervisorDashboardResultsWrapper> ratings;

    public FCSupervisorDashboardOvertimeResultsWrapper(String monthLabel, List<FCSupervisorDashboardResultsWrapper> ratings) {
        this.monthLabel = monthLabel;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "FCSupervisorDashboardOvertimeResultsWrapper{" + "monthLabel=" + monthLabel + ", ratings=" + ratings + '}';
    }

    public FCSupervisorDashboardOvertimeResultsWrapper() {
    }

    public String getMonthLabel() {
        return monthLabel;
    }

    public void setMonthLabel(String monthLabel) {
        this.monthLabel = monthLabel;
    }

    public List<FCSupervisorDashboardResultsWrapper> getRatings() {
        return ratings;
    }

    public void setRatings(List<FCSupervisorDashboardResultsWrapper> ratings) {
        this.ratings = ratings;
    }
    
    
}
