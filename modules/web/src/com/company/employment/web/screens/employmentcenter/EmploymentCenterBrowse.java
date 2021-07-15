package com.company.employment.web.screens.employmentcenter;

import com.company.employment.entity.Citizen;
import com.company.employment.entity.RegistrationCard;
import com.company.employment.entity.Vacancy;
import com.company.employment.service.EmploymentCenterService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.EmploymentCenter;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.List;

@UiController("employment_EmploymentCenter.browse")
@UiDescriptor("employment-center-browse.xml")
@LookupComponent("employmentCentersTable")
@LoadDataBeforeShow

public class EmploymentCenterBrowse extends StandardLookup<EmploymentCenter> {
    @Inject
    private CollectionContainer<Citizen> citizensDc;
    @Inject
    private CollectionContainer<EmploymentCenter> employmentCentersDc;
    @Inject
    private CollectionContainer<Vacancy> vacanciesDc;
    @Inject
    private GroupTable<Vacancy> employmentCentersTable1;
    @Inject
    private GroupTable<Citizen> employmentCentersTable;
    @Inject
    private DataManager dataManager;
    @Inject
    private CollectionContainer<RegistrationCard> registrationCardsDc;
    @Inject
    private CollectionLoader<Citizen> citizensDl;
    @Inject
    private EmploymentCenterService employmentCenterService;


    @Subscribe("findJob")
    public void onFindJobClick(Button.ClickEvent event) {
        if (employmentCentersTable.getSelected().size() == 1) {
            Citizen currentCitizen = employmentCentersTable.getSingleSelected();
            vacanciesDc.setItems(employmentCenterService.findOpenVacanciesByProfession(currentCitizen));
        }
    }

    @Subscribe("getJob")
    public void onGetJobClick(Button.ClickEvent event) {
        if (employmentCentersTable.getSelected().size() == 1 && employmentCentersTable1.getSelected().size() == 1) {

            Citizen citizen = employmentCentersTable.getSingleSelected();
            Vacancy vacancy = employmentCentersTable1.getSingleSelected();
            List<RegistrationCard> registrationCards = registrationCardsDc.getMutableItems();
            if (vacancy.getProfessions().contains(citizen.getProfession())) {
                for (int i = 0; i < registrationCards.size(); i++) {
                    if (registrationCards.get(i).getCitizen().equals(citizen)) {
                        registrationCards.get(i).setStartWorkingDate(LocalDateTime.now());
                        if (vacancy.getRate() > 1 && vacancy.getSalary() > 25000) {
                            registrationCards.get(i).setIsPaidBenefit(false);
                        }
                        dataManager.commit(registrationCards.get(i));
                        break;
                    }
                }
                citizen.setIsWorking(true);
                vacancy.setIsOpen(false);
                dataManager.commit(citizen, vacancy);

            }
        }
    }



}