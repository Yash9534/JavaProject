
public class StringException {
public static void main(String[] args) {
	String s="India";
	try
	{
	for(int i=0;i<=s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("Exception occured continue");
	}
	System.out.println(s.toUpperCase());
}
}
