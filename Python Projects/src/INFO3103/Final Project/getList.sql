DELIMITER //
DROP PROCEDURE IF EXISTS getList //

CREATE PROCEDURE getList(IN listName varchar(255))
begin
  SELECT * FROM masterTable
    where list = listName;
        ORDER BY RAND() limit 1;

end//
DELIMITER ;
