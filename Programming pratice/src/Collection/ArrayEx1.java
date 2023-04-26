package Collection;

import java.util.ArrayList;

public class ArrayEx1 {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<>();
al.add(50);
al.add(100);
al.add(125);
ArrayList<Integer> ob=new ArrayList<>();
ob.add(150);
ob.add(250);
ob.addAll(al);
System.out.println(ob);
System.out.println("printing using for each loop");
for(Integer i:ob)
{
	System.out.println(i);
}
ob.removeAll(al);
System.out.println("-----------------------------"); 
	System.out.println(ob);
	}

}
