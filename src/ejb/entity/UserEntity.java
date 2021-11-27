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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import util.security.CryptographicHelper;

/**
 *
 * @author nickg
 */
@Entity
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userEntityId;

    @NotNull
    @Size(min = 3, max = 150)
    private String userFullname;

    @Email
    @NotNull
    @Column(unique = true)
    private String userEmail;

    @Size(max = 32)
    private String password;

    @Size(max = 32)
    private String organisations;

    @Size(max = 8)
    private String phoneNumber;

    @NotNull
    private boolean isVerified;

    @NotNull
    private boolean isDisabled;

    @NotNull
    private boolean isDeleted;

    @NotNull
    private String validationURL;

    @Temporal(TemporalType.TIMESTAMP)
    private Date validateBy;

    @NotNull
    private String resetPasswordURL;

    @Temporal(TemporalType.TIMESTAMP)
    private Date validateResetPasswordLinkBy;

    @NotNull
    @Column(columnDefinition = "CHAR(32) NOT NULL")
    private String salt;

    @OneToOne
    private FCRaterInfoEntity fcRaterInfo;

    @OneToMany // mandatory
    private List<UserRoleEntity> listOfRoles;

    @OneToMany(mappedBy = "employeeInCharge")
    @JoinColumn(nullable = true)
    private List<DivisionEntity> listOfDivisionsIncharge;

    //mandatory for msf internal, agency users no division
    @ManyToOne(optional = true)
    @JoinColumn(nullable = true)
    private DivisionEntity division;

    //optional, but each programme must have an owner
    @ManyToMany(mappedBy = "listOfProgrammeOwners")
    @JoinTable(name = "programmeowners")
    private List<ProgrammeEntity> listOfProgrammes;

    //PEC, optional
    @ManyToMany(mappedBy = "listOfCEISStaffWithExtraAccessRight")
    @JoinTable(name = "extraaccessrights")
    private List<ProgrammeEntity> listOfAdditionalProgrammes;

    @OneToMany(mappedBy = "rater")
    private List<PECRatingEntity> listOfPECRating;

    public UserEntity() {
        this.salt = CryptographicHelper.getInstance().generateRandomString(32);
        this.fcRaterInfo = null;
        this.division = null;
        this.listOfDivisionsIncharge = new ArrayList();
        this.listOfAdditionalProgrammes = new ArrayList();
        this.listOfProgrammes = new ArrayList();
        this.listOfPECRating = new ArrayList();
        this.listOfRoles = new ArrayList();
        this.validationURL = "";
        this.validateBy = null;
        this.resetPasswordURL = "";
        this.validateResetPasswordLinkBy = null;
    }

    public UserEntity(UserEntity user) {
        this.userEntityId = user.getUserEntityId();
        this.userFullname = user.getUserFullname();
        this.userEmail = user.getUserEmail();
        this.password = user.getPassword();
        this.organisations = user.getOrganisations();
        this.phoneNumber = user.getPhoneNumber();
        this.isVerified = user.isIsVerified();
        this.isDisabled = user.isIsDisabled();
        this.isDeleted = user.isIsDeleted();
        this.validationURL = user.getValidationURL();
        this.validateBy = user.getValidateBy();
        this.resetPasswordURL = user.getResetPasswordURL();
        this.validateResetPasswordLinkBy = user.getValidateResetPasswordLinkBy();
        this.salt = user.getSalt();
        this.fcRaterInfo = user.getFcRaterInfo();
        this.listOfRoles = user.getListOfRoles();
        this.listOfDivisionsIncharge = user.getListOfDivisionsIncharge();
        this.division = user.getDivision();
        this.listOfProgrammes = user.getListOfProgrammes();
        this.listOfAdditionalProgrammes = user.getListOfAdditionalProgrammes();
        this.listOfPECRating = user.getListOfPECRating();
    }

    
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrganisations() {
        return organisations;
    }

    public void setOrganisations(String organisations) {
        this.organisations = organisations;
    }

    public String getResetPasswordURL() {
        return resetPasswordURL;
    }

    public void setResetPasswordURL(String resetPasswordURL) {
        this.resetPasswordURL = resetPasswordURL;
    }

    public Date getValidateResetPasswordLinkBy() {
        return validateResetPasswordLinkBy;
    }

    public void setValidateResetPasswordLinkBy(Date validateResetPasswordLinkBy) {
        this.validateResetPasswordLinkBy = validateResetPasswordLinkBy;
    }

    public List<DivisionEntity> getListOfDivisionsIncharge() {
        return listOfDivisionsIncharge;
    }

    public void setListOfDivisionsIncharge(List<DivisionEntity> listOfDivisionsIncharge) {
        this.listOfDivisionsIncharge = listOfDivisionsIncharge;
    }

    public UserEntity(String userFullname, String password, String userEmail, String organisations, String phoneNumber, String validationURL, Date validateBy, String resetPasswordURL, Date validateResetPasswordLinkBy) {
        this();
        this.userFullname = userFullname;
        this.userEmail = userEmail;
        this.phoneNumber = phoneNumber;
        this.organisations = organisations;
        this.validationURL = validationURL;
        this.validateBy = validateBy;
        this.resetPasswordURL = resetPasswordURL;
        this.validateResetPasswordLinkBy = validateResetPasswordLinkBy;
        this.salt = CryptographicHelper.getInstance().generateRandomString(32);
        this.setCryptoPassword(password);
    }

    public UserEntity(String userFullname, String password, String userEmail, String organisations, String phoneNumber) {
        this();
        this.userFullname = userFullname;
        this.userEmail = userEmail;
        this.setCryptoPassword(password);
        this.phoneNumber = phoneNumber;
        this.organisations = organisations;
    }

    public Long getUserEntityId() {
        return userEntityId;
    }

    public void setUserEntityId(Long userEntityId) {
        this.userEntityId = userEntityId;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setCryptoPassword(String password) {
        if (password != null) {
            this.password = CryptographicHelper.getInstance().byteArrayToHexString(CryptographicHelper.getInstance().doMD5Hashing(password + this.getSalt()));
        } else {
            this.password = null;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public boolean isIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public FCRaterInfoEntity getFcRaterInfo() {
        return fcRaterInfo;
    }

    public void setFcRaterInfo(FCRaterInfoEntity fcRaterInfo) {
        this.fcRaterInfo = fcRaterInfo;
    }

    public List<UserRoleEntity> getListOfRoles() {
        return listOfRoles;
    }

    public void setListOfRoles(List<UserRoleEntity> listOfRoles) {
        this.listOfRoles = listOfRoles;
    }

    public DivisionEntity getDivision() {
        return division;
    }

    public void setDivision(DivisionEntity division) {
        this.division = division;
    }

    public List<ProgrammeEntity> getListOfProgrammes() {
        return listOfProgrammes;
    }

    public void setListOfProgrammes(List<ProgrammeEntity> listOfProgrammes) {
        this.listOfProgrammes = listOfProgrammes;
    }

    public List<ProgrammeEntity> getListOfAdditionalProgrammes() {
        return listOfAdditionalProgrammes;
    }

    public void setListOfAdditionalProgrammes(List<ProgrammeEntity> listOfAdditionalProgrammes) {
        this.listOfAdditionalProgrammes = listOfAdditionalProgrammes;
    }

    public List<PECRatingEntity> getListOfPECRating() {
        return listOfPECRating;
    }

    public void setListOfPECRating(List<PECRatingEntity> listOfPECRating) {
        this.listOfPECRating = listOfPECRating;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getValidationURL() {
        return validationURL;
    }

    public void setValidationURL(String validationURL) {
        this.validationURL = validationURL;
    }

    public Date getValidateBy() {
        return validateBy;
    }

    public void setValidateBy(Date validateBy) {
        this.validateBy = validateBy;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userEntityId != null ? userEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the userEntityId fields are not set
        if (!(object instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) object;
        if ((this.userEntityId == null && other.userEntityId != null) || (this.userEntityId != null && !this.userEntityId.equals(other.userEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserEntity{" + "userEntityId=" + userEntityId + ", userFullname=" + userFullname + ", userEmail=" + userEmail + ", password=" + password + ", organisations=" + organisations + ", phoneNumber=" + phoneNumber + ", isVerified=" + isVerified + ", isDisabled=" + isDisabled + ", isDeleted=" + isDeleted + ", validationURL=" + validationURL + ", validateBy=" + validateBy + ", resetPasswordURL=" + resetPasswordURL + ", validateResetPasswordLinkBy=" + validateResetPasswordLinkBy + ", salt=" + salt +  ", fcRaterInfo=" + fcRaterInfo + ", listOfRoles=" + listOfRoles + ", listOfDivisionsIncharge=" + listOfDivisionsIncharge + ", division=" + division + ", listOfProgrammes=" + listOfProgrammes + ", listOfAdditionalProgrammes=" + listOfAdditionalProgrammes + ", listOfPECRating=" + listOfPECRating + '}';
    }

}
