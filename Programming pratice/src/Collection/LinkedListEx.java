package Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
LinkedList<Object> le=new LinkedList();
le.add("deepak");
le.add("satu");
le.add("012");
le.add(12.5);
le.add('f');
System.out.println(le);

le.removeFirst();
System.out.println(le);
	}
}
