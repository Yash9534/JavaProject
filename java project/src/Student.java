
public class Student {
	int id;
	String name;


	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	{
		Student ob=new Student(102,"satya");
		System.out.println(ob);
		Student ob2=new Student(108,"lal");
		System.out.println(ob2);
}
}
	
	}


