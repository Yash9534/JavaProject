package part3;
import java.util.ArrayList;
import java.util.ListIterator;
public class ABC {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<Integer>();
	al.add(100);
	al.add(250);
	al.add(17);
	al.add(10);
ListIterator<Integer> ob= al.listIterator();
System.out.println("printing in forward direction");
while(ob.hasNext()==true)
{
System.out.println(ob.next());
}
System.out.println("Actual list is "+al);
while(ob.hasNext()==true)
{
	int element=ob.next();
	if(element==250)
		ob.remove();
}
System.out.println("After removing 250, list is "+al);
while(ob.hasPrevious()==true)
{
	int data=ob.previous();
	if(data==95)
		ob.set(99);
}
	System.out.println("printing elements in backward direction after replacing 95 ");
while(ob.hasPrevious()==true)
{
	System.out.println(ob.previous());
}	
}
}

