import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Ogrenci> arrayList = new ArrayList<>();
		arrayList.add(new Ogrenci(1, "Ahmet Çalışkan", 16));
		arrayList.add(new Ogrenci(4, "Hasan Koşar", 18));
		arrayList.add(new Ogrenci(2, "Zeynep Güler",22));
		arrayList.add(new Ogrenci(3, "Zekiye Ak", 16));
		
		/*List<Ogrenci> collect = arrayList.stream()
				//.filter((o) -> o.getIsim().startsWith("A"))
				.filter((o) -> o.getYas() > 20 )
				.collect(Collectors.toList());
		collect.forEach(System.out::println);*/
		
		/*Map<Integer, List<Ogrenci>> gruplama = arrayList
				.stream()
				.collect(Collectors.groupingBy(o->o.getYas()));
		
		Set<Integer> keySet = gruplama.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " " + gruplama.get(key));
		}*/
		
		double yasOrtalamasi = arrayList.stream()
				.collect(Collectors.averagingInt(o -> o.getYas()));
		System.out.println(yasOrtalamasi);
		
		IntSummaryStatistics statistics = arrayList.stream()
				.collect(Collectors.summarizingInt(o -> o.getYas()));
		System.out.println(statistics);
		
	}
}
