
import java.util.Scanner;
public class NumPat4 {
	public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
int n=s.nextInt();
for(int i=0; i<=n; i++)
{
	for(int j=0; j<=n; j++)
	{
		System.out.print((char)(i+64)+" ");
	}
	System.out.println();
}

	}
}