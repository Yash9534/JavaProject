package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
ArrayList<Object> al=new ArrayList<Object>();
al.add(100);
al.add("Btm");
al.add(120.5f);
System.out.println(al);
ArrayList<Object> ob=new ArrayList<>();
ob.add(200);
ob.add(350);
ob.addAll(al);
al.removeAll(al);
System.out.println(ob);
System.out.println("printing using for each loop");
for(Object i:ob) {
System.out.println(i);
	}
	}
}
