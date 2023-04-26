package Array;

import java.util.HashSet;

public class CommonElement {

	public static void main(String[] args) {
int [] arr1= {4,5,3,2,4};
int [] arr2= {8,5,9,7,4,3};

HashSet<Integer>hs=new HashSet<>();
for(int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr2.length;j++)
	{
		if(arr1[i]==arr2[j])
		{
           hs.add(arr1[i]);
           break;
		}
	}
}
for(int no:hs)
{
	System.out.print(no+" ");
}
	}

}
