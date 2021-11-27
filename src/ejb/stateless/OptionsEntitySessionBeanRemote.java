/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.OptionsEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeleteOptionsException;
import util.exception.InputDataValidationException;
import util.exception.OptionsNameExistedException;
import util.exception.OptionsNotFoundException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateOptionsException;

/**
 *
 * @author zongh
 */
@Remote
public interface OptionsEntitySessionBeanRemote {

    public Long createNewOptions(OptionsEntity newEntity) throws OptionsNameExistedException, UnknownPersistenceException, InputDataValidationException;

    public List<OptionsEntity> retrieveAllOptions();

    public OptionsEntity retrieveOptionsByOptionsId(Long OptionsId) throws OptionsNotFoundException;

    public OptionsEntity retrieveOptionsByOptions(String inOptions) throws OptionsNotFoundException;

    public void updateOptions(OptionsEntity OptionsEntity) throws OptionsNotFoundException, UpdateOptionsException, InputDataValidationException;

    public void deleteOptions(Long OptionsID) throws OptionsNotFoundException, DeleteOptionsException;

}
