
public class Start {

	public static void main(String[] args) {
		
		Sak a = new Sak("Bajsa");
		Sak b = new Sak("Duscha");
		Sak c = new Sak("Borsta Tänderna");
		System.out.println();
		System.out.println(a.getBeskrivning());
		System.out.println(b.getBeskrivning());
		System.out.println(c.getBeskrivning());
		System.out.println();
		
		// ändra bajsa till kissa
		a.setBeskrivning("Kissa");
		System.out.println(a.getBeskrivning()+ "   ...ändrad");
		
		System.out.println(a.getTime());
		System.out.println(b.time);
		
		a.ändraStatus();
		System.out.println(a.getBeskrivning()+ "   ...ändrad igen");
		
		a.ändraStatus();
		System.out.println(a.getBeskrivning()+ "   ...ändrad igen");
		System.out.println();
		
		ToDo.add("Bajsa");
		ToDo.add("Jobba");
		ToDo.add("Dö");
		
		ToDo.Alla.add(a);	
		ToDo.Alla.add(b);
		ToDo.Alla.add(c);
		
		System.out.println("**********************");
		
		ToDo.listAlla();
		
		System.out.println("**********************");
		
//		Scan.scan();
		
		
//		Meny.meny();
		
		ToDo.gjord(3);
		
		ToDo.listAlla();
		
	}
	
		
}
