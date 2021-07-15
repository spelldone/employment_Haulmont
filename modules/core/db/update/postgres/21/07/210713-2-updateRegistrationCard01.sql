-- alter table EMPLOYMENT_REGISTRATION_CARD add column CITIZEN_ID uuid ^
-- update EMPLOYMENT_REGISTRATION_CARD set CITIZEN_ID = <default_value> ;
-- alter table EMPLOYMENT_REGISTRATION_CARD alter column CITIZEN_ID set not null ;
alter table EMPLOYMENT_REGISTRATION_CARD add column CITIZEN_ID uuid not null ;
