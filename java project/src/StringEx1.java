
public class StringEx1 {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
String s="Bengaluru";
int l=s.length();
System.out.println("length of given literal is "+l);
System.out.println("Convert String literal is "+s.toUpperCase());
System.out.println(s.equals("Bangalore"));	
	String t="karnataka";
	System.out.println(s.equals(t));
	System.out.println(s==t);
	int l2=t.length();
	char c=t.charAt(4);
	System.out.println("character at index 4 is "+c);
	int i=t.indexOf('a');
	int j=t.indexOf('p');
	System.out.println("index of p is"+j);
	System.out.println(t.equalsIgnoreCase("KARNATAKA"));
String s1="India";
System.out.println(s1.equalsIgnoreCase("India"));
System.out.println(s1.equalsIgnoreCase("Delhi"));
//System.out.println(t.charAt(12));
//System.out.println("hello");
System.out.println(t.substring(3));
System.out.println(t.substring(3,7));
System.out.println(t.substring(0,3));	

	}

}
