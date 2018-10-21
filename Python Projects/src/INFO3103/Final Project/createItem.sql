DELIMITER //
DROP PROCEDURE IF EXISTS createItem //

CREATE PROCEDURE createItem(IN itemIN varchar(255),IN listIdIN int)
BEGIN
INSERT INTO itemsTable (item,listID) VALUES
   (itemIN,listIdIN);
SELECT LAST_INSERT_ID();
END//
DELIMITER ;
