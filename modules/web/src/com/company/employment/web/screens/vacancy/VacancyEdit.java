package com.company.employment.web.screens.vacancy;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Vacancy;

import java.time.LocalDateTime;

@UiController("employment_Vacancy.edit")
@UiDescriptor("vacancy-edit.xml")
@EditedEntityContainer("vacancyDc")
@LoadDataBeforeShow
public class VacancyEdit extends StandardEditor<Vacancy> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Vacancy> event) {
       Vacancy vacancy=  event.getEntity();
       vacancy.setIsOpen(true);
       vacancy.setRegistrationDate(LocalDateTime.now());
    }

}