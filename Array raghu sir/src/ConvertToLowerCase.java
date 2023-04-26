import java.util.Scanner;
public class ConvertToLowerCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();//String to char Array
	for(int i=0; i<ch.length;i++)
	{
		if(ch[i]>='A'&&ch[i]<='Z')
			ch[i]=(char)(ch[i]+32);
	}
	st=new String(ch);//char array to String
	System.out.println(st);
}
}
