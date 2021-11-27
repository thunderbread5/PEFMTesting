/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.PECRatingDurationEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeletePECRatingDurationException;
import util.exception.InputDataValidationException;
import util.exception.PECRatingDurationExistedException;
import util.exception.PECRatingDurationNotFoundException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdatePECRatingDurationException;

/**
 *
 * @author zongh
 */
@Remote
public interface PECRatingDurationSessionBeanRemote {

    public Long createNewPECRatingDuration(PECRatingDurationEntity newEntity) throws PECRatingDurationExistedException, UnknownPersistenceException, InputDataValidationException;

    public List<PECRatingDurationEntity> retrieveAllPECRatingDuration();

    public PECRatingDurationEntity retrievePECRatingDurationByPECRatingDurationId(Long PECRatingDurationId) throws PECRatingDurationNotFoundException;

    public PECRatingDurationEntity retrievePECRatingDurationByPECRatingDurationDesc(String inPECRatingDurationDesc) throws PECRatingDurationNotFoundException;

    public void updatePECRatingDuration(PECRatingDurationEntity PECRatingDurationEntity) throws PECRatingDurationNotFoundException, UpdatePECRatingDurationException, InputDataValidationException;

    public void deletePECRatingDuration(Long PECRatingDurationID) throws PECRatingDurationNotFoundException, DeletePECRatingDurationException;

}
