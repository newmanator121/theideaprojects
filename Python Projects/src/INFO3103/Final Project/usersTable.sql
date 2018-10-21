DROP TABLE IF EXISTS usersTable;
CREATE TABLE usersTable (
  userID   int                  NOT NULL AUTO_INCREMENT,
  userName varchar(255)         NOT NULL,
  PRIMARY KEY (userID)
);
