
public class OracleDBConnection extends DbConnection{
	public void openConnection() {
		System.out.println("Oracle bağlatısı açık");
	}
	
	public void closeConnection() {
		System.out.println("Oracle bağlantısı kapalı");
	}
	
	public void executeQuery(String sql) {
		System.out.println("Oracle komutları çalıştırıldı.");
	}
}
