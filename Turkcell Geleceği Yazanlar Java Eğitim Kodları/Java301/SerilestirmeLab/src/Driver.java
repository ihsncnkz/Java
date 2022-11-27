import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.setPlaka("34ABC0123");
		araba.setmarka("Z Marka");
		araba.setModel("I Model");
		araba.setYil(2022);
		
		Motor motor = new Motor();
		motor.setHaci(2000);
		araba.setMotor(motor);
		
		System.out.println(araba);
		
		File file = new File("araba.bin");
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(araba);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(objectOutputStream != null) {
					objectOutputStream.close();
				}
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
