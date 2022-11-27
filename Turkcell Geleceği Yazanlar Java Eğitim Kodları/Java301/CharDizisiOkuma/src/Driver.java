import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Casper\\Desktop\\Work\\yapay_zeka.txt");
		if(file.exists()) {
			FileReader fileReader = null;
			try {
				fileReader = new FileReader(file);
				/*int c = 0;
				long now = System.currentTimeMillis();
				while(( c = fileReader.read()) != -1) {
					System.out.print((char)c);
				}
				System.out.println();
				System.out.println(System.currentTimeMillis() - now);*/
				long now = System.currentTimeMillis();
				
				char[] buffer = new char[1024];
				int lenght  = 0;
				StringBuilder builder = new StringBuilder();
				while((lenght = fileReader.read(buffer)) != -1) {
					builder.append(Arrays.copyOfRange(buffer, 0, lenght));
				}
				System.out.println(builder.toString());
				
				/*fileReader.read(buffer);
				System.out.println(new String(buffer));*/
				
				System.out.println();
				System.out.println(System.currentTimeMillis() - now);
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			} finally {
				if (fileReader != null) {
					try {
						fileReader.close();
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
		else {
			System.out.println("Dosya Bulunamamıştır!");
		}
	}
}
