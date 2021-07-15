create table EMPLOYMENT_REGISTERED_CITIZEN (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255),
    PROFESSION_ID uuid,
    IS_WORKING boolean not null,
    --
    REGISTRATION_CARD_ID uuid not null,
    EMPLOYMENT_CENTER_ID uuid not null,
    --
    primary key (ID)
);