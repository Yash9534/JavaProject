
public class MatrixColWiseBIgg {
	public static void main(String[] args) {
		Matrix mt=new Matrix();
		int[][] ar=mt.readMat();
		System.out.println("user entered matrix: ");
		mt.dispMatrix(ar);
		int big[]=mt.columnWiseBiggest(ar);
		System.out.println("biggest is: "+big);
	}
}
