package Array;

import java.util.HashSet;

public class CommonElement3 {

	public static void main(String[] args) {
int [] arr1={4,5,3,9,4};
int [] arr2={5,6,3,4,7};

HashSet<Integer> hs1=new HashSet<>();
HashSet<Integer> hs2=new HashSet<>();

for(int no:arr1)
{
	hs1.add(no);
}
for(int no:arr2)
{
	hs2.add(no);
}
for(int no:hs2)
{
	boolean b=hs1.add(no);
	if(b==false)
	{
		System.out.println(no);
	}
}
	}

}
