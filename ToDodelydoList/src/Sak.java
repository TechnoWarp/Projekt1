import java.time.LocalDateTime;

public class Sak {
	public static int löpNr = 1;
	public int nr;
	public String beskrivning;
	public String statusString = "- ATT GÖRA!";
	public LocalDateTime timeStamp = LocalDateTime.now();
	public String time = timeStamp.toString().replace("T", " ").substring(0, 19);
	
	LocalDateTime pickAdate;
	
	public Sak(String beskrivning) {
		super();
		this.nr = löpNr;
		this.beskrivning = beskrivning;
		this.statusString = statusString;
		this.timeStamp = timeStamp;
		this.time = time;
		this.pickAdate = pickAdate;
		
		System.out.println("Constructor is running " + nr);
		löpNr++;
	}
		public void add (String input) {
			System.out.println("Sak lades till i Arraylist Alla");
			ToDo.alla.add(new Sak(input));
		}
		
	public String getStatusString() {
		return statusString;
		
	}

	public void setBeskrivning(String beskrivning) {
		this.beskrivning = beskrivning;
	}

	public String printPost() {
		String returnValue = nr + " "+ statusString +" "+ time +" "+ beskrivning  ;
		return returnValue;
		
	}
	
	public String getBeskrivning() { // Write to File!
		return beskrivning;
			
		}
	
	

	public String getTime() {
		return time;
	}
	
	public String getStatus() {
		return statusString;
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