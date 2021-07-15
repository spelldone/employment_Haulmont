alter table EMPLOYMENT_CITIZEN rename column is_registered to is_registered__u60162 ;
alter table EMPLOYMENT_CITIZEN alter column is_registered__u60162 drop not null ;
-- alter table EMPLOYMENT_CITIZEN add column REGISTRATION_CARD_ID uuid ^
-- update EMPLOYMENT_CITIZEN set REGISTRATION_CARD_ID = <default_value> ;
-- alter table EMPLOYMENT_CITIZEN alter column REGISTRATION_CARD_ID set not null ;
alter table EMPLOYMENT_CITIZEN add column REGISTRATION_CARD_ID uuid not null ;
-- alter table EMPLOYMENT_CITIZEN add column EMPLOYMENT_CENTER_ID uuid ^
-- update EMPLOYMENT_CITIZEN set EMPLOYMENT_CENTER_ID = <default_value> ;
-- alter table EMPLOYMENT_CITIZEN alter column EMPLOYMENT_CENTER_ID set not null ;
alter table EMPLOYMENT_CITIZEN add column EMPLOYMENT_CENTER_ID uuid not null ;
alter table EMPLOYMENT_CITIZEN add column DTYPE varchar(31) ;
