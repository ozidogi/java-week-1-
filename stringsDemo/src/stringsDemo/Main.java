package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(". Yaşasın!"));
		System.out.println("Mesaj A ile başlıyor mu?: "+mesaj.startsWith("A"));
		System.out.println("Mesaj l ile bitiyor mu?: "+mesaj.endsWith("l"));
		char[] karakterler = new char[4];
		mesaj.getChars(6,10,karakterler,0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a")); //baştan ilk "a"nın indexi
		System.out.println(mesaj.lastIndexOf("a")); //sondan ilk "a" indexi
		
		
		

	}

}
