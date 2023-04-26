import java.util.Scanner;
public class SentensePresentInWord 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String st=sc.nextLine();
	int ct=countwords(st);
	System.out.println("number of words: "+ct);
	}
	static int countwords(String st)
	{
		char ch[]=st.toCharArray();
		int wc=0;
		for(int i=0; i<ch.length;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				wc++;
		}
				return wc;
}

}
