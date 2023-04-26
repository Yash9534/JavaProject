package Array;

public class FindDuplicateElement {

	public static void main(String[] args) {
int []a= {3,5,1,3,1,2};
System.out.print("duplicate value are: ");
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if((a[i]==a[j])&&(i!=j))
		{
			System.out.print(a[j]+", ");
		}
	}
}

	}

}
