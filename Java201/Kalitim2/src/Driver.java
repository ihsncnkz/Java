
public class Driver {
	public static void main(String[] args) {
		NakliyeAraci nakilyearaci = new NakliyeAraci();
		nakilyearaci.setUretici("Z Marka");
		nakilyearaci.setYukKapasitesi(1000);
		
		Tır tir = new Tır();
		tir.setUretici("Y Markasi");
		tir.setYukKapasitesi(2000);
		tir.setKontSay(20);
	}
}
