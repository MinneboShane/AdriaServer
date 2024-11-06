-- Dropping tables
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS suppliers;
DROP TABLE IF EXISTS inventory;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS wishlists;
DROP TABLE IF EXISTS memberships;

-- Creating the databases
CREATE TABLE users
(
    userId                  TEXT PRIMARY KEY,
    nationalRegistryNumber  TEXT NOT NULL UNIQUE,
    firstName               TEXT NOT NULL,
    lastName                NOT NULL,
    email                   TEXT NOT NULL UNIQUE,
    phoneNumber             TEXT,
    notificationType        TEXT NOT NULL
);

CREATE TABLE suppliers
(
    supplierId              TEXT PRIMARY KEY,
    name                    TEXT NOT NULL,
    contactName             TEXT NOT NULL,
    phoneNumber             TEXT,
    email                   TEXT NOT NULL UNIQUE,
    address                 TEXT
);

CREATE TABLE inventory
(
    itemId                  TEXT PRIMARY KEY,
    name                    TEXT NOT NULL,
    category                TEXT NOT NULL,
    quantityInStock         INTEGER NOT NULL,
    unitPrice               REAL NOT NULL,
    totalValue              REAL GENERATED ALWAYS AS (quantityInStock * unitPrice) STORED,
    supplier                TEXT
);

CREATE TABLE orders
(
    orderId                 TEXT PRIMARY KEY,
    userId                  TEXT NOT NULL,
    date                    DATE NOT NULL,
    address                 TEXT NOT NULL,
    amount                  REAL Not null,
    deliveryType            TEXT NOT NULL,
    paymentType             TEXT NOT NULL,
    weight                  REAL NOT NULL,
    status                  TEXT NOT NULL,
    FOREIGN KEY(userId) REFERENCES users(userId)
);

CREATE TABLE wishlists
(
    wishlistId              TEXT PRIMARY KEY,
    userId                  TEXT NOT NULL,
    name                    TEXT NOT NULL,
    FOREIGN KEY (userId) REFERENCES users(userId)
);

CREATE TABLE memberships
(
    membershipId            TEXT PRIMARY KEY,
    userId                  TEXT NOT NULL,
    membershipType          TEXT NOT NULL,
    startDate               DATE NOT NULL,
    renewalDate             DATE NOT NULL,
    status                  TEXT NOT NULL
);