
public class MainArray2 
{
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	System.out.println("Raead first array");
	int x[]=ao.readArray();
	System.out.println("read second array ");
	int y[]=ao.readArray();
	System.out.println("user entered first array: ");
	ao.displayArray(x);
	System.out.println("user entered second array: ");
	ao.displayArray(y);
	int z[]=ao.merge(x,y);
	System.out.println("merged array: ");
	ao.displayArray(z);
}
}