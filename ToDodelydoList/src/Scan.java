import java.util.Scanner;

public class Scan {
	
	static Scanner in = new Scanner(System.in);
	String ord = in.nextLine();
	
	public static void scan() {
		System.out.println("Skriv n�t som du vill g�ra att g�ra!");
		String ord = in.nextLine();
		System.out.println(ord);
		ToDo.add(ord);
		
	}
	

}
