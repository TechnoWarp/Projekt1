
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
		//		public static int s�k(int inp) {  // TRAMS
		//		boolean s�k = Alla.contains(inp);
		//		if (s�k = false)
		//			System.out.println(inp +" Finns inte i maskin...");
		//		if (s�k = true) {
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

	//public static void gjord(int nr)	{	 // �NDRA STATUS pipat index
	//	Alla.remove(Alla.indexOf(nr));		// DEFEKT KOD UTAN ERROR
	//	ToDo.listAlla();
	//	Meny.meny();
	//}
	//	Alla.indexOf(nr)�ndraStatus();

	public static void �ndraStatusP�Alla(){ // CP-FUNKTION
		int i = 0;							// som �ndrar status p� alla Saker
		for(Sak grej : alla){		
			grej.�ndraStatus();
			i++;
		}
		System.out.println("status �ndrad p� alla");
	} 

	public static void �ndraStatusP�En(int in){ // pipar index
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
		System.out.println("Vilken Ska bort?");
		alla.remove(in);	
		System.out.println("sak p� index " + in +" blev f�rintad och de efter index " + in + " blev uppflyttade och fick nytt l�gre index.");

	}	

	public static void taBortAvklarade(){ // Fungerande dubbelknasloop, sorry men jag fick ingen hj�lp.
		int i = 0;
		while (i < alla.size())
			for(Sak grej : alla){
				if (grej.getStatusString() == "- AVKLARAT!"){
					alla.remove(i);
					break;
				}
				i++;
			}
		System.out.println("Alla AVKLARADE! �r nu borst�dade ur systemet.");

	}
	
}
