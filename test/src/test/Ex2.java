package test;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3};
try {
System.out.println(a[6]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("out of size");
}
catch(ArithmeticException e)
{
	System.out.println("out of size1");
}
}
}
