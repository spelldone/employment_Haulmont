package com.company.employment.web.screens.profession;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.Profession;

@UiController("employment_Profession.browse")
@UiDescriptor("profession-browse.xml")
@LookupComponent("professionsTable")
@LoadDataBeforeShow
public class ProfessionBrowse extends StandardLookup<Profession> {
}