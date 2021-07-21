package com.company.employment.service;

import com.company.employment.entity.Citizen;
import com.company.employment.entity.RegistrationCard;
import com.company.employment.entity.Vacancy;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Service(EmploymentCenterService.NAME)
public class EmploymentCenterServiceBean implements EmploymentCenterService {
    @Inject
    private DataManager dataManager;

    @Override
    public List<Vacancy> findOpenVacanciesByProfession(Citizen citizen) {
        List<Vacancy> vacancies = dataManager.load(Vacancy.class)
                .query("select s from employment_Vacancy s where s.isOpen=true")
                .view("vacancy-view")
                .list();
        List<Vacancy> needVacancies = new ArrayList<Vacancy>();
        for (Vacancy vacancy:vacancies) {
            if (vacancy.getProfessions().contains(citizen.getProfession())) {
                needVacancies.add(vacancy);
            }
        }
        return needVacancies;
    }


}