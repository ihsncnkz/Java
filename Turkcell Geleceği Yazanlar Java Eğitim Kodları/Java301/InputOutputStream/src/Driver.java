import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		/*File file =  new File("output.dat");
		FileOutputStream fileOutputStream = null;
		Scanner scanner = new Scanner(System.in);
		try {
			fileOutputStream = new FileOutputStream(file);
			String line = null;
			while(!(line = scanner.nextLine()).equals("quit")) {
				fileOutputStream.write(line.getBytes());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			scanner.close();
		}*/
		oku();
	}
	
	public static void oku() {
		File file = new File("output.dat");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int c = 0;
			while((c = fileInputStream.read()) != -1) {
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if( fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
}
