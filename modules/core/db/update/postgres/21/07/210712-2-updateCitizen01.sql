alter table EMPLOYMENT_CITIZEN add constraint FK_EMPLOYMENT_CITIZEN_ON_EMPLOYMENT_CENTER foreign key (EMPLOYMENT_CENTER_ID) references EMPLOYMENT_EMPLOYMENT_CENTER(ID);
create index IDX_EMPLOYMENT_CITIZEN_ON_EMPLOYMENT_CENTER on EMPLOYMENT_CITIZEN (EMPLOYMENT_CENTER_ID);
