DELIMITER //
DROP PROCEDURE IF EXISTS deleteUser//

CREATE PROCEDURE deleteUser(IN userIdIN int)
BEGIN
DELETE FROM usersTable WHERE userID = userIdIN;
END//
DELIMITER ;