package com.company.employment.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Table(name = "EMPLOYMENT_EMPLOYMENT_CENTER")
@Entity(name = "employment_EmploymentCenter")
@NamePattern("%s|city")
public class EmploymentCenter extends StandardEntity {
    private static final long serialVersionUID = 2714178021894614441L;

    @OneToMany(mappedBy = "employmentCenter")
    private Set<RegistrationCard> registrationCard;

    @NotNull
    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @NotNull
    @Column(name = "CITY", nullable = false)
    private String city;

    @OneToMany(mappedBy = "employmentCenter")
    private Set<Vacancy> vacancy;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<RegistrationCard> getRegistrationCard() {
        return registrationCard;
    }

    public void setRegistrationCard(Set<RegistrationCard> registrationCard) {
        this.registrationCard = registrationCard;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Vacancy> getVacancy() {
        return vacancy;
    }

    public void setVacancy(Set<Vacancy> vacancy) {
        this.vacancy = vacancy;
    }

}