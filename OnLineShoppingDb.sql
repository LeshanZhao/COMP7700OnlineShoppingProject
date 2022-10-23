-- we don't know how to generate root <with-no-name> (class Root) :(
create table Authorization
(
    Authorization_ID   INTEGER not null
        primary key autoincrement
        unique,
    AuthorizationLevel TEXT    not null,
    Product            TEXT    not null,
    Payment            TEXT    not null,
    Shipper            TEXT    not null,
    User               TEXT    not null,
    "Order"            TEXT    not null
);

create index Authorization_AuthorizationLevel_index
    on Authorization (AuthorizationLevel);

create index Authorization_Order_index
    on Authorization ("Order");

create index Authorization_Payment_index
    on Authorization (Payment);

create index Authorization_Product_index
    on Authorization (Product);

create index Authorization_Shipper_index
    on Authorization (Shipper);

create index Authorization_User_index
    on Authorization (User);

create table ContactInfo
(
    ContactInfoID        INTEGER           not null
        constraint ContactInfo_pk
            unique,
    ContactTypeID        INTEGER           not null,
    UserID               INTEGER           not null,
    StreetAddress1       TEXT              not null,
    StreetAddress2       TEXT,
    City                 TEXT,
    State                TEXT,
    PostalCode           TEXT,
    MainPhoneNumber      TEXT              not null,
    AlternatePhoneNumber TEXT,
    EmailAddress         TEXT,
    Active               INTEGER default 1 not null
);

create index ContactInfo_Active_UserID_ContactTypeID_index
    on ContactInfo (Active, UserID, ContactTypeID);

create index ContactInfo_Active_index
    on ContactInfo (Active);

create index ContactInfo_ContactTypeID_index
    on ContactInfo (ContactTypeID);

create index ContactInfo_UserID_index
    on ContactInfo (UserID);

create table ContactType
(
    ContactTypeID   INTEGER                      not null /*autoincrement needs PK*/
        constraint ContactType_pk
            unique,
    TypeName        TEXT                         not null,
    TypeDescription TEXT,
    Active          INTEGER default 1            not null,
    DateAdded       TEXT    default current_date not null,
    DateModified    TEXT    default CURRENT_DATE
);

create table OrderDetails
(
    OrderDetailsID INTEGER                not null
        constraint OrderDetails_pk
            unique,
    OrderID        INTEGER                not null,
    ProductID      INTEGER,
    Quantity       integer REAL default 0 not null,
    LineTotal      REAL         default 0 not null
);

create table Orders
(
    OrderID           INTEGER not null
        constraint Orders_pk
            unique,
    CustomerID        INTEGER not null,
    ShippingAddressID INTEGER not null,
    OrderDate         TEXT    not null,
    OrderSubTotal     REAL default 0,
    ShipperID         INTEGER not null,
    DateModified      TEXT default current_date,
    StatusID          INTEGER not null
);

create table Product
(
    Product_ID         INTEGER           not null,
    ProductName        TEXT              not null,
    ProductDescription TEXT              not null,
    QuantityOnHand     INTEGER default 0 not null,
    DateAdded          TEXT              not null,
    Active             INTEGER default 1 not null
);

create table ProductOptions
(
    ProductOptionID   INTEGER not null /*autoincrement needs PK*/
        constraint ProductOptions_pk
            unique,
    ProductID         INTEGER not null
        constraint ProductOptions_Product_null_fk
            references Product (Product_ID),
    OptionName        TEXT    not null,
    OptionDescription TEXT,
    OptionValue       TEXT    not null
);

create index ProductOptions_OptionName_index
    on ProductOptions (OptionName);

create index ProductOptions_ProductID_index
    on ProductOptions (ProductID);

create table Shipper
(
    ShipperID       INTEGER                      not null
        constraint Shipper_pk
            unique,
    ShipperName     TEXT,
    ShipperAddress1 TEXT                         not null,
    ShipperAddress2,
    City            TEXT                         not null,
    State           TEXT                         not null,
    PostalCode      TEXT                         not null,
    MainPhoneNumber TEXT                         not null,
    EmailAddress    TEXT                         not null,
    Active          INTEGER default 1            not null,
    DateAdded       TEXT    default CURRENT_DATE not null,
    DateModified    TEXT    default CURRENT_DATE not null
);

create index Shipper_Active_index
    on Shipper (Active);

create index Shipper_DateAdded_index
    on Shipper (DateAdded desc);

create index Shipper_DateModified_index
    on Shipper (DateModified desc);

create index Shipper_MainPhoneNumber_index
    on Shipper (MainPhoneNumber);

create index Shipper_PostalCode_index
    on Shipper (PostalCode);

create table ShipperMethod
(
    ShipperMethodID   INTEGER                      not null
        constraint ShipperMethod_pk
            unique,
    MethodName        TEXT                         not null,
    MethodDescription TEXT,
    MethodCost        REAL                         not null,
    Active            INTEGER default 1            not null,
    DateAdded         TEXT    default CURRENT_DATE not null,
    DateModified      TEXT    default CURRENT_DATE not null,
    ShipperID         INTEGER                      not null
        constraint ShipperMethod_Shipper_ShipperID_fk
            references Shipper (ShipperID)
            on update cascade on delete cascade
);

create index ShipperMethod_Active_index
    on ShipperMethod (Active);

create index ShipperMethod_DateAdded_index
    on ShipperMethod (DateAdded desc);

create index ShipperMethod_DateModified_index
    on ShipperMethod (DateModified desc);

create index ShipperMethod_ShipperID_index
    on ShipperMethod (ShipperID);

create table Status
(
    StatusID          INTEGER                   not null /*autoincrement needs PK*/
        constraint OrderStatus_pk
            unique,
    StatusName        TEXT                      not null,
    StatusDescription TEXT,
    Active            TEXT default 1            not null,
    DateAdded         TEXT default current_date not null,
    DateModified      TEXT                      not null
);

create index OrderStatus_Active_index
    on Status (Active desc);

create index OrderStatus_DateAdded_index
    on Status (DateAdded desc);

create index OrderStatus_DateModified_index
    on Status (DateModified desc);

create table UserRole
(
    RoleID          INTEGER                      not null
        constraint UserRole_pk
            primary key autoincrement
        unique,
    RoleName        TEXT                         not null,
    RoleDescription TEXT,
    AuthorizationID INTEGER                      not null
        constraint UserRole_Authorization_Authorization_ID_fk
            references Authorization
            on update cascade on delete cascade,
    Active          INTEGER default 1            not null,
    DateAdded       TEXT    default CURRENT_DATE not null,
    DateModified    TEXT    default CURRENT_DATE not null
);

create index UserRole_Active_index
    on UserRole (Active desc);

create index UserRole_AuthorizationID_index
    on UserRole (AuthorizationID);

create index UserRole_DateAdded_index
    on UserRole (DateAdded desc);

create index UserRole_DateModified_index
    on UserRole (DateModified desc);

create table Users
(
    UserID       INTEGER                   not null
        unique
        constraint Users_Users_UserID_fk
            references Users (UserID)
            on update cascade on delete cascade,
    Username     TEXT                      not null
        unique,
    UserRoleID   INTEGER                   not null,
    FirstName    TEXT                      not null,
    LastName     TEXT                      not null,
    Password     TEXT                      not null,
    Active       char default Y            not null,
    DateAdded    TEXT default CURRENT_DATE not null,
    DateModified TEXT default CURRENT_DATE not null
);

create index Users_Active_index
    on Users (Active desc);

create index Users_DateAdded_index
    on Users (DateAdded desc);

create index Users_DateModified_index
    on Users (DateModified desc);

