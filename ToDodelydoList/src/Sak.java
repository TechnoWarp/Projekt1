import java.time.LocalDateTime;

public class Sak {
	private static int löpNr = 1;
	private int nr;
	private String beskrivning;
	private String statusString;
	LocalDateTime timeStamp = LocalDateTime.now();
	String time = timeStamp.toString().replace("T", "  ").substring(0, 20);
	LocalDateTime pickAdate;
	
	public Sak(String beskrivning) {
		super();
		this.nr = löpNr;
		this.beskrivning = beskrivning;
		this.statusString = "- ATT GÖRA!";
		this.timeStamp = timeStamp;
		this.time = time;
		this.pickAdate = pickAdate;
		
		System.out.println("Constructor is running " + nr);
		löpNr++;
	}
		public void add (String input) {
			System.out.println("Sak lades till i Arraylist Alla");
			ToDo.Alla.add(new Sak(input));
	
	}

	public void setBeskrivning(String beskrivning) {
		this.beskrivning = beskrivning;
	}

	public String getBeskrivning() {
		String returnValue = nr + " "+ statusString +" "+ time +" "+ beskrivning  ;
		return returnValue;
	}

	public String getTime() {
		return time;
	}
	
	public void ändraStatus() {
		if (statusString == "- AVKLARAT!") {
			statusString = "- ATT GÖRA!";
		}
		else if (statusString == "- ATT GÖRA!") {
			statusString = "- AVKLARAT!";
		}
	}
	public int getNr() {
		return nr;
	
		
	}
}		