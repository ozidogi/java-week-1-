package miniProjecAsalSayi;

public class Main {

	public static void main(String[] args) {
		System.out.println("---- PRIME NUMBER TEST SOFTWARE ----");
		int number = -33;
		System.out.println("Checking for " + number + "...");
		// int remainder2 = number % 2; //number % 2 --> bir sayının belirli bir sayıya
		// bölümünden kalanı verir

		if (number == 1) {
			System.out.println(number + " is not a prime number.");
			return;
		}

		if (number < 1) {
			System.out.println(number + " is not a valid number for prime test.");
			return;
		}

		boolean isPrime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}

		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}

}
