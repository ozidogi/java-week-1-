package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Aybike";
		ogrenciler[1] = "Doğukan";
		ogrenciler[2] = "Elif";
		ogrenciler[3] = "Esat";
	
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		
		}
	}

}
