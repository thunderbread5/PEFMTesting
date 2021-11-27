/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import java.util.List;

/**
 *
 * @author nickg
 */
public class PractitionerMonthlyCompetencyWrapper {
    private String programmeName;
    private List<MonthlyCompetencyItemLevelWrapper> listOfItemsByMonth;

    public PractitionerMonthlyCompetencyWrapper() {
    }

    public PractitionerMonthlyCompetencyWrapper(String programmeName, List<MonthlyCompetencyItemLevelWrapper> listOfItemsByMonth) {
        this.programmeName = programmeName;
        this.listOfItemsByMonth = listOfItemsByMonth;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public List<MonthlyCompetencyItemLevelWrapper> getListOfItemsByMonth() {
        return listOfItemsByMonth;
    }

    public void setListOfItemsByMonth(List<MonthlyCompetencyItemLevelWrapper> listOfItemsByMonth) {
        this.listOfItemsByMonth = listOfItemsByMonth;
    }
    
    
    
    
}
