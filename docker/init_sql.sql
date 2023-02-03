-- Create super user.

CREATE ROLE testuser LOGIN SUPERUSER PASSWORD 'testpassword';

-- Create table after check.

DROP TABLE IF EXISTS example;

CREATE TABLE example (
  id INT,
  name VARCHAR(30),
  relationfk INT
);

CREATE TABLE onerelation (
  id INT,
  name VARCHAR(30)
);

CREATE TABLE manyrelation (
  id INT,
  name VARCHAR(30),
  examplefk INT
);
