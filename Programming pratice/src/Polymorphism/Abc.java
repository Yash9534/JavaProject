package Polymorphism;

public class Abc extends Test {
void show()
{
	super.show();
	System.out.println("main method");
}
	public static void main(String[] args) {
Abc ob=new Abc();
ob.show();
	}

}
