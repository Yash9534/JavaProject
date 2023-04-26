import java.util.Scanner;
public class NumPat25{
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for(int i=1;i<=n; i++)
{
	for(int j=1; j<=n-i; j++) {
		System.out.print("  ");
	}
	for(int j=1; j<=2*i-1; j++)
	{
		System.out.print(j%2+" ");
	}
	System.out.println();
}
}
}
