import java.time.LocalDateTime;

public class Tid {
	static int l�pNr = 1;
	static LocalDateTime ur = LocalDateTime.now();
	public int nr;
	public static String tid;
	
	
	
	public static int getL�pNr() {   
		return l�pNr;
	}
	public static String getUr() {    // TRAMS
	String tidStr�ng = ur.toString();
	tidStr�ng.replace("T", "MMMM");
	tid = tidStr�ng.substring(0, 20);
		return tidStr�ng;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Tid [toString()=" + super.toString() + "]";
	}
//	public static LocalDateTime T() {
//		return l�pNr + ur;

}
//}