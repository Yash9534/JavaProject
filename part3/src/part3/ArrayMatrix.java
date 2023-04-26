package part3;

public class ArrayMatrix {

	public static void main(String[] args) {
		//int a[][]=new int [3][4];
int a[][]= {{11,22,33,44},{55,66,77,88},{99,12,13,14}};
for(int r=0;r<a.length;r++)
{
	for(int c=0;c<a[r].length;c++)
	{
		System.out.print(a[r][c]+" ");
	}
	System.out.println();
}
	}
}
