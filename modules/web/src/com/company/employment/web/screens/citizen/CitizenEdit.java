package com.company.employment.web.screens.citizen;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Citizen;

@UiController("employment_Citizen.edit")
@UiDescriptor("citizen-edit.xml")
@EditedEntityContainer("citizenDc")
@LoadDataBeforeShow
public class CitizenEdit extends StandardEditor<Citizen> {
    @Subscribe
    public void onInitEntity(InitEntityEvent<Citizen> event) {
        event.getEntity().setIsWorking(false);
    }
}