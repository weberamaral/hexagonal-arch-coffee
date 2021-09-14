CREATE TABLE coffee (
  id VARCHAR(255) NOT NULL, 
  name VARCHAR(255) NOT NULL,
  method VARCHAR(255) NOT NULL, 
  size VARCHAR(255) NOT NULL, 
  type VARCHAR(255) NOT NULL,
  UNIQUE (name),
  PRIMARY KEY (id)
);

CREATE TABLE brewing_method (
  id VARCHAR(255) NOT NULL, 
  method VARCHAR(255) NOT NULL,
  UNIQUE (method),
  PRIMARY KEY (id)
);

CREATE TABLE coffee_size (
  id VARCHAR(255) NOT NULL, 
  size VARCHAR(255) NOT NULL,
  UNIQUE (size),
  PRIMARY KEY (id)
);

CREATE TABLE coffee_type (
  id VARCHAR(255) NOT NULL, 
  type VARCHAR(255) NOT NULL,
  UNIQUE (type),
  PRIMARY KEY (id)
);