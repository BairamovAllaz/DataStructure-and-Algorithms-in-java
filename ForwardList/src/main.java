import java.util.Iterator;
import java.util.ListIterator;

public class main {
	public static void main(String args[]) { 
		Linkedlist<String> a = new Linkedlist<String>("I","Am","Allaz","Bairamov");
//		a.createLinkedlist("Hello","World","Fuck","You");
//		a.createLinkedlist("Hello","World","Fuck","You");
		
		
		
		for(int i = 0; i < a.size();i++) { 
			System.out.println(a.get(i));
		}

		
	}
}
