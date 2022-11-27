
public class DbConnection {
	
	public void openConnection() {
		System.out.println("Veri tabanı bağlantısı açıldı.");
	}
	
	public void closeConnection() {
		System.out.println("Veri tabanı bağlantısı kapatıldı.");
	}
	
	public void executeQuery(String sql) {
		System.out.println("SQL komutları çalıştırıldı.");
	}
	
}
