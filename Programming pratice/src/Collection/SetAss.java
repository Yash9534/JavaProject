package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetAss {

	public static void main(String[] args) {
TreeSet<String> ts=new TreeSet<>();
ts.add("raju");
ts.add("sonu");
ts.add("dimple");
ts.add("golu");

TreeSet<String>h=new TreeSet<>();
h.addAll(ts);
System.out.println("after adding all the object to other treeset");
System.out.println(h);
h.remove("dimple");
System.out.println("After removing dimple");
System.out.println(h);
h.add("riya");
System.out.println("after adding riya");
System.out.println(h);
System.out.println("riya is present or not ");
System.out.println(h.contains("riya"));
TreeSet<String> s=new TreeSet<>();
System.out.println("all elements present or not ");
System.out.println(h.containsAll(s));
h.removeAll(ts);
s.clear();
System.out.println(" "+h);
System.out.println(" "+ts);
}
	}