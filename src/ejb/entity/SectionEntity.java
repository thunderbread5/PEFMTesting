/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nickg
 */
@Entity
public class SectionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sectionEntityId;

    @NotNull
    private String sectionName;

    @NotNull
    private String sectionComment;

    @OneToMany(mappedBy = "mainSection")
    private List<SectionEntity> listOfSubSections;

    @ManyToOne
    private SectionEntity mainSection;

    @OneToMany
    private List<QuestionEntity> listOfQuestions;

    public SectionEntity() {
        this.listOfSubSections = new ArrayList();
    }

    public SectionEntity(SectionEntity s) {
        this.sectionEntityId = null;
        this.sectionName = s.getSectionName();
        this.sectionComment = s.getSectionComment();
        this.sectionEntityId = s.getSectionEntityId();
        this.listOfSubSections = new ArrayList<>(s.getListOfSubSections());
        this.listOfQuestions = new ArrayList<>(s.getListOfQuestions());
        this.mainSection = s.getMainSection();
    }

    public SectionEntity(String sectionName, String sectionComment, List<QuestionEntity> listOfQuestions) {
        this.sectionName = sectionName;
        this.sectionComment = sectionComment;
        this.listOfQuestions = listOfQuestions;
        this.listOfSubSections = new ArrayList();
        this.mainSection = null;
    }

    public SectionEntity(String sectionName, String sectionComment, List<SectionEntity> listOfSubSections, SectionEntity mainSection) {
        this.sectionName = sectionName;
        this.sectionComment = sectionComment;
        this.listOfSubSections = listOfSubSections;
        this.mainSection = mainSection;
        this.listOfQuestions = new ArrayList<>();
    }

    public SectionEntity(String sectionName, String sectionComment, List<SectionEntity> listOfSubSections, SectionEntity mainSection, List<QuestionEntity> listOfQuestions) {
        this.sectionName = sectionName;
        this.sectionComment = sectionComment;
        this.listOfSubSections = listOfSubSections;
        this.mainSection = mainSection;
        this.listOfQuestions = listOfQuestions;
    }

    public Long getSectionEntityId() {
        return sectionEntityId;
    }

    public void setSectionEntityId(Long sectionEntityId) {
        this.sectionEntityId = sectionEntityId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionComment() {
        return sectionComment;
    }

    public void setSectionComment(String sectionComment) {
        this.sectionComment = sectionComment;
    }

    public List<SectionEntity> getListOfSubSections() {
        return listOfSubSections;
    }

    public void setListOfSubSections(List<SectionEntity> listOfSubSections) {
        this.listOfSubSections = listOfSubSections;
    }

    public SectionEntity getMainSection() {
        return mainSection;
    }

    public void setMainSection(SectionEntity mainSection) {
        this.mainSection = mainSection;
    }

    public List<QuestionEntity> getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(List<QuestionEntity> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sectionEntityId != null ? sectionEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the sectionEntityId fields are not set
        if (!(object instanceof SectionEntity)) {
            return false;
        }
        SectionEntity other = (SectionEntity) object;
        if ((this.sectionEntityId == null && other.sectionEntityId != null) || (this.sectionEntityId != null && !this.sectionEntityId.equals(other.sectionEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.SectionEntity[ id=" + sectionEntityId + " ]";
    }

}
