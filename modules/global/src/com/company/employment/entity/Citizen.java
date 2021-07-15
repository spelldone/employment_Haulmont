package com.company.employment.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.global.DdlGeneration;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.CREATE_ONLY)
@Table(name = "EMPLOYMENT_CITIZEN")
@Entity(name = "employment_Citizen")
@NamePattern("%s %s %s|firstName,lastName,profession")
public class Citizen extends StandardEntity {
    private static final long serialVersionUID = -3171629251358172621L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "IS_REGISTERED", nullable = false)
    private Boolean isRegistered = false;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @JoinColumn(name = "PROFESSION_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Profession profession;

    @NotNull
    @Column(name = "IS_WORKING", nullable = false)
    private Boolean isWorking = false;

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Profession getProfession() {
        return profession;
    }

    public Boolean getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(Boolean isWorking) {
        this.isWorking = isWorking;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Citizen citizen = (Citizen) o;
        return Objects.equals(firstName, citizen.firstName) && Objects.equals(isRegistered, citizen.isRegistered) && Objects.equals(lastName, citizen.lastName) && Objects.equals(middleName, citizen.middleName) && Objects.equals(profession, citizen.profession) && Objects.equals(isWorking, citizen.isWorking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, isRegistered, lastName, middleName, profession, isWorking);
    }
}