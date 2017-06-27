import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class ToDoList {

	public static Set<Event> list = new LinkedHashSet<Event>();

	public void add(Event event) {
	list.add(event);
		
	}
}