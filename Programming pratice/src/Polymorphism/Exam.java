package Polymorphism;
interface I1
{
	void show();
}
interface I2
{
	void display();
}
public class Exam implements I1,I2 
{
	public void display() {
		System.out.println("display method");
	}

	public void show() {
		System.out.println("show method");
	}
public static void main(String[] args) {
	Exam ob=new Exam();
	ob.show();
	ob.display();
}
}
