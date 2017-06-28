import java.time.LocalDateTime;

public class Tid {
	static int löpNr = 1;
	static LocalDateTime ur = LocalDateTime.now();
	public int nr;
	public static String tid;
	
	
	
	public static int getLöpNr() {   
		return löpNr;
	}
	public static String getUr() {    // TRAMS
	String tidSträng = ur.toString();
	tidSträng.replace("T", "MMMM");
	tid = tidSträng.substring(0, 20);
		return tidSträng;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Tid [toString()=" + super.toString() + "]";
	}
//	public static LocalDateTime T() {
//		return löpNr + ur;

}
//}