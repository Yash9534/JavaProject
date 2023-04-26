import java.util.HashMap;
import java.util.TreeMap;

import Collection.Student;
public class MapEx2 {
public static void main(String [] args)
{
	TreeMap<Integer,Student>h=new TreeMap<Integer,Student>();
	h.put(87,new Student(102,"Milan"));
	h.put(89,new Student(253,"Maya"));
	h.put(99,new Student(305,"Amar"));
	h.put(145,new Student(146,"Ziya"));
	System.out.println(h);
	h.remove(89);
	System.out.println(h);
}
}
