package com.company.employment.web.screens.employmentcenter;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.EmploymentCenter;

@UiController("employment_EmploymentCenter.selectionBrowse")
@UiDescriptor("employment-center-selection-browse.xml")
@LookupComponent("employmentCentersTable")
@LoadDataBeforeShow
public class EmploymentCenterSelectionBrowse extends StandardLookup<EmploymentCenter> {
}