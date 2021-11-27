/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

/**
 *
 * @author rayta
 */
public class FCSupervisorDashboardResultsWrapper {

    private String label;
    private Long id;
    private double data;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public FCSupervisorDashboardResultsWrapper(String label, double data) {
        this.label = label;
        this.data = data;
        this.id = null;
    }

    @Override
    public String toString() {
        return "FCSupervisorDashboardResultsWrapper{" + "label=" + label + ", id=" + id + ", data=" + data + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FCSupervisorDashboardResultsWrapper(String label, Long id, double data) {
        this.label = label;
        this.id = id;
        this.data = data;
    }


    public FCSupervisorDashboardResultsWrapper() {
    }
}
