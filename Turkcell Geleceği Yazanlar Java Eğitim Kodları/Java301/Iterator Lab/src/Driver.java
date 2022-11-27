import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Hasan Caliskan");
		int[] notlar = new int[5];
		notlar[0] = 12;
		notlar[1] = 33;
		notlar[2] = 41;
		notlar[3] = 06;
		notlar[4] = 03;
		ogrenci.setNotlar(notlar);
		
		Iterator<Integer> iterator = ogrenci.iterator();
		while(iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}
	} 
}
