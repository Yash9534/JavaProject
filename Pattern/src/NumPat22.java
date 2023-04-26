import java.util.Scanner;
public class NumPat22 {
public static void main(String[]args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n; i++)
{
	for(int j=1; j<=i; j++) {
		System.out.print(i%2+" ");
	}
	System.out.println();
}
}
}
