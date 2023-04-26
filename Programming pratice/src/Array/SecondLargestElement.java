package Array;

public class SecondLargestElement {

	public static void main(String[] args) {
int []a= {6,5,23,10,50,8,9};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
System.out.println("second largest element "+a[1]);
}
	}


