alter table EMPLOYMENT_CITIZEN rename column employment_center_id to employment_center_id__u29767 ;
alter table EMPLOYMENT_CITIZEN alter column employment_center_id__u29767 drop not null ;
alter table EMPLOYMENT_CITIZEN drop constraint FK_EMPLOYMENT_CITIZEN_ON_EMPLOYMENT_CENTER ;
drop index IDX_EMPLOYMENT_CITIZEN_ON_EMPLOYMENT_CENTER ;
alter table EMPLOYMENT_CITIZEN rename column registration_card_id to registration_card_id__u56102 ;
alter table EMPLOYMENT_CITIZEN alter column registration_card_id__u56102 drop not null ;
alter table EMPLOYMENT_CITIZEN drop constraint FK_EMPLOYMENT_CITIZEN_ON_REGISTRATION_CARD ;
drop index IDX_EMPLOYMENT_CITIZEN_ON_REGISTRATION_CARD ;
