
public class MatrixArr1 {

	public static void main(String[] args) {
	int ar[][]= {{23,45,67},{8,9,7},{11,22,33},{48,67,89}};
	System.out.println(ar.length);
	System.out.println(ar[0].length);
	System.out.println(ar[1].length);
	for(int i=0;i<ar.length; i++)
	{
		for(int j=0; j<ar[i].length; j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}

	}

}
