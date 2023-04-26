package ExceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("starts main method");
int  a,b,c;
a=10;
b=0;
try
{
	c=a/b;	
}
catch(ArithmeticException e)
{
System.out.println("Can't divide by zero"); 
	}
System.out.println("endes main method");
}
}
