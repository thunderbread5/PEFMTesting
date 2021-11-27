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
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 *
 * @author nickg
 */
@Entity
public class DivisionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long divisionEntityId;

    @Column(unique = true)
    @NotNull
    private String divisionName;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @OneToOne(optional = false)
    private UserEntity createdBy;
    
    @ManyToOne(optional = true)
    private UserEntity employeeInCharge;

    @OneToMany(mappedBy = "division")
    private List<UserEntity> listOfEmployees;

    public DivisionEntity() {
        this.listOfEmployees = new ArrayList();
    }

    public DivisionEntity(String divisionName, UserEntity createdBy) {
        this();
        this.divisionName = divisionName;
        this.createdBy = createdBy;
        this.dateCreated = new Date();
        this.employeeInCharge = null;
    }

    public DivisionEntity(String divisionName, UserEntity createdBy, UserEntity employeeInCharge) {
        this();
        this.dateCreated = new Date();
        this.divisionName = divisionName;
        this.createdBy = createdBy;
        this.employeeInCharge = employeeInCharge;
    }

    public DivisionEntity(String divisionName, UserEntity ceisStaff, List<UserEntity> listOfEmployees) {
        this.divisionName = divisionName;
        this.dateCreated = new Date();
        this.createdBy = ceisStaff;
        this.listOfEmployees = listOfEmployees;
    }

    public DivisionEntity(String divisionName, UserEntity createdBy, UserEntity employeeInCharge, List<UserEntity> listOfEmployees) {
        this.divisionName = divisionName;
        this.dateCreated = new Date();
        this.createdBy = createdBy;
        this.employeeInCharge = employeeInCharge;
        this.listOfEmployees = listOfEmployees;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public UserEntity getEmployeeInCharge() {
        return employeeInCharge;
    }

    public void setEmployeeInCharge(UserEntity employeeInCharge) {
        this.employeeInCharge = employeeInCharge;
    }

    public Long getDivisionEntityId() {
        return divisionEntityId;
    }

    public void setDivisionEntityId(Long divisionEntityId) {
        this.divisionEntityId = divisionEntityId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<UserEntity> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<UserEntity> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (divisionEntityId != null ? divisionEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the divisionEntityId fields are not set
        if (!(object instanceof DivisionEntity)) {
            return false;
        }
        DivisionEntity other = (DivisionEntity) object;
        if ((this.divisionEntityId == null && other.divisionEntityId != null) || (this.divisionEntityId != null && !this.divisionEntityId.equals(other.divisionEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.DivisionEntity[ id=" + divisionEntityId + " ]";
    }

}
