package com.company.employment.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Table(name = "EMPLOYMENT_PROFESSION")
@Entity(name = "employment_Profession")
@NamePattern("%s|name")
public class Profession extends StandardEntity {
    private static final long serialVersionUID = -3045742289742547225L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @ManyToMany
    @JoinTable(name = "EMPLOYMENT_PROFESSION_VACANCY_LINK",
            joinColumns = @JoinColumn(name = "PROFESSION_ID"),
            inverseJoinColumns = @JoinColumn(name = "VACANCY_ID"))
    private Set<Vacancy> vacancy;

    public void setVacancy(Set<Vacancy> vacancy) {
        this.vacancy = vacancy;
    }

    public Set<Vacancy> getVacancy() {
        return vacancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}