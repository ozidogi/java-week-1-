package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 6;
		int bolenlerToplam = 0;

		if (number == 0) {
			System.out.println(number + " bir mükemmel sayı değildir.");
			return;
		}

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				bolenlerToplam = bolenlerToplam + i;
			}
		}

		if (bolenlerToplam == number) {
			System.out.println(number + " bir mükemmel sayıdır!");
			return;
		}

		if (number == 0) {
			System.out.println(number + " bir mükemmel sayı değildir.");
			return;
		} 
		else {
			System.out.println(number + " bir mükemmel sayı değildir.");
		}

	}

}
