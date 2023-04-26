package Array;

public class BubbleSort {

	public static void main(String[] args) {
int a[]= {39,25,12,5,8};
int temp;
for(int i=0;i<a.length;i++)  //number of count
{
	int flag=0;
	for(int j=0;j<a.length-1-i;j++)  //element compare and swape the element
	{
		if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			flag=1;
		}
	}
	if(flag==0)
	{
		 break;
	}
}
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
	}

}
