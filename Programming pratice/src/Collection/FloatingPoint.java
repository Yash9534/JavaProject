package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class FloatingPoint {

	public static void main(String[] args) {
LinkedList<Float>al=new LinkedList<Float>();
al.add(12.5f);
al.add(25.6f);
al.add(3.5f);
Collections.sort(al);
for(Float i:al)
{
System.out.println(i);
	}
  }
}
