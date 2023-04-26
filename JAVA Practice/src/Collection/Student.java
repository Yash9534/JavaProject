package Collection;

public class Student implements Comparable<Student> {
int id;
String name;
public Student (int id,String name) {
this .id=id;
this.name=name;
}
public String toString()
{
	return id+" "+name;
}

public int compareTo(Student s) {
if (this.id>s.id)
	return 1;
else if(this.id<s.id)
return -1;
else
	return 0;
}
}
