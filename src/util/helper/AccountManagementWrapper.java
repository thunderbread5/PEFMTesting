/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import ejb.entity.AgencyEntity;
import ejb.entity.ProgrammeEntity;
import ejb.entity.UserEntity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import util.enumeration.SystemTypeEnum;

/**
 *
 * @author sohqi
 */
public class AccountManagementWrapper {

    //identifier
    private Long accountManagementId;

    // cater for common (UserEntity)
    private String fullName;
    private String email;
    private Long userRoleId;
    private String roleName;
    private Long userEntityId;
    private boolean userEntityIsDeleted;
    private boolean userEntityIsDisabled;
    private String organization;
    private String phoneNo;
    //cater for agency
    private Long agencyId;
    private String agencyName;
    private boolean agencyIsDeleted;
    private boolean agencyIsDisabled;
    //cater for pec
    private Long divisionId;
    private String divisionName;
    // how many roleName
    private Long noOfRoleName;
    //ProgrammeEntity
    private List<ProgrammeEntity> listOfProgrammes;
    private Long programmeId;
    // FCRaterInfo
    private Long fcRaterInfoEntityId;
    private Date certifiedDate;
    //SystemTypeEnum
    private SystemTypeEnum systemTypeEnum;
    
    public AccountManagementWrapper() {
        listOfProgrammes = new ArrayList<>();
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }
    
    public Long getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(Long programmeId) {
        this.programmeId = programmeId;
    }

    public Long getFcRaterInfoEntityId() {
        return fcRaterInfoEntityId;
    }

    public SystemTypeEnum getSystemTypeEnum() {
        return systemTypeEnum;
    }

    public void setSystemTypeEnum(SystemTypeEnum systemTypeEnum) {
        this.systemTypeEnum = systemTypeEnum;
    }
    

    public void setFcRaterInfoEntityId(Long fcRaterInfoEntityId) {
        this.fcRaterInfoEntityId = fcRaterInfoEntityId;
    }

    public Date getCertifiedDate() {
        return certifiedDate;
    }

    public void setCertifiedDate(Date certifiedDate) {
        this.certifiedDate = certifiedDate;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public List<ProgrammeEntity> getListOfProgrammes() {
        return listOfProgrammes;
    }

    public void setListOfProgrammes(List<ProgrammeEntity> listOfProgrammes) {
        this.listOfProgrammes = listOfProgrammes;
    }

    public boolean isUserEntityIsDeleted() {
        return userEntityIsDeleted;
    }

    public void setUserEntityIsDeleted(boolean userEntityIsDeleted) {
        this.userEntityIsDeleted = userEntityIsDeleted;
    }

    public boolean isUserEntityIsDisabled() {
        return userEntityIsDisabled;
    }

    public void setUserEntityIsDisabled(boolean userEntityIsDisabled) {
        this.userEntityIsDisabled = userEntityIsDisabled;
    }

    public boolean isAgencyIsDeleted() {
        return agencyIsDeleted;
    }

    public void setAgencyIsDeleted(boolean agencyIsDeleted) {
        this.agencyIsDeleted = agencyIsDeleted;
    }

    public boolean isAgencyIsDisabled() {
        return agencyIsDisabled;
    }

    public void setAgencyIsDisabled(boolean agencyIsDisabled) {
        this.agencyIsDisabled = agencyIsDisabled;
    }

    public Long getAccountManagementId() {
        return accountManagementId;
    }

    public void setAccountManagementId(Long accountManagementId) {
        this.accountManagementId = accountManagementId;
    }

    public Long getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Long divisionId) {
        this.divisionId = divisionId;
    }

    public Long getNoOfRoleName() {
        return noOfRoleName;
    }

    public void setNoOfRoleName(Long noOfRoleName) {
        this.noOfRoleName = noOfRoleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getUserEntityId() {
        return userEntityId;
    }

    public void setUserEntityId(Long userEntityId) {
        this.userEntityId = userEntityId;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

}

