import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String line = null;
		while(!(line = scanner.nextLine()).equals("exit")) {
			arrayList.add(line);
		}
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		
		System.out.println("For ile liste içerisinde dönme: ");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println((i) + " " + arrayList.get(i));
		}
		
		System.out.println("-------------------------------");
		System.out.println(arrayList.size());
		
		arrayList.remove(2);
		
		System.out.println("-------------------------------");
		System.out.println(arrayList.size());
	}
}
