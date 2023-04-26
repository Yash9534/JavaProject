import java.util.Scanner;
public class StarPat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1; i<=n; i++)
{
	for(int j=1; j<=n; j++)
	{
		System.out.print("*");
	}
	System.out.println();
}

	}
}