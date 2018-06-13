package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {
		try {
			new DBTest();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public DBTest()  throws SQLException {
		// Verbindung
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://c:/users/9007/dbtest.accdb;memory=false");
		//Insert ausführen
		Statement stmt = conn.createStatement();
		stmt.execute("INSERT INTO address ( vorname, nachname, ort, plz ) " + "VALUES ('hansi2', 'maier', 'wien', 1120)");
		stmt.execute("INSERT INTO address ( vorname, nachname, ort, plz ) " + "VALUES ('über', 'king', 'erde', 0000)");
	}
}
