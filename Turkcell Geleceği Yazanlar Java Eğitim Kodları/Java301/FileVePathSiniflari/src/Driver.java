import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*File file = new File("C:\\Users\\Casper\\Desktop\\Sample_Folder\\Sample_text.txt");
		System.out.println(file.exists()); // Dosyanınn olup olmadığını kontorol eder
		System.out.println(file.canRead()); // Dosyada okuma iznimizin olup olmadığını kontrol eder
		System.out.println(file.canWrite()); // Dosyada Yazma iznimizin olmadığını kontrol eder.
		System.out.println(file.isDirectory()); // dosya mı yoksa metin dosyası mı? Olup olmadığını kontrol eder.
		System.out.println(file.getAbsolutePath()); // Dosyanın yolunu geri gönderir.
		System.out.println(file.getParent()); // Dosyanın içerisinde bulunduğu yeri geri göderir!
		System.out.println(file.length()); // Dosyanın içerisinde kaç byte olduğunu geri gönderir!
		System.out.println(file.lastModified()); // Dosya üzerinde en son yapılan işlemin ne zaman olduğunu göderirir.
		System.out.println(new Date(file.lastModified()));
		
		// Dosya oluşturma
		File file2 = new File("C:\\Users\\Casper\\Desktop\\Sample_Folder\\ornek.txt");
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Dosya sileme
		if (file2.exists()) {
			boolean silindimi = file2.delete();
			System.out.println(silindimi);
		}*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dosya Yolu: ");
		String path = scanner.nextLine();
		
		File file = new File(path);
		String[] içerik = file.list();
		for (int i = 0; i < içerik.length; i++) {
			System.out.println(içerik[i]);
		}
		scanner.close();
	}
}
