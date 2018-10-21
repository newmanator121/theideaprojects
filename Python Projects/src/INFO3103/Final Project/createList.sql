DELIMITER //
DROP PROCEDURE IF EXISTS createList //

CREATE PROCEDURE createList(IN listNameIN varchar(255),IN userIdIN int)
BEGIN
INSERT INTO listsTable (listName,userID) VALUES
   (listNameIN,userIdIN);
SELECT LAST_INSERT_ID();
END//
DELIMITER ;
