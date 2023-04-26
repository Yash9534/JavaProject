package DEMO;

public class StringEx2 {

	public static void main(String[] args) {
String s="Bengaluru";
int l=s.length();
System.out.println("length of the given string is "+l);//9
System.out.println("converting string is "+s.toUpperCase());//BENGALURU
System.out.println(s.equals("Bangalore"));//false
String t="Karnataka";
System.out.println(s.equals("t"));//false
System.out.println(s==t);//false
int l2=t.length();
System.out.println(l2);//9
char c=t.charAt(4);
System.out.println("character of index 4 is "+c);//a
int i=t.indexOf('a');
System.out.println("index of a is "+i);//1
int j=t.indexOf('p');
System.out.println("index of p is "+j);//-1
System.out.println(t.equalsIgnoreCase("KARNATAKA"));//true
String s1="India";
System.out.println(s1.equalsIgnoreCase("India"));//true
System.out.println(s.equalsIgnoreCase("Delhi"));//false
//System.out.println(t.charAt(12));//false
System.out.println("hello");//hello
System.out.println(t.substring(3));//nataka
System.out.println(t.substring(3,7));//nata
System.out.println(t.substring(0,3));//kar
	}

}
