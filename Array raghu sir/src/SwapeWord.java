
public class SwapeWord {
public static void main(String[] args) 
{
String st1="Good",st2="Friends";
System.out.println("String before swapping: "+st1+" "+st2);
st1=st1+st2;
st2=st1.substring(0,(st1.length()-st2.length()));
st1=st1.substring(st2.length());
System.out.println("String after swapping: "+st1+" "+st2);
}
}
