/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rayta
 */
@Entity
public class FCSupervisorPractitionerEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fcSupervisorPractitionerEntity;

    @NotNull
    @OneToOne
    private UserEntity supervisor;

    @NotNull
    @OneToOne
    private UserEntity practitioner;

    @NotNull
    @OneToOne
    private ProgrammeEntity programme;

    public FCSupervisorPractitionerEntity() {
    }

    public FCSupervisorPractitionerEntity(UserEntity supervisor, UserEntity practitioner, ProgrammeEntity programme) {
        this.supervisor = supervisor;
        this.practitioner = practitioner;
        this.programme = programme;
    }

    public Long getFcSupervisorPractitionerEntity() {
        return fcSupervisorPractitionerEntity;
    }

    public void setFcSupervisorPractitionerEntity(Long fcSupervisorPractitionerEntity) {
        this.fcSupervisorPractitionerEntity = fcSupervisorPractitionerEntity;
    }

    public UserEntity getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(UserEntity supervisor) {
        this.supervisor = supervisor;
    }

    public UserEntity getPractitioner() {
        return practitioner;
    }

    public void setPractitioner(UserEntity practitioner) {
        this.practitioner = practitioner;
    }

    public ProgrammeEntity getProgramme() {
        return programme;
    }

    public void setProgramme(ProgrammeEntity programme) {
        this.programme = programme;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FCSupervisorPractitionerEntity other = (FCSupervisorPractitionerEntity) obj;
        if (!Objects.equals(this.fcSupervisorPractitionerEntity, other.fcSupervisorPractitionerEntity)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FCSupervisorPractitionerEntity{" + "fcSupervisorPractitionerEntity=" + fcSupervisorPractitionerEntity + ", supervisor=" + supervisor + ", practitioner=" + practitioner + ", programme=" + programme + '}';
    }
}
