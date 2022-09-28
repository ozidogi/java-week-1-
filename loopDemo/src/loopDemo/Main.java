package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For döngüsüyle 10'dan küçük ve 3'ün katı olan sayıları yazdırıyoruz
		for (int i = 3;i < 10;i+=3) {
			System.out.println(i);
		}
		System.out.println("For döngüsü sona erdi");
		
		//While döngüsü
		int i = 3;
		while (i < 10) {
			System.out.println(i);
			i = i+3;
		}
		System.out.println("While döngüsü sona erdi");	
			
		//Do-while döngüsü
		int j = 3;
		do {System.out.println(j);
			j = j+3;
			}
		while (j < 10);
		System.out.println("Do-while döngüsü sona erdi");
				
	}
}
