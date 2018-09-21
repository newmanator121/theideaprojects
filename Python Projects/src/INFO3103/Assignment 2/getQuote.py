#!/bin/env python3
#
# Alex Newman
#
import pymysql.cursors
import settings
# Make the connection. The settings.py file holds the credentials.
dbConnection = pymysql.connect(settings.DBHOST,
                               settings.DBUSER,
                               settings.DBPASSWD,
                               settings.DBDATABASE,
                               charset='utf8mb4',
                               cursorclass= pymysql.cursors.DictCursor)
sqlProcName = 'getQuote'
try:
    cursor = dbConnection.cursor()
    cursor.callproc(sqlProcName)
    dbConnection.commit()
    result = cursor.fetchone()
    print(result)
    print(cursor.fetchone() )
    print(cursor.fetchone() )
except pymysql.MySQLError as e:
    print(e)
finally:
    #close dbConnection
    dbConnection.close()

# End.
