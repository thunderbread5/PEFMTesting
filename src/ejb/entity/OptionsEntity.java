/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author nickg
 */
@Entity
public class OptionsEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long optionEntityId;

    @NotNull
    private String optionName;

    @NotNull
    private String optionValue;

    @NotNull
    @Column(length = 10000)
    private String optionDescription;

    public OptionsEntity(OptionsEntity o) {
        this.optionEntityId = null;

        this.optionName = o.optionName;

        this.optionValue = o.optionValue;

        this.optionDescription = o.optionDescription;
    }

    public OptionsEntity() {
    }

    public OptionsEntity(String optionName, String optionValue, String optionDescription) {
        this.optionName = optionName;
        this.optionValue = optionValue;
        this.optionDescription = optionDescription;
    }

    public Long getOptionEntityId() {
        return optionEntityId;
    }

    public void setOptionEntityId(Long optionEntityId) {
        this.optionEntityId = optionEntityId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getOptionDescription() {
        return optionDescription;
    }

    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (optionEntityId != null ? optionEntityId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the optionEntityId fields are not set
        if (!(object instanceof OptionsEntity)) {
            return false;
        }
        OptionsEntity other = (OptionsEntity) object;
        if ((this.optionEntityId == null && other.optionEntityId != null) || (this.optionEntityId != null && !this.optionEntityId.equals(other.optionEntityId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.OptionsEntity[ id=" + optionEntityId + " ]";
    }

}
