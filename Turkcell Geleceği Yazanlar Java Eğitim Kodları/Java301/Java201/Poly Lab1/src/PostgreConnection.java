
public class PostgreConnection extends DbConnection{
	
	public void openConnection() {
		System.out.println("Postgre bağlantısı açıldı.");
	}
	
	public void closeConnection() {
		System.out.println("Postgre bağlantısı kapatıdı.");
	}
	
	public void executeQuery(String sql) {
		System.out.println("PostSQL komutları çalıştırıldı.");
	}

}
