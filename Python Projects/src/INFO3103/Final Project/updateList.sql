DELIMITER //
DROP PROCEDURE IF EXISTS updateList //

CREATE PROCEDURE updateList(IN listIdIN int, IN listNewNameIN varchar(255))
BEGIN
UPDATE listsTable
  SET listName = listNewNameIN WHERE listID = listIdIN;
END//
DELIMITER ;
