alter table EMPLOYMENT_PROFESSION_VACANCY_LINK add constraint FK_PROVAC_ON_PROFESSION foreign key (PROFESSION_ID) references EMPLOYMENT_PROFESSION(ID);
alter table EMPLOYMENT_PROFESSION_VACANCY_LINK add constraint FK_PROVAC_ON_VACANCY foreign key (VACANCY_ID) references EMPLOYMENT_VACANCY(ID);