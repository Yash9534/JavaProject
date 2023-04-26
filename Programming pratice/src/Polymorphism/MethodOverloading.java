package Polymorphism;

public class MethodOverloading {
void show(String a,int b)
{
	System.out.println(" First method argument");
}
void show(int a)
{
	System.out.println("Second method argument");
}
	public static void main(String[] args) {
MethodOverloading t=new MethodOverloading();
t.show(10);
	}

}
