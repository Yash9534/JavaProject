
public class ColumnWiseSum {
	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int [][]ar=mt.readMat();
		System.out.println("user enter matrix: ");
		mt.dispMatrix(ar);
		int sm[]=mt.columnWiseSum(ar);
		for(int j=0;j<sm.length; j++)
		{
			System.out.println(j+1+" column sum is: "+sm[j]);
		}
		}
}
