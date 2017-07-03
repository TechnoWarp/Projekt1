import java.util.Scanner;

public class Scan {
	
	static Scanner in = new Scanner(System.in);
	String ord = in.nextLine();
	
	public static void ny() {
		System.out.println("Skriv nåt som du vill göra att göra!");
		String ord = in.nextLine();
		System.out.println(ord);
		ToDo.add(ord);
		
	}
	
	public static void gjordVäxel() {
		System.out.println("Tryck in det index på den sak du vill ändra status på!");
		int nr = in.nextInt();
		System.out.println(nr);
		ToDo.ändraStatusPåEn(nr);
		}
	
	public static void bort() {
		System.out.println("Tryck in det index på den sak du vill förstöra helt!");
		int nr = in.nextInt();
		System.out.println(nr);
		ToDo.taBort(nr);
	}
	
	
	
	

}