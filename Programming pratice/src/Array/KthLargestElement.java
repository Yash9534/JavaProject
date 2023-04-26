package Array;

public class KthLargestElement {

	public static void main(String[] args) {
int []a= {5,6,8,3,2,1,7,20,31,52,9};
int k=5;
for(int i=0;i<a.length-1;i++)
{
	for(int j=i+1; j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	if(i==k-1)
	{
		System.out.println(k+" Smallest element is "+a[i]);
	    break;
	}
}
System.out.println("-------------------------------------");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
	}

}
