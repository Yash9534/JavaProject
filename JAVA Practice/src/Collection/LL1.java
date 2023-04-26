package Collection;

import java.util.LinkedList;

public class LL1 {

	public static void main(String[] args) {
LinkedList<Float>al=new LinkedList<>();
al.add(12.5f);
al.add(10.6f);
al.add(15.3f);
System.out.println(al);
System.out.println("print using for each loop");
for(Float i:al) {
System.out.println(i);
}
	}

}
