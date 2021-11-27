/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.PECFrequencyReviewEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeletePECFrequencyReviewException;
import util.exception.InputDataValidationException;
import util.exception.PECFrequencyReviewExistedException;
import util.exception.PECFrequencyReviewNotFoundException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdatePECFrequencyReviewException;

/**
 *
 * @author zongh
 */
@Remote
public interface PECFrequencyReviewEntitySessionBeanRemote {

    public Long createNewPECFrequencyReview(PECFrequencyReviewEntity newEntity) throws PECFrequencyReviewExistedException, UnknownPersistenceException, InputDataValidationException;

    public List<PECFrequencyReviewEntity> retrieveAllPECFrequencyReview();

    public PECFrequencyReviewEntity retrievePECFrequencyReviewByPECFrequencyReviewId(Long PECFrequencyReviewId) throws PECFrequencyReviewNotFoundException;

    public void updatePECFrequencyReview(PECFrequencyReviewEntity PECFrequencyReviewEntity) throws PECFrequencyReviewNotFoundException, UpdatePECFrequencyReviewException, InputDataValidationException;

    public void deletePECFrequencyReview(Long PECFrequencyReviewID) throws PECFrequencyReviewNotFoundException, DeletePECFrequencyReviewException;

    public PECFrequencyReviewEntity retrievePECFrequencyReviewByPECFrequencyReviewName(String inPECFrequencyReviewName) throws PECFrequencyReviewNotFoundException;
    
}
