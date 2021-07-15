package com.company.employment.web.screens.registrationcard;

import com.company.employment.entity.Citizen;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.LookupScreenFacet;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.employment.entity.RegistrationCard;

import javax.inject.Inject;
import java.time.LocalDateTime;

@UiController("employment_RegistrationCard.edit")
@UiDescriptor("registration-card-edit.xml")
@EditedEntityContainer("registrationCardDc")
@LoadDataBeforeShow
public class RegistrationCardEdit extends StandardEditor<RegistrationCard> {
    @Inject
    private LookupScreenFacet<Citizen, Screen> lookupscreen_2;
    @Inject
    private PickerField<Citizen> citizenField;
    @Inject
    private InstanceContainer<RegistrationCard> registrationCardDc;
    @Inject
    private CollectionContainer<Citizen> citizensDc;
    @Inject
    private CollectionLoader<Citizen> citizensDl;

    @Subscribe
    public void onInitEntity(InitEntityEvent<RegistrationCard> event) {
        RegistrationCard newRegistrationCard = event.getEntity();
        newRegistrationCard.setRegistrationDate(LocalDateTime.now());
        newRegistrationCard.setIsPaidBenefit(true);
        newRegistrationCard.setBenefitSize(15000);


    }

    @Subscribe("citizenField.lookup")
    public void onCitizenFieldLookup(Action.ActionPerformedEvent event) {
        lookupscreen_2.show();
    }

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
        if(citizenField.getValue()!=null) {
            Citizen citizen = citizenField.getValue();
            citizen.setIsRegistered(true);
            commitChanges();
        }
    }





}