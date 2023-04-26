
public class RowWiseSum {

	public static void main(String[] args) {
	Matrix mt=new Matrix();
	int [][]ar=mt.readMat();
	System.out.println("user enter matrix: ");
	mt.dispMatrix(ar);
	int sm[]=mt.rowWiseSum(ar);
	for(int i=0;i<sm.length; i++)
	{
		System.out.println(i+1+" row sum is: "+sm[i]);
	}
	}
}


