import java.util.Scanner;
public class NumPat19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for (int i=1;i<=n; i++)
{
	for(int j=1;j<i;j++)
	{
		System.out.print("  ");
	}
	for(int j=i;j<=n;j++)
	{
		System.out.print(j+" ");
	}
	System.out.println();
}
}
}

