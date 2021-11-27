/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.FunctionEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeleteFunctionException;
import util.exception.FunctionAlreadyExistsException;
import util.exception.FunctionNotFoundException;
import util.exception.InputDataValidationException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateFunctionException;

/**
 *
 * @author poopy
 */
@Remote
public interface FunctionEntitySessionBeanRemote {

    public void deleteFunction(Long functionID) throws FunctionNotFoundException, DeleteFunctionException;

    public void updateFunction(FunctionEntity functionEntity) throws FunctionNotFoundException, UpdateFunctionException, InputDataValidationException;

    public FunctionEntity retrieveFunctionByFunctionName(String inFunctionName) throws FunctionNotFoundException;

    public FunctionEntity retrieveFunctionByFunctionId(Long functionId) throws FunctionNotFoundException;

    public List<FunctionEntity> retrieveAllFunctions();

    public FunctionEntity createNewFunction(FunctionEntity newEntity) throws FunctionAlreadyExistsException, UnknownPersistenceException, InputDataValidationException;

    public List<FunctionEntity> retrieveFunctionsWithListOfFunctionName (List<String> functionsToAdd) throws FunctionNotFoundException;

    public List<FunctionEntity> retrieveUserFunctions(Long userId);
    
    public List<FunctionEntity> retrieveAllFunctionsInMenu();

    public List<FunctionEntity> retrieveFCUserFunctions(Long userId);
    
}
