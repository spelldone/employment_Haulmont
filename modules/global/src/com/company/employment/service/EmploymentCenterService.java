package com.company.employment.service;

import com.company.employment.entity.Citizen;
import com.company.employment.entity.RegistrationCard;
import com.company.employment.entity.Vacancy;
import com.haulmont.cuba.core.global.DataManager;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public interface EmploymentCenterService {
    String NAME = "employment_EmploymentCenterService";



    public List<Vacancy> findOpenVacanciesByProfession(Citizen citizen) ;




}