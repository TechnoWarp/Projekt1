import java.util.Scanner;

public class Scan {
	
	static Scanner in = new Scanner(System.in);
	String ord = in.nextLine();
	
	public static void ny() {
		System.out.println("Skriv nåt som du vill göra att göra!");
		String ord = in.nextLine();
//		System.out.println(ord);
		ToDo.add(ord);
		
	}
	/////////////////try catch filter/////////////////////
	// Gabby lärde mig...inte läraren eller Engelsmannen...nu fattar jag! Tack Gabby!!!
	
	public static void gjordVäxel() {
		System.out.println("Tryck in det index på den sak du vill ändra status på!");
		try {
		String nr = in.next();
			int intNr = Integer.parseInt(nr);
			ToDo.ändraStatusPåEn(intNr);
		}
		catch (NumberFormatException e){	
			System.out.println("Söta du...skriv nu en siffra...");
			gjordVäxel();
		}
		}
	
	public static void bort() {
		System.out.println("Tryck in det index på den sak du vill förstöra helt!");
		try {
			int nr = in.nextInt();
			System.out.println(nr);
			ToDo.taBort(nr);
		}
		catch (NumberFormatException e){	
			System.out.println("Skärpning...skriv nu en siffra...");
			bort();
		}
	
		
	}
	public static void sök() {
		System.out.println("Skriv nåt som du vill söka rätt på...genast!");
		try {
			String ord = in.nextLine();
			System.out.println(ord);
			ToDo.kolla(ord);
		}
		catch (NumberFormatException e){	
			System.out.println("Skärpning...skriv nu en siffra...");
			sök();
		}
	
	
	}

}