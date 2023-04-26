import java.util.Scanner;
public class CountDigits 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String s=sc.nextLine();
	int vo=0,co=0,d=0,sd=0,sp=0;
	for (int i=0;i<s.length(); i++)
	{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			vo++;
		else if(ch>='a'&&ch<='z')
			co++;
		else if(ch>='0'&&ch<='9')
			d++;
		else if(ch>=' ')
			sp++;
		else
			sd++;
	}
	System.out.println("vowels are: "+vo);
	System.out.println("Consonents are: "+co);
	System.out.println("Space are: "+sp);
	System.out.println("Speical character are: "+sd);
	System.out.println("Digits are: "+d);
	
}
}
