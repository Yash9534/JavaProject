import java.util.Arrays;

public class MainArray7 {

	public static void main(String[] args)
	{
	 ArrayOperation ao=new ArrayOperation();
	 int ar[]= {23,45,67,89,54,28};
	 System.out.println("before sort: ");
	 System.out.println(Arrays.toString(ar));
	 Arrays.sort(ar);
	 System.out.println("after sort: ");
	 System.out.println(Arrays.toString(ar));
	 int br[]=Arrays.copyOf(ar, ar.length);
	 System.out.println(Arrays.toString(br));

	}
}
