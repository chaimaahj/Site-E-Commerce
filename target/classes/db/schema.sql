DROP TABLE products IF EXISTS;

CREATE TABLE products (
  id         INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(30),
  price  float
);