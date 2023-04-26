package Array;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsingRemove {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(10);
		al.add(120);
		ListIterator<Integer> ob=al.listIterator();
		System.out.print("printing in forward direction");
		while(ob.hasNext()==true)
		{
			System.out.println(ob.next());
		}
		System.out.println("printing element in backward direction");
		while(ob.hasPrevious()==true)
		{
			System.out.println(ob.previous());
		}
	}

}
