package Polymorphism;

public class Xyz extends MethodOverriding {
	void show()
	{
		System.out.println("child class method");
}
	public static void main(String[] args) {
		MethodOverriding mo=new MethodOverriding();
		//mo.show();
		Xyz ch=new Xyz();
		ch.show();
	}
	}


