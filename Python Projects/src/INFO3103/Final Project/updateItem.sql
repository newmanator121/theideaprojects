DELIMITER //
DROP PROCEDURE IF EXISTS updateItem //

CREATE PROCEDURE updateItem(IN itemIdIN int, IN itemNewNameIN varchar(255))
BEGIN
UPDATE itemsTable
  SET item = itemNewNameIN WHERE itemID = itemIdIN;
END//
DELIMITER ;
