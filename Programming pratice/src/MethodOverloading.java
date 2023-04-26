
public class MethodOverloading {

	public static void main(String[] args) {
print();
print(50.5f);
print(15.6f,20.5f);
print("Amit",20.5f);
print("HR","Manager");

	}
	public static void print()
	{
		System.out.println("........");
	}
	public static void print(float a)
	{
		System.out.println(a+49.5f);
	}
	public static void print(float a,float b)
	{
		System.out.println(a+b);
	}
	public static void print(String a,float b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void print(String a,String b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}
