package ExceptionHandling;

public class Exception {
	public static void main(String[] args) {
		String str="ankur";
		try {
		System.out.println(str.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("null can't be casted");
		}
		 }
}
