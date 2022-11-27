import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Driver {

	public static void main(String[] args) {
		File file = new File("Hello.txt");
		// Yazmak için kullandığımız kodlar!
		
		/*FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write("Merhaba".getBytes());
		} catch (IOException e){
			System.out.print(e.getMessage());
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}*/
		//Okumak için kullandığımız kodlar!
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int c = 0;
			while ((c = fileInputStream.read()) != -1) {
				System.out.print((char)c);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
