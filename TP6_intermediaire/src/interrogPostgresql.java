import java.sql.*;
import java.io.*;

public class interrogPostgresql{
	public String req;
	//public ResultSet res;

	public interrogPostgresql(String r){
		req = r;
	}

	public void query(){
		
		String username;
		String password;
		String url;
		String nom;
		int nbre;
		
		// ---- configure START
		username = "lo17xxx";
		password = "dblo17";
		// The URL that will connect to TECFA's MySQL server
		// Syntax: jdbc:TYPE:machine:port/DB_NAME
		url = "jdbc:postgresql://tuxa.sme.utc/dblo17";

		//String requete;
		//requete = req;
		//requete="select distinct fichier,rubrique from titretexte where mot='micro';";

		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
		} catch(ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		// Establish Connection to the database at URL with usename and password
		// using try-with-resources Statement and AutoCloseable resources
		// cf. https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
		try (
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			) {

			 // Send the query and bind to the result set
			ResultSet rs = stmt.executeQuery(req);

			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					if (i > 1) System.out.print(",  ");
					String columnValue = rs.getString(i);
					System.out.print(columnValue + " " + rsmd.getColumnName(i));
				}
				System.out.println("");
			}
		}	catch(SQLException ex) { 		// print out decent erreur messages
			System.err.println("==> SQLException: ");
			while (ex != null) {
				System.out.println("Message:   " + ex.getMessage ());
				System.out.println("SQLState:  " + ex.getSQLState ());
				System.out.println("ErrorCode: " + ex.getErrorCode ());
				ex = ex.getNextException();
				System.out.println("");
			}
		}
	}
}
