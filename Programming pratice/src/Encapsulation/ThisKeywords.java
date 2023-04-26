package Encapsulation;

public class ThisKeywords {
int id;
String name;
long phno;
public ThisKeywords(int id, String name, long phno) {
	this.id = id;
	this.name = name;
	this.phno = phno;
}
void show()
{
	System.out.println("Id is "+id);
	System.out.println("Name is "+name);
	System.out.println("Phone no is "+phno);
}
public static void main(String[] args) {
ThisKeywords ob=new ThisKeywords(105,"rudra",8569875235l);
ob.show();
}
}

