DELIMITER //
DROP PROCEDURE IF EXISTS getListsByUser //

CREATE PROCEDURE getListsByUser(IN userIdIN int)
begin
  SELECT * FROM listsTable
    WHERE userID = userIdIN;
end//
DELIMITER ;
