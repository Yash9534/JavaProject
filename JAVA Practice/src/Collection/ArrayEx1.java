package Collection;

import java.util.ArrayList;

public class ArrayEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add(50);
		ob.add(75);
		ob.add(30);
		ob.add(20);
		ob.add(75);
		ArrayList<Integer>ob2=new ArrayList<>();
		ob2.add(100);
		ob2.add(250);
		ob2.addAll(ob);
	
		System.out.println(ob2);
	System.out.println("printing using for each loop");
	for(Integer i:ob2) {
		System.out.println(i);
	}
	/*for(int i=0;i<ob2.size();i++) {
		//System.out.println(ob2.get(i));
	}*/
	
	}

}
