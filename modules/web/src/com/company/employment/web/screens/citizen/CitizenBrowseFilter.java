package com.company.employment.web.screens.citizen;

import com.haulmont.cuba.core.global.LoadContext;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Citizen;

import java.util.List;

@UiController("employment_Citizen.browseFilter")
@UiDescriptor("citizen-browse-filter.xml")
@LookupComponent("citizensTable")
@LoadDataBeforeShow
public class CitizenBrowseFilter extends StandardLookup<Citizen> {


}