/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import util.enumeration.RatingTypeEnum;

/**
 *
 * @author nickg
 */
@Entity
public class QuestionEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionEntityId;

    @NotNull
    private String actualQuestion;

    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @NotNull
    private String justification;

    @Enumerated(EnumType.STRING)
    private RatingTypeEnum ratingType;

    @NotNull
    private String value1;

    @NotNull
    private String value2;
    
    @NotNull
    private String selectedValue;

    @NotNull
    private String questionDescription;

    @NotNull
    private String questionComment;

    @OneToMany
    private List<OptionsEntity> listOfOptions;

    @OneToMany
    private List<FileEntity> listOfFilesForQuestion;

    @NotNull
    private boolean required;

    public QuestionEntity() {
        this.listOfOptions = new ArrayList();
        this.listOfFilesForQuestion = new ArrayList();
    }

    public QuestionEntity(QuestionEntity q) {
        this.questionEntityId = null;
        this.actualQuestion = q.getActualQuestion();
        this.dateCreated = q.getDateCreated();
        this.justification = q.getJustification();
        this.ratingType = q.getRatingType();
        this.value1 = q.getValue1();
        this.value2 = q.getValue2();
        this.selectedValue = q.getSelectedValue();
        this.questionDescription = q.getQuestionDescription();
        this.questionComment = q.getQuestionComment();
        this.required = q.isRequired();
        this.listOfOptions = new ArrayList<>(q.getListOfOptions());
        this.listOfFilesForQuestion = new ArrayList<>(q.getListOfFilesForQuestion());
    }

    public QuestionEntity(String actualQuestion, Date dateCreated, String justification, RatingTypeEnum ratingType, String value1, String value2, String selectedValue, String questionDescription, String questioncomment, boolean required) {
        this();
        this.actualQuestion = actualQuestion;
        this.dateCreated = dateCreated;
        this.justification = justification;
        this.ratingType = ratingType;
        this.value1 = value1;
        this.value2 = value2;
        this.selectedValue = selectedValue;
        this.questionDescription = questionDescription;
        this.questionComment = questioncomment;
        this.required = required;
    }

    public QuestionEntity(String actualQuestion, Date dateCreated, String justification, RatingTypeEnum ratingType, String value1, String value2, String selectedValue, String questionDescription, String questioncomment, boolean required, List<OptionsEntity> listOfOptions) {
        this();
        this.actualQuestion = actualQuestion;
        this.dateCreated = dateCreated;
        this.justification = justification;
        this.ratingType = ratingType;
        this.value1 = value1;
        this.value2 = value2;
        this.selectedValue = selectedValue;
        this.questionDescription = questionDescription;
        this.questionComment = questioncomment;
        this.required = required;
        this.listOfOptions = listOfOptions;
    }

    public Long getQuestionEntityId() {
        return questionEntityId;
    }

    public void setQuestionEntityId(Long questionEntityId) {
        this.questionEntityId = questionEntityId;
    }

    public String getActualQuestion() {
        return actualQuestion;
    }

    public void setActualQuestion(String actualQuestion) {
        this.actualQuestion = actualQuestion;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public RatingTypeEnum getRatingType() {
        return ratingType;
    }

    public void setRatingType(RatingTypeEnum ratingType) {
        this.ratingType = ratingType;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public String getQuestionComment() {
        return questionComment;
    }

    public void setQuestionComment(String questionComment) {
        this.questionComment = questionComment;
    }

    public List<FileEntity> getListOfFilesForQuestion() {
        return listOfFilesForQuestion;
    }

    public void setListOfFilesForQuestion(List<FileEntity> listOfFilesForQuestion) {
        this.listOfFilesForQuestion = listOfFilesForQuestion;
    }

    public List<OptionsEntity> getListOfOptions() {
        return listOfOptions;
    }

    public void setListOfOptions(List<OptionsEntity> listOfOptions) {
        this.listOfOptions = listOfOptions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionEntityId != null ? questionEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the questionEntityId fields are not set
        if (!(object instanceof QuestionEntity)) {
            return false;
        }
        QuestionEntity other = (QuestionEntity) object;
        if ((this.questionEntityId == null && other.questionEntityId != null) || (this.questionEntityId != null && !this.questionEntityId.equals(other.questionEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.QuestionEntity[ id=" + questionEntityId + " ]";
    }

    /**
     * @return the required
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * @param required the required to set
     */
    public void setRequired(boolean required) {
        this.required = required;
    }
}
