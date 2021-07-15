package com.company.employment.web.screens.profession;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Profession;

@UiController("employment_Profession.edit")
@UiDescriptor("profession-edit.xml")
@EditedEntityContainer("professionDc")
@LoadDataBeforeShow
public class ProfessionEdit extends StandardEditor<Profession> {
}