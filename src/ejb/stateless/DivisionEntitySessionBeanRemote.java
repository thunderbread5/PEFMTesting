/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.DivisionEntity;
import ejb.entity.ProgrammeEntity;
import ejb.entity.UserEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeleteDivisionException;
import util.exception.DivisionNameExistedException;
import util.exception.DivisionNotFoundException;
import util.exception.InputDataValidationException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateDivisionException;
import util.exception.UserNotFoundException;

/**
 *
 * @author zongh
 */
@Remote
public interface DivisionEntitySessionBeanRemote {

    public long createNewDivision(DivisionEntity newDivisionEntity) throws DivisionNameExistedException, UnknownPersistenceException, InputDataValidationException;

    public List<DivisionEntity> retrieveAllDivisions();

    public DivisionEntity retrieveDivisionByDivisionId(Long divisionId) throws DivisionNotFoundException;

    public DivisionEntity retrieveDivisionByDivisionName(String divisionName) throws DivisionNotFoundException;

    public void updateDivision(DivisionEntity divisionEntity) throws DivisionNotFoundException, UpdateDivisionException, InputDataValidationException;

    public void deleteDivision(Long divisonId) throws DivisionNotFoundException, DeleteDivisionException;

    public DivisionEntity retrieveDivisionByUser(UserEntity user) throws DivisionNotFoundException;

    public List<DivisionEntity> retrieveDivisionByListOfDivision(List<DivisionEntity> listOfDivision) throws DivisionNotFoundException;

    public List<DivisionEntity> retrieveListOfDivisionInChargeByUserEntityId(Long userId) throws UserNotFoundException;
    
     public List<ProgrammeEntity> retrieveListOfProgrammeFromDeskhead(Long userId) throws UserNotFoundException;
}
