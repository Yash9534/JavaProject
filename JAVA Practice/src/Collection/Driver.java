package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
ArrayList<Student>al=new ArrayList<>();
al.add(new Student(98, "satya"));
al.add(new Student(102, "nitesh"));
al.add(new Student(95, "Ravi"));
Collections.sort(al);
System.out.println(al);
	}

}
