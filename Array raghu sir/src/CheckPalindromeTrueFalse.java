import java.util.Scanner;
public class CheckPalindromeTrueFalse
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the string");
	 String st=sc.nextLine();
	 boolean rs=isPalindrome(st);
	 if(rs==true)
		 System.out.println(st+" is a palindrome");
	 else
		 System.out.println(st+" is not a palindrome");
	}
	static boolean isPalindrome(String st)
	{
	char ch[]=st.toCharArray();
	int i=0,j=ch.length-1;
	while(i<j)
	{
		if (ch[i]!=ch[j])
			return false;
		i++;
		j--;
	}
		return true;
	}
}