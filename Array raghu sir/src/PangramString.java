import java.util.Scanner;
public class PangramString 
{
public static void main(String[] args) 
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the String");
  String st=sc.nextLine();
  int n=st.length();
  int freq[]=new int[n];
  for(int i=0; i<n;i++);
  {
	  int i = 0;
	freq[i]=0;
  }
  for(int i=0;i<n; i++)
  {
	  if(st.charAt(i)!=' ')
	  {
		  freq[st.charAt(i)-'a']++;
	  }
  }
  int temp=0;
  for(int i=0;i<26;i++)
  {
	  if(freq[i]==0)
	  {
		  temp=1;
		  break;
	  }
  }
  if(temp==1)
  {
	  System.out.println("the string is not a pangram string ");
  }
  else
  {
	  System.out.println("the string is a pangram string ");
  }
}
}
