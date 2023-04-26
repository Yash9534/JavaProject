
public class ArrayMatrix {

	public static void main(String[] args) {
		int a[][]= {{11,22,33,44},{55,66,77,88,},{99,10,11,12}};
	for(int r=0;r<a.length; r++)
	{
		for(int c=0;c<a[r].length; c++)
		{
			System.out.print(a[r][c]+" ");
		}
		System.out.println();
	}

	}

}
