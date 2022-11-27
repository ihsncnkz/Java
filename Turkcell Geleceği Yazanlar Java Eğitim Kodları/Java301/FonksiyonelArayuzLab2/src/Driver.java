import java.util.Date;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*Thread kullaniciGirisiThread = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					System.out.println("Giris: ");
					String line = scanner.nextLine();
					System.out.println(line.toUpperCase());
				}
			}
			
		});*/
		
		Thread kullaniciGirisiThread = new Thread(() -> {
			while(true) {
				System.out.println("Giris: ");
				String line = scanner.nextLine();
				System.out.println(line.toUpperCase());
			}
		});
		
		kullaniciGirisiThread.start();
		
		while(true) {
			System.out.println(new Date());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
