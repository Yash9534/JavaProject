package part3;

public class Student1 extends Person{
	int sid;
	String stream;
	
	public Student1(String name, int age, int sid, String stream) {
		super(name, age);
		this.sid = sid;
		this.stream = stream;
	}

public void displayStudent1()
{
displayPerson();
System.out.println("sid is "+sid);
System.out.println("stream is "+stream);
}
	public static void main(String[] args) {
Student1 s=new Student1("Amit",26,102,"mech");
s.displayStudent1();
	}

}
