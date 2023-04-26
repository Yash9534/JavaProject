import java.util.Scanner;
public class NumPat26 {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for(int i=1;i<=n; i++)
{
	for(int j=1; j<=n-i; j++)
	{
		System.out.print("  ");
	}
	for(int j=i; j<=3*i-2; j++)
	{
		System.out.print(j%2+" ");
	}
	System.out.println();
}
}
}
