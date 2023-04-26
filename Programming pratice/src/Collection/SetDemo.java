package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
HashSet<String> s=new HashSet();
s.add("Mad");
s.add("Sadhu");
s.add("Kalu");
s.add("Molu");
s.add("Avi");
System.out.println(s);

Iterator<String> i=s.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}


	}
}
