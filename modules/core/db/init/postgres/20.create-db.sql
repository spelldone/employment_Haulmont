-- begin EMPLOYMENT_VACANCY
alter table EMPLOYMENT_VACANCY add constraint FK_EMPLOYMENT_VACANCY_ON_EMPLOYMENT_CENTER foreign key (EMPLOYMENT_CENTER_ID) references EMPLOYMENT_EMPLOYMENT_CENTER(ID)^
create index IDX_EMPLOYMENT_VACANCY_ON_EMPLOYMENT_CENTER on EMPLOYMENT_VACANCY (EMPLOYMENT_CENTER_ID)^
-- end EMPLOYMENT_VACANCY
-- begin EMPLOYMENT_REGISTRATION_CARD
alter table EMPLOYMENT_REGISTRATION_CARD add constraint FK_EMPLOYMENT_REGISTRATION_CARD_ON_EMPLOYMENT_CENTER foreign key (EMPLOYMENT_CENTER_ID) references EMPLOYMENT_EMPLOYMENT_CENTER(ID)^
alter table EMPLOYMENT_REGISTRATION_CARD add constraint FK_EMPLOYMENT_REGISTRATION_CARD_ON_CITIZEN foreign key (CITIZEN_ID) references EMPLOYMENT_CITIZEN(ID)^
create index IDX_EMPLOYMENT_REGISTRATION_CARD_ON_EMPLOYMENT_CENTER on EMPLOYMENT_REGISTRATION_CARD (EMPLOYMENT_CENTER_ID)^
create index IDX_EMPLOYMENT_REGISTRATION_CARD_ON_CITIZEN on EMPLOYMENT_REGISTRATION_CARD (CITIZEN_ID)^
-- end EMPLOYMENT_REGISTRATION_CARD
-- begin EMPLOYMENT_PROFESSION
create unique index IDX_EMPLOYMENT_PROFESSION_UK_NAME on EMPLOYMENT_PROFESSION (NAME) where DELETE_TS is null ^
-- end EMPLOYMENT_PROFESSION
-- begin EMPLOYMENT_CITIZEN
alter table EMPLOYMENT_CITIZEN add constraint FK_EMPLOYMENT_CITIZEN_ON_PROFESSION foreign key (PROFESSION_ID) references EMPLOYMENT_PROFESSION(ID)^
create index IDX_EMPLOYMENT_CITIZEN_ON_PROFESSION on EMPLOYMENT_CITIZEN (PROFESSION_ID)^
-- end EMPLOYMENT_CITIZEN
-- begin EMPLOYMENT_PROFESSION_VACANCY_LINK
alter table EMPLOYMENT_PROFESSION_VACANCY_LINK add constraint FK_PROVAC_ON_PROFESSION foreign key (PROFESSION_ID) references EMPLOYMENT_PROFESSION(ID)^
alter table EMPLOYMENT_PROFESSION_VACANCY_LINK add constraint FK_PROVAC_ON_VACANCY foreign key (VACANCY_ID) references EMPLOYMENT_VACANCY(ID)^
-- end EMPLOYMENT_PROFESSION_VACANCY_LINK
