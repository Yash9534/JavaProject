import java.util.HashSet;
import java.util.Iterator;
public class HS1 {
public static void main(String[] args) {
	HashSet<String> h=new HashSet<String> ();
	h.add("Brajraj");
	h.add("Raju");
	h.add("Vinyak");
	h.add("Amit");
	h.add("Suma");
	Iterator<String> i=h.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
