import java.util.Set;
import java.util.TreeSet;

public class START {
		  public static void main(String[] args) {
			  String postNamn;
			  postNamn = "e1";
			  
			  Event e1 = new Event("Jobba");
			  Event e2 = new Event("Bajsa");
			  Event e3 = new Event("Sova");
			  
//			System.out.println(Jobba.timeStamp);
//			System.out.println(Bajsa.item);
//			System.out.println(Event.doneUndone);
//			  
			    ToDoList list = new ToDoList();
			    list.add(new Event("Jobba"));
				list.add(new Event("Bajsa"));
				list.add(new Event("Sova"));
				
				System.out.println(ToDoList.list.size()+ " i LinkedHashSet");
				
				e1.doneUndone();
				e1.doneUndone();
				e1.doneUndone();
				
		  }

	
			
		}




	


