import java.util.Scanner;

public class Scan {
	
	static Scanner in = new Scanner(System.in);
	String ord = in.nextLine();
	
	public static void ny() {
		System.out.println("Skriv n�t som du vill g�ra att g�ra!");
		String ord = in.nextLine();
		System.out.println(ord);
		ToDo.add(ord);
		
	}
	
	public static void gjordV�xel() {
		System.out.println("Tryck in det index p� den sak du vill �ndra status p�!");
		int nr = in.nextInt();
		System.out.println(nr);
		ToDo.�ndraStatusP�En(nr);
		}
	
	public static void bort() {
		System.out.println("Tryck in det index p� den sak du vill f�rst�ra helt!");
		int nr = in.nextInt();
		System.out.println(nr);
		ToDo.taBort(nr);
	}
	
	
	
	

}