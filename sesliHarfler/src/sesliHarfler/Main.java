package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'D';
		
		/*
		 * char[] kalin = {'A','I','O','U'}; char[] ince = {'E','İ','Ö','Ü'};
		 * 
		 * boolean kalinMi = true;
		 * 
		 * for (int i = 0; i<kalin.length; i++) {
		 * 
		 * if (harf == kalin[i]) { kalinMi = true; break; } if (harf == ince[i]) {
		 * kalinMi = false; break; } else {
		 * System.out.println(harf+" sesli harf değildir."); break; } } if (kalinMi =
		 * true) { System.out.println(harf+" kalın bir sesli harftir."); } else if
		 * (kalinMi = false) { System.out.println(harf+" ince bir sesli harftir.");
		 * 
		 * }
		 */
		
		System.out.println("------------------------------");
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(harf+" kalın bir sesli harftir.");
				break;
				
			case 'E':
		    case 'İ':
		    case 'Ö':
		    case 'Ü':
		    	System.out.println(harf+" ince bir sesli harftir.");
		    	break;
		    	
		    default:
		    	System.out.println(harf+" bir sesli harf değildir.");
		    	break;
		}
		    
		}
		
	}

