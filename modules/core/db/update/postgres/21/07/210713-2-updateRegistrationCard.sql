alter table EMPLOYMENT_REGISTRATION_CARD rename column citizen_id to citizen_id__u80088 ;
alter table EMPLOYMENT_REGISTRATION_CARD alter column citizen_id__u80088 drop not null ;
alter table EMPLOYMENT_REGISTRATION_CARD drop constraint FK_EMPLOYMENT_REGISTRATION_CARD_ON_CITIZEN ;
drop index IDX_EMPLOYMENT_REGISTRATION_CARD_ON_CITIZEN ;
