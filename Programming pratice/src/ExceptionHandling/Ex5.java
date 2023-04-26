package ExceptionHandling;

public class Ex5 {
	public static void main(String[] args) {
		System.out.println("starts");
int a=5;
int b=0;
try
{
System.out.println(a/b);
}
catch(ArithmeticException e)
{
	e.printStackTrace();
}
System.out.println("end");
	}
}
