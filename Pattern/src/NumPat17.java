import java.util.Scanner;
public class NumPat17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=n; i>=1; i--)
{
	for(int j=i; j<=n; j++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}

	}
}
