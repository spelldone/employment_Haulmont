package com.company.employment.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;
import java.util.Set;

@Table(name = "EMPLOYMENT_VACANCY")
@Entity(name = "employment_Vacancy")
@NamePattern("%s %s %s|position,salary,employerName")
public class Vacancy extends StandardEntity {
    private static final long serialVersionUID = -15599425391105083L;

    @NotNull
    @Column(name = "POSITION", nullable = false)
    private String position;

    @NotNull
    @Column(name = "IS_OPEN", nullable = false)
    private Boolean isOpen = false;

    @NotNull
    @Column(name = "REGISTRATION_DATE", nullable = false)
    private LocalDateTime registrationDate;

    @NotNull
    @Column(name = "EMPLOYER_NAME", nullable = false)
    private String employerName;

    @Column(name = "SALARY")
    @Positive
    private Integer salary;

    @Column(name = "RATE")
    @Positive
    private Double rate;

    @JoinTable(name = "EMPLOYMENT_PROFESSION_VACANCY_LINK",
            joinColumns = @JoinColumn(name = "VACANCY_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROFESSION_ID"))
    @ManyToMany
    private Set<Profession> professions;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYMENT_CENTER_ID")
    private EmploymentCenter employmentCenter;

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public EmploymentCenter getEmploymentCenter() {
        return employmentCenter;
    }

    public void setEmploymentCenter(EmploymentCenter employmentCenter) {
        this.employmentCenter = employmentCenter;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setProfessions(Set<Profession> professions) {
        this.professions = professions;
    }

    public Set<Profession> getProfessions() {
        return professions;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}