DROP TABLE IF EXISTS masterTable;
CREATE TABLE masterTable (
  userID INT            NOT NULL AUTO_INCREMENT,
  owner     varchar255  NOT NULL,
  list varchar(20)      DEFAULT NULL,
  item varchar(40000)   DEFAULT NULL,
  level    varchar(10)  DEFAULT NULL,
  PRIMARY KEY (userID)
);