import java.util.ArrayList;
public class Student1 {
String name;
int id;
public Student1(String name,int id)
{
	this.name=name;
	this.id=id;
}
public static void main(String [] args)
{
Student1 s1=new Student1("meena",201);
Student1 s2=new Student1("ajay",102);
Student1 s3=new Student1("riya",108);
Student1 s4=new Student1("kiran",405);
s1.displayProfile();
s2.displayProfile();
s3.displayProfile();
s4.displayProfile();
}

private void displayProfile() {
	System.out.print("Student1="+name);
	System.out.println(id);
	
}

}
