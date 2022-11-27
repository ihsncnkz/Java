
public class Futbolcu extends Oyuncu {
	
	/*@Override'ın görevi abstract class içerisindeki metot ile aynı ismili metodu yanlışlıkla 
	 * yazmadığınızı belirtir.*/
	
	@Override
	public void sutCek() {
		System.out.println("Futbolcu şut çekti.");
	}
	
	@Override
	public void pasVer() {
		System.out.println("Futbolcu pas verdi.");
	}

}
