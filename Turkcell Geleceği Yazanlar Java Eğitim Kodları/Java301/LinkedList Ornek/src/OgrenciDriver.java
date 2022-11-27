import java.util.Iterator;
import java.util.LinkedList;

public class OgrenciDriver {

	public static void main(String[] args) {
		LinkedList<Ogrenci> linkedList = new LinkedList<Ogrenci>();
		linkedList.add(new Ogrenci(1,"Ali","Çalıskan"));
		linkedList.add(new Ogrenci(2,"Hasan","Ok"));
		linkedList.add(new Ogrenci(3,"Hakan","Yalı"));
		
		Iterator<Ogrenci> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			Ogrenci ogrenci = iterator.next();
			System.out.println(ogrenci);
		}
		
		linkedList.remove(2);
		System.out.println("-------------------");
		iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			Ogrenci ogrenci = iterator.next();
			System.out.println(ogrenci);
		}
	}
}
