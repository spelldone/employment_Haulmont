package com.company.employment.web.screens.citizen;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Citizen;

@UiController("employment_Citizen.browse")
@UiDescriptor("citizen-browse.xml")
@LookupComponent("citizensTable")
@LoadDataBeforeShow
public class CitizenBrowse extends StandardLookup<Citizen> {
}