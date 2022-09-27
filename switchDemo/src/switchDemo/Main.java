package switchDemo;

public class Main {

	public static void main(String[] args) {
	  char grade = 'A';
		
	  switch (grade) {
		case 'A':
			System.out.println("4.0 üzerinden 4.0 notuyla geçtiniz");
			break;
		case 'B':
		    System.out.println("4.0 üzerinden 3.0 notuyla geçtiniz");
		    break;
		case 'C':
		    System.out.println("4.0 üzerinden 2.0 notuyla geçtiniz");
		    break;
		case 'D':
		    System.out.println("4.0 üzerinden 1.0 notuyla geçtiniz");
		    break;
		case 'F':
		    System.out.println("Maalesef kaldınız");
		    break;
		default:
			System.out.println("Geçersiz harf notu girdiniz");
		}

	}

}
