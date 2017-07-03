
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ToDo {
	public static LinkedList<Sak> alla = new LinkedList<Sak>();


	public static void add (String input) {
		System.out.println("Sak skapades och lades till i Arraylist ALLA");
		ToDo.alla.add(new Sak(input));


		//		{
		//	}
		//		public static int sök(int inp) {  // TRAMS
		//		boolean sök = Alla.contains(inp);
		//		if (sök = false)
		//			System.out.println(inp +" Finns inte i maskin...");
		//		if (sök = true) {
		//			return Alla.indexOf(inp);	
		//		}
		//		return 0;

	}

	public static void listAlla(){
		int i = 0;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("index" + "  " + "id" +"  Status    Skapad     Klockan");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(Sak s : alla){		
			System.out.println(i + "      " + s.printPost());
			i++;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	//public static void gjord(int nr)	{	 // ÄNDRA STATUS pipat index
	//	Alla.remove(Alla.indexOf(nr));		// DEFEKT KOD UTAN ERROR
	//	ToDo.listAlla();
	//	Meny.meny();
	//}
	//	Alla.indexOf(nr)ändraStatus();

	public static void ändraStatusPåAlla(){ // CP-FUNKTION
		int i = 0;							// som ändrar status på alla Saker
		for(Sak grej : alla){		
			grej.ändraStatus();
			i++;
		}
		System.out.println("status ändrad på alla");
	} 

	public static void ändraStatusPåEn(int in){ // pipar index
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
		System.out.println("Vilken Ska bort?");
		alla.remove(in);	
		System.out.println("sak på index " + in +" blev förintad och de efter index " + in + " blev uppflyttade och fick nytt lägre index.");

	}	

	public static void taBortAvklarade(){ // Fungerande dubbelknasloop, sorry men jag fick ingen hjälp.
		int i = 0;
		while (i < alla.size())
			for(Sak grej : alla){
				if (grej.getStatusString() == "- AVKLARAT!"){
					alla.remove(i);
					break;
				}
				i++;
			}
		System.out.println("Alla AVKLARADE! är nu borstädade ur systemet.");

	}
	
}
