import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Meny {
	static ToDo t = new ToDo();
	
	static Scanner in = new Scanner(System.in);
	String val = in.nextLine();

	public static void meny() {
		System.out.println("VÄLJ & SVÄLJ!");
		System.out.println("1-5 & 8 (olika funktioner...learning by doing)");
		String val = in.nextLine();
		
		switch (val) {
		default:
			System.out.println("Dum och dålig! Du matade in helt fel...och datorn blev förvirrad...försök igen.");
			Meny.meny();
			
		break;
		case "1": ToDo.listAlla();
				  Meny.meny();
		break;
		
		case "2": Scan.ny();
				  ToDo.listAlla();
				  Meny.meny();
		break; 
		
		case "3": Scan.gjordVäxel();
			      ToDo.listAlla();
			      Meny.meny();
		break; 
		
		case "4": Scan.bort();
				  ToDo.listAlla();
				  Meny.meny();
		break;
		
		case "5": ToDo.taBortAvklarade();
				  Meny.meny();
		break;
		
		case "6":
			// Using XmlIO to save an object to file, errors are unexpected
			// (write protected files)
			try {
				XmlIO.saveObject("todolist.xml", t);
			
			} catch (IOException ex) {
				System.out.println("Error saving object");
				//Logger.getLogger(Sak.class.getBeskrivning()).log(Level.SEVERE, null, ex);
			} finally {
				Meny.meny();
			}
			break;	
				
		case "7":	
				//	ladda xlm			
			break;	
	
		
		case "8": 
			System.out.println("Hasta La Vista...Baby!");
			System.exit(0);
		break;
	 
	
		
		}
		
	}
}