/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.stateless;

import ejb.entity.DocumentRelevanceEntity;
import java.util.List;
import javax.ejb.Remote;
import util.exception.DeleteDocumentRelevanceException;
import util.exception.DocumentRelevanceExistedException;
import util.exception.DocumentRelevanceNotFoundException;
import util.exception.InputDataValidationException;
import util.exception.UnknownPersistenceException;
import util.exception.UpdateDocumentRelevanceException;

/**
 *
 * @author zongh
 */
@Remote
public interface DocumentRelevanceEntitySessionBeanRemote {

    public Long createNewDocumentRelevance(DocumentRelevanceEntity newEntity) throws DocumentRelevanceExistedException, UnknownPersistenceException, InputDataValidationException;

    public List<DocumentRelevanceEntity> retrieveAllDocumentRelevance();

    public DocumentRelevanceEntity retrieveDocumentRelevanceByDocumentRelevanceId(Long DocumentRelevanceId) throws DocumentRelevanceNotFoundException;

    public DocumentRelevanceEntity retrieveDocumentRelevanceByDocumentRelevanceName(String inDocumentRelevanceName) throws DocumentRelevanceNotFoundException;

    public void deleteDocumentRelevance(Long DocumentRelevanceID) throws DocumentRelevanceNotFoundException, DeleteDocumentRelevanceException;

    public void updateDocumentRelevance(DocumentRelevanceEntity DocumentRelevanceEntity) throws DocumentRelevanceNotFoundException, UpdateDocumentRelevanceException, InputDataValidationException;
    
}
