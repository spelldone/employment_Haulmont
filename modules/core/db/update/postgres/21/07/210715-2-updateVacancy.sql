alter table EMPLOYMENT_VACANCY add column IS_OPEN boolean ^
update EMPLOYMENT_VACANCY set IS_OPEN = false where IS_OPEN is null ;
alter table EMPLOYMENT_VACANCY alter column IS_OPEN set not null ;
