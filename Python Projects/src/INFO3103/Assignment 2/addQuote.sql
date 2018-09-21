DELIMITER //
DROP PROCEDURE IF EXISTS addQuote //

CREATE PROCEDURE addQuote(IN theQuote VARCHAR(65535))
begin
 INSERT INTO quote(theQuote)
    VALUES(theQuote);
end//
DELIMITER ;
