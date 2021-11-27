/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nickg
 */
@Entity
public class DocumentRelevanceEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentRelevanceEntityId;
    
    @NotNull
    private String documentRelevance;

    public DocumentRelevanceEntity() {
    }

    public DocumentRelevanceEntity(String documentRelevance) {
        this.documentRelevance = documentRelevance;
    }

    public DocumentRelevanceEntity(DocumentRelevanceEntity doc) {
        this.documentRelevance = doc.getDocumentRelevance();
        this.documentRelevanceEntityId = null;
    }
    
    public Long getDocumentRelevanceEntityId() {
        return documentRelevanceEntityId;
    }

    public void setDocumentRelevanceEntityId(Long documentRelevanceEntityId) {
        this.documentRelevanceEntityId = documentRelevanceEntityId;
    }

    public String getDocumentRelevance() {
        return documentRelevance;
    }

    public void setDocumentRelevance(String documentRelevance) {
        this.documentRelevance = documentRelevance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentRelevanceEntityId != null ? documentRelevanceEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the documentRelevanceEntityId fields are not set
        if (!(object instanceof DocumentRelevanceEntity)) {
            return false;
        }
        DocumentRelevanceEntity other = (DocumentRelevanceEntity) object;
        if ((this.documentRelevanceEntityId == null && other.documentRelevanceEntityId != null) || (this.documentRelevanceEntityId != null && !this.documentRelevanceEntityId.equals(other.documentRelevanceEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.DocumentRelevanceEntity[ id=" + documentRelevanceEntityId + " ]";
    }
    
}
