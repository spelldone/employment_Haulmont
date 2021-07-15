package com.company.employment.web.screens.employmentcenter;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.EmploymentCenter;

@UiController("employment_EmploymentCenter.edit")
@UiDescriptor("employment-center-edit.xml")
@EditedEntityContainer("employmentCenterDc")
@LoadDataBeforeShow
public class EmploymentCenterEdit extends StandardEditor<EmploymentCenter> {
}