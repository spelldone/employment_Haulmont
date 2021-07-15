package com.company.employment.web.screens.employmentcenter;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.EmploymentCenter;

@UiController("employment_EmploymentCenter.browse2")
@UiDescriptor("employment-center-browse2.xml")
@LookupComponent("employmentCentersTable")
@LoadDataBeforeShow
public class EmploymentCenterBrowse2 extends StandardLookup<EmploymentCenter> {
}