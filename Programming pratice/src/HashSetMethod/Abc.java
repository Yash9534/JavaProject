package HashSetMethod;

import java.util.LinkedHashSet;

public class Abc {

	public static void main(String[] args) {
LinkedHashSet<Object> hs=new LinkedHashSet<Object>();
hs.add(100);
hs.add(25.6f);
hs.add("Bangalore");
hs.add('A');
hs.add("Bangalore");
for(Object i:hs)
{
System.out.println(i);
	}
System.out.println("After removing 100 .........................");
hs.remove(100);
for(Object a:hs)
System.out.println(a);
System.out.println("After adding the element ....................");
hs.add(200);
for(Object b:hs)
{
System.out.println(b);
}
}
}
