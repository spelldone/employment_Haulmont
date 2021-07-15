-- alter table EMPLOYMENT_EMPLOYMENT_CENTER add column ADRESS varchar(255) ^
-- update EMPLOYMENT_EMPLOYMENT_CENTER set ADRESS = <default_value> ;
-- alter table EMPLOYMENT_EMPLOYMENT_CENTER alter column ADRESS set not null ;
alter table EMPLOYMENT_EMPLOYMENT_CENTER add column ADRESS varchar(255) ;
alter table EMPLOYMENT_EMPLOYMENT_CENTER add column CITY varchar(255) ^
update EMPLOYMENT_EMPLOYMENT_CENTER set CITY = '' where CITY is null ;
alter table EMPLOYMENT_EMPLOYMENT_CENTER alter column CITY set not null ;
