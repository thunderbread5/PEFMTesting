/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.helper;

import ejb.entity.UserEntity;

/**
 *
 * @author nickg
 */
public class AgencyUserWrapper {

    private UserEntity userEntity;
    private String agencyName;
    private Long userEntityId;
    private UserEntity supervisor;

    public AgencyUserWrapper() {
        this.userEntity = null;
        this.agencyName = "";
        this.userEntityId = null;
        supervisor = null;
    }

    public AgencyUserWrapper(UserEntity userEntity, String agencyName, Long userEntityId, UserEntity supervisor) {
        this.userEntity = userEntity;
        this.agencyName = agencyName;
        this.userEntityId = userEntityId;
        this.supervisor = supervisor;
    }

    public AgencyUserWrapper(UserEntity userEntity, String agencyName, Long userEntityId) {
        this.userEntity = userEntity;
        this.agencyName = agencyName;
        this.userEntityId = userEntityId;
        this.supervisor = null;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Long getUserEntityId() {
        return userEntityId;
    }

    public void setUserEntityId(Long userEntityId) {
        this.userEntityId = userEntityId;
    }

    public UserEntity getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(UserEntity supervisor) {
        this.supervisor = supervisor;
    }

}
