DROP TABLE IF EXISTS itemsTable;
CREATE TABLE itemsTable (
  itemID   int                  NOT NULL AUTO_INCREMENT,
  item varchar(255555)         NOT NULL,
  listID int  NOT NULL,
  userID int  NOT NULL,
  PRIMARY KEY (itemID),
  CONSTRAINT listID
  FOREIGN KEY(listID) REFERENCES listsTable(listID)
      ON DELETE SET NULL,
  CONSTRAINT userID
  FOREIGN KEY(userID) REFERENCES usersTable(userID)
);
