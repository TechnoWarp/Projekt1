import java.util.Scanner;

public class Meny {
	static Scanner in = new Scanner(System.in);
	String val = in.nextLine();
	
	public static void meny() {
		System.out.println("VÄLJ & SVÄLJ!");
		System.out.println("1-4");
		String val = in.nextLine();
		System.out.println("Du valde "+ val);
		
		switch (val) {
		default:
			System.out.println("Dum och dålig!");
			Meny.meny();
		break;
		case "1": ToDo.listAlla();
				Meny.meny();
		break;
		
		case "2": Scan.scan();
				Meny.meny();
		break; 
		
		case "4": Scan.scan();
		break; 
		
		case "5": Scan.scan();
		break;
		
		case "6": Scan.scan();
		break;
		
		case "7": Scan.scan();
		break;
		
		case "8": Scan.scan();
		break;
		
		case "9": Scan.scan();
		break;
	
		
		}
		
	}

	}
