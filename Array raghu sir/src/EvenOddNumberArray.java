//import java.util.Scanner;
public class EvenOddNumberArray {
	static void EvenOdd(int arr[],int n)
	{
		int even=0;
		for(int i=0;i<n;i++)
		{
			String x=Integer.toString(arr[i]);
			if (x.length()%2==0)
				even++;
		}
		System.out.println("number of even elements= "+even);
		System.out.println("number of odd elements= "+(n-even));
	}
	public static void main(String[] args) {
		int arr[]= {22,21,87,45,55};
		int n=arr.length;
		EvenOdd(arr,n);
	}
}

