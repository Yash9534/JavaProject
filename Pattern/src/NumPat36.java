import java.util.Scanner;
public class NumPat36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int st=n,sp=0;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++)
	{
		System.out.print("  ");
	}
	for(int j=1; j<=st; j++)
	{
		System.out.print("* ");
	}	
	if(i<=n/2)
		{
			sp++;
		st=st-2;
	}
		else
		{
	   sp--;
	   st=st+2;
	}
	System.out.println();
}
}
	}