import java.util.Scanner;
public class StarPat4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for (int i=1;i<=n; i++)
{
	for(int j=i;j<=n-1;j++)
	{
		System.out.print("  ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}
}
}