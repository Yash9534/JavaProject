package HashSetMethod;

import java.util.HashSet;
import java.util.Iterator;

public class HS1 {

	public static void main(String[] args) {
HashSet<String> h=new HashSet<>();
h.add("Aniket");
h.add("Zysa");
h.add("yamna");
h.add("wak");
h.add("kalu");
System.out.println(h);
Iterator<String> i=h.iterator();
while(i.hasNext())
{
 System.out.println(i.next());
}
h.remove("kalu");
System.out.println(h);
	h.add("Saurabh");
	System.out.println(h);
	}
}
