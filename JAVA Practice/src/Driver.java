import java.util.ArrayList;
import java.util.Collections;

import Collection.Student;

public class Driver {
	public static void main(String[] args) 
	{
	  ArrayList<Student>al=new ArrayList<Student>();
	  al.add(new Student (98,"Riya"));
	  al.add(new Student (102,"Madhu"));
	  al.add(new Student (107,"Priya"));
	  Collections.sort(al);
	  System.out.println(al);
	}
}
