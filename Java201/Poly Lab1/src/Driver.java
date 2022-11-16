import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		DbConnection connection = (DbConnection) Class.forName(args[0]).newInstance();
		connection.openConnection();
		connection.executeQuery("Select * from student");
		connection.closeConnection();
		
		
		/*DbConnection connection = new DbConnection();
		connection.openConnection();
		connection.executeQuery("SLECKT * FROM students");
		connection.closeConnection();
		
		MySQLConnection mysql = new MySQLConnection();
		mysql.openConnection();
		mysql.executeQuery("SELECT * FROM studets");
		mysql.closeConnection();
		
		MsSQLConnection Mssql = new MsSQLConnection();
		Mssql.openConnection();
		Mssql.executeQuery("Select * from studens");
		Mssql.closeConnection();*/
		
		/*DbConnection dbCon = new MySQLConnection();
		dbCon.openConnection();
		dbCon.executeQuery("Select * from studends");
		dbCon.closeConnection();
		
		DbConnection dbCon2 = new MsSQLConnection();
		dbCon2.openConnection();
		dbCon2.executeQuery("Select * from studends");
		dbCon2.closeConnection();
		
		DbConnection dbCon3 = new OracleDBConnection();
		dbCon3.openConnection();
		dbCon3.executeQuery("Select * from studends");
		dbCon3.closeConnection();*/
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Database tipi seçiniz [1 (MsSQL),2(MySQL),3(Oracle SQL)]: ");
		int dbType = scanner.nextInt();
		DbConnection dbCon = null;
		switch (dbType) {
		case 1:
			dbCon = new MsSQLConnection();
			break;
		case 2:
			dbCon = new MySQLConnection();
			break;
		case 3:
			dbCon = new OracleDBConnection();
			break;
		default:
			System.out.println("Yanlış veritabani seçimi");
			break;
		}
		if (dbCon != null) {
			dbCon.openConnection();
			dbCon.executeQuery("Select * from studends");
			dbCon.closeConnection();
		}*/
		
		
	}
}
