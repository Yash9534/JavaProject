
public class AddTwoMatrix {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("read first matrix: ");
	int a[][]=mt.readMat();
	System.out.println("read second matrix: ");
	int b[][]=mt.readMat();
	System.out.println("user enter first matrix: ");
	mt.dispMatrix(a);
	System.out.println("user enter second matrix: ");
	mt.dispMatrix(b);
	int c[][]=mt.addMatrix(a,b);
	if (c==null)
	System.out.println("addition faield ");
	else
	{
		System.out.println("adding Matrix is: ");
		mt.dispMatrix(c);
	}
}
}
