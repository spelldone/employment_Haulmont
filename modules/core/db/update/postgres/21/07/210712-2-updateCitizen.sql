alter table EMPLOYMENT_CITIZEN add column IS_REGISTERED boolean ^
update EMPLOYMENT_CITIZEN set IS_REGISTERED = false where IS_REGISTERED is null ;
alter table EMPLOYMENT_CITIZEN alter column IS_REGISTERED set not null ;
alter table EMPLOYMENT_CITIZEN add column EMPLOYMENT_CENTER_ID uuid ;
