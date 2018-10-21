DELIMITER //
DROP PROCEDURE IF EXISTS getItemsByListID //

CREATE PROCEDURE getItemsByListID(IN listIdIN int)
begin
  SELECT * FROM itemsTable WHERE listID = listIdIN;
end//
DELIMITER ;
