
public class Driver {

	public static void main(String[] args) {
		/*Keman keman = new Keman();
		keman.cal();
		keman.akorYap();*/
		
		Enstruman e1 = new Gitar();
		e1.cal();
		e1.akorYap();
		
		Enstruman e2 = new Keman();
		e2.cal();
		e2.akorYap();
		
		Enstruman e3 = new Davul();
		e3.cal();
		e3.akorYap();
		
		Enstruman e4 = new Klarnet();
		e4.cal();
		e4.akorYap();
	}
}
