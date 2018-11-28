DROP TABLE IF EXISTS listsTable;
CREATE TABLE listsTable (
  listID   int                  NOT NULL AUTO_INCREMENT,
  listName varchar(255)         NOT NULL,
  userID int  NOT NULL,
  PRIMARY KEY (listID),
  CONSTRAINT userID
    FOREIGN KEY(userID) REFERENCES usersTable(userID)
);
