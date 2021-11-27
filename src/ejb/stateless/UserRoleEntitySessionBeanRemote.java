/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.ModuleEntity;
import ejb.entity.UserRoleEntity;
import java.util.List;
import javax.ejb.Remote;
import util.enumeration.FCAccessLevelEnum;
import util.enumeration.PECAccessLevelEnum;
import util.exception.DeleteUserRoleException;
import util.exception.FunctionNotFoundException;
import util.exception.InputDataValidationException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateUserRoleException;
import util.exception.UserRoleAlreadyExistsException;
import util.exception.UserRoleIsDefaultCannotBeDeletedException;
import util.exception.UserRoleNotFoundException;

/**
 *
 * @author poopy
 */
@Remote
public interface UserRoleEntitySessionBeanRemote {

    public void deleteUserRole(Long userRoleID) throws UserRoleNotFoundException, DeleteUserRoleException, UserRoleIsDefaultCannotBeDeletedException;

    public UserRoleEntity updateUserRole(UserRoleEntity userRoleEntity) throws UserRoleNotFoundException, UpdateUserRoleException, InputDataValidationException, FunctionNotFoundException;

    public UserRoleEntity retrieveUserRoleByUserRoleName(String inUserRoleName) throws UserRoleNotFoundException;

    public UserRoleEntity retrieveUserRoleByUserRoleId(Long userRoleId) throws UserRoleNotFoundException;

    public List<UserRoleEntity> retrieveAllUserRole();

    public UserRoleEntity createNewUserRole(UserRoleEntity newEntity) throws UserRoleAlreadyExistsException, UnknownPersistenceException, InputDataValidationException, FunctionNotFoundException;

    public List<ModuleEntity> retrieveListOfModulesByUserRoleId(Long userRoleId) throws UserRoleNotFoundException;

    public List<UserRoleEntity> retrieveAllFCUserRole();

    public List<UserRoleEntity> retrieveAllPECUserRole();

    public UserRoleEntity retrieveUserRoleByAccessRole(FCAccessLevelEnum fcRole, PECAccessLevelEnum pecRole) throws UserRoleNotFoundException;

    public List<FCAccessLevelEnum> retrieveFCUserAccess(Long userId);

    public List<PECAccessLevelEnum> retrievePECUserAccess(Long userId);

      public UserRoleEntity retrieveUserRoleByAccessRoleDefault(FCAccessLevelEnum fcRole) throws UserRoleNotFoundException;

    public String retrieveAllUserName(List<UserRoleEntity> userroles);

    public String retrieveAllUserNameByIds(List<UserRoleEntity> userIds);
}
