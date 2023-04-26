package DEMO;

public class StudentTo {
int id;
String name;

StudentTo (int id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString()
{
	return id+" "+name;
}
	public static void main(String[] args) {
     StudentTo ob=new StudentTo(105,"manish");
     StudentTo ob1=new StudentTo(106,"avi");
     System.out.println(ob);
     System.out.println(ob1);
	}

}
