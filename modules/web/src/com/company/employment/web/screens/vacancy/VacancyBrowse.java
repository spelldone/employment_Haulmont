package com.company.employment.web.screens.vacancy;

import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Vacancy;

@UiController("employment_Vacancy.browse")
@UiDescriptor("vacancy-browse.xml")
@LookupComponent("vacanciesTable")
@LoadDataBeforeShow
public class VacancyBrowse extends StandardLookup<Vacancy> {
    @Subscribe("vacanciesTable.registrationDate")
    public void onVacanciesTableRegistrationDateClick(Table.Column.ClickEvent<Vacancy> event) {

    }
}