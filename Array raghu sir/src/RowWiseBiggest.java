
public class RowWiseBiggest {
	public static void main(String[] args) {
		Matrix mat=new Matrix();
		int [][]ar=mat.readMat();
		System.out.println("user enter matrix: ");
		mat.dispMatrix(ar);
		int big=mat.rowWiseBiggest(ar);
		//for(int i=0;i<mat[0].length; i++)
		{
			System.out.println(" biggest is: "+big);
		}
		}
}

