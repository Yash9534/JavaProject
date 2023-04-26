package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
ArrayList<Student>al=new ArrayList<>();
al.add(new Student (102,"Amit"));
al.add(new Student(203,"anu"));
al.add(new Student(103,"mahi"));
Collections.sort(al);
System.out.println(al);
	}

}
