package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Execution {

	public static void main(String[] args) {
ArrayList<Mobile>al=new ArrayList<>();
al.add(new Mobile(13000, "vivo", "blue"));
al.add(new Mobile(12000, "oppo", "black"));
Collections.sort(al);
System.out.println(al);

	}

}
