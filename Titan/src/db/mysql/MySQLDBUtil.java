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

package db.mysql;

public class MySQLDBUtil {
  private static final String HOSTNAME = "localhost";
  private static final String PORT_NUM = "3306"; // change it to your mysql port number
  public static final String DB_NAME = "laiproject";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "root";
  public static final String URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
      + "?user=" + USERNAME + "&password=" + PASSWORD + "&autoreconnect=true";
}
