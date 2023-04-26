
public class MainArray {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int x[]=ao.readArray();
	System.out.println("user enter array: ");
	ao.displayArray(x);
	int pc=ao.countPrime(x);
	System.out.println("number of prime number in the Array: "+pc);
}
}
