import java.time.LocalDateTime;


public class Event {
	static int nr;
	String item;
	boolean done = false;
	String attGöra;
	LocalDateTime pickAdate;
	LocalDateTime timeStamp = LocalDateTime.now();

	
	public Event(String item) {
		super();
		doneUndone();
		this.item = item;
		attGöra = this.attGöra;
		if (done == true) {
			done = true; 
		}
		else if (done = true) 
			done = false;
		if (done == false) {
			attGöra = "Du Måste";
		} else {
			attGöra = "Klart!";

		System.out.println(nr +" "+ attGöra +" "+ item +" "+ timeStamp);
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
			attGöra = "Klart!";
		}
		else {
			done = false;
			attGöra = "Du Måste";
		}
	
	
		System.out.println(attGöra);

	}

	}
