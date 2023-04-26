package part3;
import java.util.ArrayList;
public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object>al=new ArrayList<Object>();
al.add(100);
al.add("java");
al.add("SQL");
al.add(120.8f);
al.add(true);
al.add("SQL");
System.out.println(al);
System.out.println("Printing using for each loop");
for(Object i:al)
{
	System.out.println(i);
}
	}

}
