
public class MatrixArray4Sum {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	int[][] ar=mt.readMat();
	System.out.println("user entered matrix: ");
	mt.dispMatrix(ar);
	int sm=mt.sumOfMatrix(ar);
	System.out.println("Sum of matrix is: "+sm);
}
}

