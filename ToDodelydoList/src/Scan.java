import java.util.Scanner;

public class Scan {
	
	static Scanner in = new Scanner(System.in);
	String ord = in.nextLine();
	
	public static void ny() {
		System.out.println("Skriv n�t som du vill g�ra att g�ra!");
		String ord = in.nextLine();
//		System.out.println(ord);
		ToDo.add(ord);
		
	}
	/////////////////try catch filter/////////////////////
	// Gabby l�rde mig...inte l�raren eller Engelsmannen...nu fattar jag! Tack Gabby!!!
	
	public static void gjordV�xel() {
		System.out.println("Tryck in det index p� den sak du vill �ndra status p�!");
		try {
		String nr = in.next();
			int intNr = Integer.parseInt(nr);
			ToDo.�ndraStatusP�En(intNr);
		}
		catch (NumberFormatException e){	
			System.out.println("S�ta du...skriv nu en siffra...");
			gjordV�xel();
		}
		}
	
	public static void bort() {
		System.out.println("Tryck in det index p� den sak du vill f�rst�ra helt!");
		try {
			int nr = in.nextInt();
			System.out.println(nr);
			ToDo.taBort(nr);
		}
		catch (NumberFormatException e){	
			System.out.println("Sk�rpning...skriv nu en siffra...");
			bort();
		}
	
		
	}
	public static void s�k() {
		System.out.println("Skriv n�t som du vill s�ka r�tt p�...genast!");
		try {
			String ord = in.nextLine();
			System.out.println(ord);
			ToDo.kolla(ord);
		}
		catch (NumberFormatException e){	
			System.out.println("Sk�rpning...skriv nu en siffra...");
			s�k();
		}
	
	
	}

}