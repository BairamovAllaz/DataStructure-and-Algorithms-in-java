import java.util.Iterator;
import java.util.ListIterator;

public class main {
	public static void main(String args[]) { 
		Linkedlist<String> a = new Linkedlist<String>("I","Am","Allaz","Bairamov");
		for(int i = 0; i < a.size();i++) { 
			System.out.println(a.get(i));
		}
	}
}
