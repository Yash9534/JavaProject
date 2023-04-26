package part3;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayEX4 {
public static void main(String[] args) {
	ArrayList<Integer>ob=new ArrayList<Integer>();
  ob.add(60);
  ob.add(80);
  ob.add(10);
  ob.add(120);
  ob.add(80);
  for(Integer i:ob)
	  System.out.println(i);
  for(int i=0;i<ob.size();i++)
  {
	  System.out.println(ob.get(i));
  }
 // System.out.println(ob);
  Collections.sort(ob);
  System.out.println(ob);
}

}
