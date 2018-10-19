DELIMITER //
DROP PROCEDURE IF EXISTS getUser //

CREATE PROCEDURE getUser(IN ownerName varchar(255))
begin
  SELECT * FROM masterTable
    where owner = ownerName;
        ORDER BY RAND() limit 1;

end//
DELIMITER ;
