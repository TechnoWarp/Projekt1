
import java.util.LinkedList;
import java.util.List;


public class ToDo {
	public static List<Sak> Alla = new LinkedList<Sak>();
	
	public static void add (String input) {
		System.out.println("Sak skapades och lades till i Arraylist ALLA");
		ToDo.Alla.add(new Sak(input));
//		
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
			System.out.println("index" + "  " + "id");
			for(Sak s : Alla){		
				System.out.println(i + "      " + s.getBeskrivning());
				i++;
			}
		}
	
	public static void gjord(int nr)	{
		Alla.remove(Alla.indexOf(nr));
	//	Sak.�ndraStatus(Alla.indexOf(nr));
		
		
		
		
	}
		
}