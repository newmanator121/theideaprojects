DELIMITER //
DROP PROCEDURE IF EXISTS getLists //

CREATE PROCEDURE getLists()
begin
  SELECT * FROM listsTable
end//
DELIMITER ;