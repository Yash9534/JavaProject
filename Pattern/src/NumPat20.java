import java.util.Scanner;
public class NumPat20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for (int i=n;i>=1; i--)
{
	for(int j=1;j<=n-i;j++)
	{
		System.out.print("  ");
	}
	for(int j=i;j>=1;j++)
	{
		System.out.print(j+" ");
	}
	System.out.println();
}
}
}