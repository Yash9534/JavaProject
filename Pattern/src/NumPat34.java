import java.util.Scanner;
public class NumPat34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
for(int i=n;i<=1;i--)
{
	for(int j=1;j<=n-1;j++)
	{
		System.out.print("  ");
	}
	int x=1;
	for(int j=1; j<=2*i-1; j++)
	{
		System.out.print(x+" ");
		if(j<i)
			x++;
		else
			x--;
	}
	System.out.println();
}
}
}