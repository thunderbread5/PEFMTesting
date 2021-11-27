/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.FunctionEntity;
import ejb.entity.ModuleEntity;
import java.util.List;
import javax.ejb.Remote;
import util.enumeration.SystemTypeEnum;
import util.exception.DeleteModuleException;
import util.exception.InputDataValidationException;
import util.exception.ModuleAlreadyExistsException;
import util.exception.ModuleNotFoundException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateModuleException;

/**
 *
 * @author poopy
 */
@Remote
public interface ModuleEntitySessionBeanRemote {

    public void deleteModule(Long moduleID) throws ModuleNotFoundException, DeleteModuleException;

    public void updateModule(ModuleEntity moduleEntity) throws ModuleNotFoundException, UpdateModuleException, InputDataValidationException;

    public ModuleEntity retrieveModuleByModuleName(String inModuleName) throws ModuleNotFoundException;

    public ModuleEntity retrieveModuleByModuleId(Long moduleId) throws ModuleNotFoundException;

    public List<ModuleEntity> retrieveAllModules();

    public ModuleEntity createNewModule(ModuleEntity newEntity) throws ModuleAlreadyExistsException, UnknownPersistenceException, InputDataValidationException;

    public List<FunctionEntity> retrieveListOfFunctionsByModuleId(Long moduleId) throws ModuleNotFoundException;

    public List<ModuleEntity> retrieveModuleBySystemType(SystemTypeEnum systemAccess) throws ModuleNotFoundException;

    public List<ModuleEntity> retrieveModuleBySystemTypeAndModuleName(String inModuleName, SystemTypeEnum systemAccess) throws ModuleNotFoundException;

    public List<ModuleEntity> retrieveModulesForUserHeaderPEFM(Long userId);

    public List<ModuleEntity> retrievePECTemplatedModules();

    public List<ModuleEntity> retrieveFCTemplatedModules();

    public ModuleEntity retrieveTemplateModuleBySystemTypeAndModuleName(String inModuleName, SystemTypeEnum systemAccess) throws ModuleNotFoundException;

    public List<ModuleEntity> retrieveModulesForUserHeaderExternalFC(Long userId);

}
