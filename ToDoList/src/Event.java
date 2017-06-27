import java.time.LocalDateTime;


public class Event {
	static int nr;
	String item;
	String attGöra;
	boolean done = false;
	LocalDateTime pickAdate;
	LocalDateTime timeStamp = LocalDateTime.now();

	public void doneUndone() {
		if (done == false) {
			done = true; 
		}
		else if (done = true) 
			done = false;
		System.out.println(done);
	}
	public Event(String item) {
		super();
		this.item = item;

		if (done == false) {
			attGöra = "Du Måste";
		} else {
			attGöra = "Klart!";

		}
		System.out.println(nr +" "+ attGöra +" "+ item +" "+ timeStamp);
		// list.add("e"+nr);
		nr++;
	}

	public boolean isDone() {

		return done;
	}

	}


