package part3;

import java.util.ArrayList;
import java.util.Collections;
public class Student implements Comparable<Student>
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	public int CompareTo(Student s)
	{
		if(this.id>s.id)
			return 1;
		else if(this.id<s.id)
			return -1;
		else
			return 0;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Drivers
{
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(new Student(98,"Riya"));
		al.add(new Student(102,"priya"));
		Collections.sort(al);
System.out.println(al);
	}
}
