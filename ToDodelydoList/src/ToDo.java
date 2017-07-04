
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ToDo {
	public static LinkedList<Sak> alla = new LinkedList<Sak>();


	public static void add (String input) {
//		System.out.println("Sak skapades och lades till i Arraylist ALLA");
		ToDo.alla.add(new Sak(input));

	}

	public static void listAlla(){
		int i = 0;
		System.out.println("_________________________________________________________________");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("index" + "  " + "id" +"  Status    Skapad     Klockan  Uppdrag");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Sak s : alla){		
			System.out.println(i + "      " + s.printPost());
			i++;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-?-");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void �ndraStatusP�Alla(){ // CP-FUNKTION
		int i = 0;							// som �ndrar status p� alla Saker
		for(Sak grej : alla){		
			grej.�ndraStatus();
			i++;
		}
		System.out.println("status �ndrad p� alla");
	} 

	public static void �ndraStatusP�En(int in){ // pipar index
		if (alla.size() < in) {
			System.out.println("Den posten finns inte...f�r h�gt nummer...f�rs�k igen...");
			Scan.gjordV�xel();
		}
		int i = 0;							
		for(Sak grej : alla){
			if (i ==in){
				grej.�ndraStatus();	
			}
			i++;
		}
		System.out.println("status �ndrad p� index " + in);
	} 

	public static void taBort(int in){ // pipar index
		if (alla.size() < in) {
			System.out.println("Den posten finns inte...f�r h�gt nummer...f�rs�k igen...");
			Scan.bort();
		}
		System.out.println("Vilken Ska bort?");
		alla.remove(in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("sak p� index " + in +" blev f�rintad och de efter index \n"
		+ in + " blev uppflyttade och fick nytt l�gre index.");

	}	

	public static void taBortAvklarade(){ 
		Iterator<Sak> it = alla.iterator();
		if (alla.size() > 0) // Tack Magnus!
			while (it.hasNext()){ 
				Sak grej = it.next(); // tillf�llig sak
				if (grej.getStatusString().equals("- AVKLARAT!")){ // J�mf�r tillf�llig sak med Status
					it.remove();
				}
			}
		System.out.println("Alla AVKLARADE! �r nu borst�dade ur systemet.");

	}
	public static void kolla(String X){
		int i = -1;
		int p = 0;
			for(Sak grej : alla){
				i++;
				if (grej.getBeskrivning().equals(X)){
					System.out.println("Succ�..." + X + " Existerar i knasprogrammet!!!...p� index: "+ i);
					p++;
					continue;
				}
				}
			if (p < 1) {
			System.out.println("Otur " + X + " Existerar inte i knasprogrammet!!!");
			}
		
}}
