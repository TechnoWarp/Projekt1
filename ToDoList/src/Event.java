import java.time.LocalDateTime;


public class Event {
	static int nr;
	String item;
	String attG�ra;
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
			attG�ra = "Du M�ste";
		} else {
			attG�ra = "Klart!";

		}
		System.out.println(nr +" "+ attG�ra +" "+ item +" "+ timeStamp);
		// list.add("e"+nr);
		nr++;
	}

	public boolean isDone() {

		return done;
	}

	}


