-- begin EMPLOYMENT_VACANCY
create table EMPLOYMENT_VACANCY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    POSITION varchar(255) not null,
    IS_OPEN boolean not null,
    REGISTRATION_DATE timestamp not null,
    EMPLOYER_NAME varchar(255) not null,
    SALARY integer,
    RATE double precision,
    EMPLOYMENT_CENTER_ID uuid not null,
    --
    primary key (ID)
)^
-- end EMPLOYMENT_VACANCY
-- begin EMPLOYMENT_REGISTRATION_CARD
create table EMPLOYMENT_REGISTRATION_CARD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EMPLOYMENT_CENTER_ID uuid not null,
    CITIZEN_ID uuid not null,
    REGISTRATION_DATE timestamp not null,
    BENEFIT_SIZE integer not null,
    IS_PAID_BENEFIT boolean not null,
    START_WORKING_DATE timestamp,
    --
    primary key (ID)
)^
-- end EMPLOYMENT_REGISTRATION_CARD
-- begin EMPLOYMENT_PROFESSION
create table EMPLOYMENT_PROFESSION (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end EMPLOYMENT_PROFESSION
-- begin EMPLOYMENT_CITIZEN
create table EMPLOYMENT_CITIZEN (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    IS_REGISTERED boolean not null,
    LAST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255),
    PROFESSION_ID uuid,
    IS_WORKING boolean not null,
    --
    primary key (ID)
)^
-- end EMPLOYMENT_CITIZEN
-- begin EMPLOYMENT_EMPLOYMENT_CENTER
create table EMPLOYMENT_EMPLOYMENT_CENTER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS varchar(255) not null,
    CITY varchar(255) not null,
    --
    primary key (ID)
)^
-- end EMPLOYMENT_EMPLOYMENT_CENTER
-- begin EMPLOYMENT_PROFESSION_VACANCY_LINK
create table EMPLOYMENT_PROFESSION_VACANCY_LINK (
    PROFESSION_ID uuid,
    VACANCY_ID uuid,
    primary key (PROFESSION_ID, VACANCY_ID)
)^
-- end EMPLOYMENT_PROFESSION_VACANCY_LINK
