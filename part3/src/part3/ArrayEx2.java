package part3;
import java.util.ArrayList;
public class ArrayEx2 {
public static void main(String [] args) {
	ArrayList<Object>ob=new ArrayList<Object>();
	ob.add("SQL");
	ob.add("JAVA");
	ob.add("120.2f");
	ob.add(100);
	ob.add("JAVA");
	System.out.println("the size of the list created is  "+ob.size());
	System.out.println("printing using for each loop");
	for (Object i:ob)
	{
		System.out.println(i);
	}
	int index=ob.indexOf("SQL");
	ob.remove(index);
	 System.out.println("after removing SQL ,List is "+ob);
	 System.out.println(ob.contains("SQL"));
	 System.out.println("now size of the list is "+ob.size());


	}
}

