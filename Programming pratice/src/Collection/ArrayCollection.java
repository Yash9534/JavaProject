package Collection;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayCollection {

	public static void main(String[] args) {
ArrayList<Integer>ob=new ArrayList<>();
ob.add(100);
ob.add(50);
ob.add(12);
ob.add(10);
ob.add(200);
for(Integer i:ob)
{
	System.out.println(i);
}
/*for(int i=0;i<ob.size();i++)
{
	
	System.out.println(ob.get(i));
}*/
Collections.sort(ob);
System.out.println(ob);
	}
}
