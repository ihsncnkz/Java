
public class Driver {
	public static void main(String[] args) {
		/*int x = 10;
		float y = 20f;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(5 % 2);
		
		int a = 10;
		a = a+2; // = a+=2;
		
		System.out.println(a);
		
		int q = 12;
		System.out.println(q++);
		System.out.println(q);*/
		
		int i = 10; // 00000000 00000000 00000000 00001010 bellekte kapladığı hali		
		int x = 4; // 00000000 00000000 00000000 00000100
		System.out.println(~i); // 11111111 11111111 11111111 11110101 ~ Sonraki hali
		System.out.println(i & x); //  00000000 00000000 00000000 00000000
		System.out.println(i | x); // 00000000 00000000 00000000 00001110
		System.out.println(x >> 1); // 00000000 00000000 00000000 00000010 sağa kaydırdığımızda değerimizi 2 ye bölmüş oluyoruz!
		System.out.println(x << 1); // 00000000 00000000 00000000 00000100 sola doğru kaydırdığımızda değermizi 2 ile çarpmış oluyoruz!
		
		
	}
}