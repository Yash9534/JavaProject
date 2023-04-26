package DEMO;

public class Student extends Person {
int sid;
String stream;
	public Student(String name, int age, int sid, String stream) {
	super(name, age);
	this.sid = sid;
	this.stream = stream;
}
	public void displayStudent()
	{
		displayPeson();
		System.out.println("sid is "+sid);
		System.out.println("stream is "+stream);
	}
	public static void main(String[] args) {
Student s=new Student("Ram",102,501,"civil");
s.displayStudent();
//s.displayPeson();
	}

}
