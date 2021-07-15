package com.company.employment.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;

@Table(name = "EMPLOYMENT_REGISTRATION_CARD")
@Entity(name = "employment_RegistrationCard")
@NamePattern("%s|citizen")
public class RegistrationCard extends StandardEntity {
    private static final long serialVersionUID = 4360572763958631485L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EMPLOYMENT_CENTER_ID")
    private EmploymentCenter employmentCenter;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CITIZEN_ID", unique = true)
    private Citizen citizen;

    @NotNull
    @Column(name = "REGISTRATION_DATE", nullable = false)
    private LocalDateTime registrationDate;

    @NotNull
    @Column(name = "BENEFIT_SIZE", nullable = false)
    @PositiveOrZero
    private Integer benefitSize;

    @NotNull
    @Column(name = "IS_PAID_BENEFIT", nullable = false)
    private Boolean isPaidBenefit = false;

    @Column(name = "START_WORKING_DATE")
    private LocalDateTime startWorkingDate;

    public Citizen getCitizen() {
        return citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }


    public EmploymentCenter getEmploymentCenter() {
        return employmentCenter;
    }

    public void setEmploymentCenter(EmploymentCenter employmentCenter) {
        this.employmentCenter = employmentCenter;
    }

    public LocalDateTime getStartWorkingDate() {
        return startWorkingDate;
    }

    public void setStartWorkingDate(LocalDateTime startWorkingDate) {
        this.startWorkingDate = startWorkingDate;
    }

    public Boolean getIsPaidBenefit() {
        return isPaidBenefit;
    }

    public void setIsPaidBenefit(Boolean isPaidBenefit) {
        this.isPaidBenefit = isPaidBenefit;
    }

    public Integer getBenefitSize() {
        return benefitSize;
    }

    public void setBenefitSize(Integer benefitSize) {
        this.benefitSize = benefitSize;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

}