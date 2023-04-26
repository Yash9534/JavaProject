package ExceptionHandling;

public class StringException {

	public static void main(String[] args) {
String s="india";
try
{
	for(int i=0;i<=5;i++)
	{
	System.out.println(s.charAt(i));
}
}
catch(StringIndexOutOfBoundsException e)
{
	System.out.println("Exception occured continue ");
}
System.out.println(s.toUpperCase());
	}

}
