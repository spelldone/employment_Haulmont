package com.company.employment.web.screens.registrationcard;

import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.RegistrationCard;

@UiController("employment_RegistrationCard.browse")
@UiDescriptor("registration-card-browse.xml")
@LookupComponent("registrationCardsTable")
@LoadDataBeforeShow
public class RegistrationCardBrowse extends StandardLookup<RegistrationCard> {
}