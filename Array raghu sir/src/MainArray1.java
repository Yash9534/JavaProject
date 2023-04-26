
public class MainArray1 {
	public static void main(String[] args) {
		ArrayOperationEO ao=new ArrayOperationEO();
		int x[]=ao.readArray();
		System.out.println("user enter array: ");
		ao.displayArray(x);
		
		int ct[]=ao.countEO(x);
		System.out.println("number of even number: "+ct[0]);
		System.out.println("number of odd number: "+ct[1]);
	}
}
