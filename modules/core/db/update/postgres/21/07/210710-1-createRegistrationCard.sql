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
);