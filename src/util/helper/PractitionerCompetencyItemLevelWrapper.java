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
public class PractitionerCompetencyItemLevelWrapper {
    private String programmeName;
    private List<ItemAverageScoreWrapper> listOfItemAverageScore;

    public PractitionerCompetencyItemLevelWrapper() {
    }

    public PractitionerCompetencyItemLevelWrapper(String programmeName, List<ItemAverageScoreWrapper> listOfItemAverageScore) {
        this.programmeName = programmeName;
        this.listOfItemAverageScore = listOfItemAverageScore;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
    }

    public List<ItemAverageScoreWrapper> getListOfItemAverageScore() {
        return listOfItemAverageScore;
    }

    public void setListOfItemAverageScore(List<ItemAverageScoreWrapper> listOfItemAverageScore) {
        this.listOfItemAverageScore = listOfItemAverageScore;
    }
    
    public void addItemToList(ItemAverageScoreWrapper item){
        this.listOfItemAverageScore.add(item);
    }
    
}
