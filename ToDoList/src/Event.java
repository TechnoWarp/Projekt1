import java.time.LocalDateTime;


public class Event {
	static int nr;
	String item;
	boolean done = false;
	String attG�ra;
	LocalDateTime pickAdate;
	LocalDateTime timeStamp = LocalDateTime.now();

	
	public Event(String item) {
		super();
		doneUndone();
		this.item = item;
		attG�ra = this.attG�ra;
		if (done == true) {
			done = true; 
		}
		else if (done = true) 
			done = false;
		if (done == false) {
			attG�ra = "Du M�ste";
		} else {
			attG�ra = "Klart!";

		System.out.println(nr +" "+ attG�ra +" "+ item +" "+ timeStamp);
	//	ToDoList.list.add("e"+this.nr);
		nr++;
	}
	}
	public boolean isDone() {
		return done;
	}
	public void doneUndone() {
		if (done == false) {
			done = true; 
			attG�ra = "Klart!";
		}
		else {
			done = false;
			attG�ra = "Du M�ste";
		}
	
	
		System.out.println(attG�ra);

	}

	}
