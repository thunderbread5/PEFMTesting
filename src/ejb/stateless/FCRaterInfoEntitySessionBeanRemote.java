/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.FCRaterInfoEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeleteFCRaterInfoException;
import util.exception.DivisionNotFoundException;
import util.exception.FCRaterInfoAlreadyExistedException;
import util.exception.FCRaterInfoNotFoundException;
import util.exception.InputDataValidationException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateFCRaterInfoException;

/**
 *
 * @author zongh
 */
@Remote
public interface FCRaterInfoEntitySessionBeanRemote {

    public FCRaterInfoEntity createNewFCRaterInfo(FCRaterInfoEntity newFCRaterInfoEntity) throws FCRaterInfoAlreadyExistedException, UnknownPersistenceException, InputDataValidationException;

    public List<FCRaterInfoEntity> retrieveAllFCRaters();

    public FCRaterInfoEntity retrieveFCRaterInfoByFCRaterId(Long fcRaterInfoId) throws FCRaterInfoNotFoundException;

    public List<FCRaterInfoEntity> retrieveAllFCRatersByFCRaterName(String fcRaterInfoName);

    public void updateFCRaterInfo(FCRaterInfoEntity fcRaterInfo) throws FCRaterInfoNotFoundException, UpdateFCRaterInfoException, InputDataValidationException;

    public void deleteFCRaterInfoEntity(Long fcRaterInfoId) throws FCRaterInfoNotFoundException, DeleteFCRaterInfoException;
}
