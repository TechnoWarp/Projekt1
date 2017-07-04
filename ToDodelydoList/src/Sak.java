import java.time.LocalDateTime;

public class Sak {
	public static int löpNr = 1;
	public int id;
	public String beskrivning;
	public String statusString = "- ATT GÖRA!";
	public LocalDateTime timeStamp = LocalDateTime.now();
	public String time = timeStamp.toString().replace("T", " ").substring(0, 19);
	public int addDays = 0;
	public LocalDateTime pickAdate;

	

	public Sak(String beskrivning) { // min minimala construktor med inbyggd metod för
									// inkrementering av löpnummer som blir id på troligtvis efterbliet sätt...
		super();
		this.id = löpNr;
		this.beskrivning = beskrivning;
		// System.out.println("Constructor is running " + id);
		löpNr++;
	}

	public void add(String input) {
		System.out.println("Sak lades till i ToDo Listan \"alla\"");
		ToDo.alla.add(new Sak(input));
	}

	public String getStatusString() {
		return statusString;

	}

	public void setBeskrivning(String beskrivning) {
		this.beskrivning = beskrivning;
	}

	public String printPost() {
		String returnValue = id + " " + statusString + " " + time + " " + beskrivning;
		return returnValue;

	}

	public String getBeskrivning() {
		return beskrivning;

	}

	public String getTime() {
		return time;
	}

	public String getStatus() {
		return statusString;
	}

	public void ändraStatus() { // växlar status...(punkt 3 och 8 Requirements)
								// på samma gång...check!
		if (statusString == "- AVKLARAT!") {
			statusString = "- ATT GÖRA!";
		} else if (statusString == "- ATT GÖRA!") {
			statusString = "- AVKLARAT!";
		}
	}

	public int getNr() {
		return id;

	}

	/////////////////////// Extra constructor för att kunna spara kanske/////////////////////////////////////
	public Sak(int id, String beskrivning, String statusString, LocalDateTime timeStamp, String time, int addDays,
			LocalDateTime pickAdate) {
		super();
		this.id = id;
		this.beskrivning = beskrivning;
		this.statusString = statusString;
		this.timeStamp = timeStamp;
		this.time = time;
		this.addDays = addDays;
		this.pickAdate = pickAdate;
		//////////////// som fd elev Matias som leker lärare här inte kunde hjälpa oss med /////////////////
	}
}