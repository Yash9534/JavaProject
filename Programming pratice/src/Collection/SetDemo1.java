package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo1 {

	public static void main(String[] args) {
HashSet<Integer> h=new HashSet<>();
h.add(10);
h.add(50);
h.add(null);
h.add(20);
System.out.println(h);

Iterator<Integer> it=h.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}
