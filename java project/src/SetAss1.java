import java.util.Iterator;
import java.util.TreeSet;
public class SetAss1 {
public static void main(String[] args) {
	TreeSet<String>h=new TreeSet<String>();
	h.add("Raju");
	h.add("Rahul");
	h.add("Monu");
	h.add("Dimple");
	TreeSet<String>ts=new TreeSet<String>();
	ts.addAll(h);
	System.out.println("After adding all the objecct to the treeset");
	System.out.println(ts);
	ts.remove("Rahul");
	ts.add("Mahi");
	System.out.println("After removing Rahul");
	System.out.println(ts);
	System.out.println("Dimple is present or not?");
	System.out.println(ts.contains("dimple"));
	TreeSet<String>s=new TreeSet<String>(ts);
	System.out.println("All elements present or not?");
	System.out.println(ts.containsAll(s));
	ts.removeAll(h);
	s.clear();
	System.out.println(" "+ts);
	System.out.println(" "+h);
	Iterator i=s.iterator();
	while(i.hasNext());
	{
		System.out.println(i.next());
	}
}
}
