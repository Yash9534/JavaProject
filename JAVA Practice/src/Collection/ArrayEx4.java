package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx4 {

	public static void main(String[] args) {
ArrayList<Integer>ob =new ArrayList<>();
ob.add(90);
ob.add(60);
for( Integer i:ob) {
	System.out.println(i);
}
/*for(int i=0;i<ob.size();i++) {
	System.out.println(ob.get(i));
}*/
Collections.sort(ob);
System.out.println(ob);
	}

}
