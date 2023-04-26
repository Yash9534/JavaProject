package DEMO;

public class MethodOverloading {

	public static void main(String[] args) {
add();
add(60);
add(50,25);
add(70,90,10);
add(20,30,40,50);
	}
	public static void add()
	{
		System.out.println("add method with no argument");
		System.out.println(" ");
	}
	public static void add(int a) {
		System.out.println("add method one argument");
		System.out.println(a+40);
	}
	public static void add(int a,int b)
	{
		System.out.println("add method two argument ");
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("add method three argument");
		System.out.println(a+b+c);
	}
	public static void add(int a,int b,int c,int d)
	{
		System.out.println("add method with four argument");
		System.out.println(a+b+c+d);
	}
	

}
