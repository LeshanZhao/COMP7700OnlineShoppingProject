create table "Order"
(
    Order_ID   INTEGER               not null,
    User_ID    INTEGER               not null,
    OrderDate  DateTime default DATE not null,
    Shipper_ID INTEGER,
    OrderTotal REAL,
    OrderTax   REAL
);

create table OrderDetails
(
    OrderDetail_ID INTEGER           not null,
    Order_ID       INTEGER           not null,
    Product_ID     INTEGER           not null,
    Quantity       INTEGER default 0,
    LineTotal      REAL    default 0 not null
);

create table Product
(
    Product_ID         INTEGER           not null,
    ProductName        TEXT              not null,
    ProductDescription TEXT,
    Supplier_ID        INTEGER           not null,
    Price              REAL              not null,
    QuantityOnHand     INTEGER default 0 not null
);

create table Shipper
(
    Shipper_ID  INTEGER not null,
    ShipperName INTEGER not null,
    ShipperRate REAL    not null
);

create table UserRole
(
    UserRole_ID     INTEGER      not null,
    Rolename        integer TEXT not null,
    RoleDescription TEXT
);

create table Users
(
    User_ID     INTEGER not null
        primary key autoincrement
        unique,
    Username    TEXT    not null,
    Password    TEXT,
    FirstName   TEXT    not null,
    LastName    TEXT    not null,
    UserRole_ID INTEGER not null
);

create table sqlite_master
(
    type     TEXT,
    name     TEXT,
    tbl_name TEXT,
    rootpage INT,
    sql      TEXT
);

create table sqlite_sequence
(
    name,
    seq
);


