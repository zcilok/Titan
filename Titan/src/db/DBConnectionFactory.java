/*********************************************************
 * 2017fall CSE 682 Project
 * Title: FindIt
 * Purpose: A restaurant recommendation web application
 * Group Leader: Chunyang Zhan
 * Group Member: Xiling Wang, Honghao An, Chenyang Du, Yue Zhao
 * 				 Haiyang Zhang, Yufei Fang
 * 
 * Version 1.1
 * Updated Factory pattern, added Ticketmaster API as test
 * 
 * Version History:
 * Version 1.0: Implement main functionality
 * 
 *********************************************************/

/**
 * DB Factory class
 * Change DEFAULT_DB to select which DB to be used
 */
package db;

import db.mongodb.MongoDBConnection;
import db.mysql.MySQLConnection;

public class DBConnectionFactory {
    // This should change based on the pipeline.
    private static final String DEFAULT_DB = "mysql";

    /**
     * 
     * @param db given db type
     * @return a db connection based on db type
     * 
     * mysle: MySQL
     * mongodb: MongoDB
     * 
     * can add other db types by adding more switch cases
     */
    // Create a DBConnection based on given db type.
    public static DBConnection getDBConnection(String db) {
        switch (db) {
        case "mysql":
        	return new MySQLConnection();
        case "mongodb":
        	return new MongoDBConnection();
        // You may try other dbs and add them here.
        default:
            throw new IllegalArgumentException("Invalid db " + db);
        }
    }

    // This is overloading not overriding.
    public static DBConnection getDBConnection() {
        return getDBConnection(DEFAULT_DB);
    }
}
