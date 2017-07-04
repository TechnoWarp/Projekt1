
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

	public static void ändraStatusPåAlla(){ // CP-FUNKTION
		int i = 0;							// som ändrar status på alla Saker
		for(Sak grej : alla){		
			grej.ändraStatus();
			i++;
		}
		System.out.println("status ändrad på alla");
	} 

	public static void ändraStatusPåEn(int in){ // pipar index
		if (alla.size() < in) {
			System.out.println("Den posten finns inte...för högt nummer...försök igen...");
			Scan.gjordVäxel();
		}
		int i = 0;							
		for(Sak grej : alla){
			if (i ==in){
				grej.ändraStatus();	
			}
			i++;
		}
		System.out.println("status ändrad på index " + in);
	} 

	public static void taBort(int in){ // pipar index
		if (alla.size() < in) {
			System.out.println("Den posten finns inte...för högt nummer...försök igen...");
			Scan.bort();
		}
		System.out.println("Vilken Ska bort?");
		alla.remove(in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("sak på index " + in +" blev förintad och de efter index \n"
		+ in + " blev uppflyttade och fick nytt lägre index.");

	}	

	public static void taBortAvklarade(){ 
		Iterator<Sak> it = alla.iterator();
		if (alla.size() > 0) // Tack Magnus!
			while (it.hasNext()){ 
				Sak grej = it.next(); // tillfällig sak
				if (grej.getStatusString().equals("- AVKLARAT!")){ // Jämför tillfällig sak med Status
					it.remove();
				}
			}
		System.out.println("Alla AVKLARADE! är nu borstädade ur systemet.");

	}
	public static void kolla(String X){
		int i = -1;
		int p = 0;
			for(Sak grej : alla){
				i++;
				if (grej.getBeskrivning().equals(X)){
					System.out.println("Succé..." + X + " Existerar i knasprogrammet!!!...på index: "+ i);
					p++;
					continue;
				}
				}
			if (p < 1) {
			System.out.println("Otur " + X + " Existerar inte i knasprogrammet!!!");
			}
		
}}
