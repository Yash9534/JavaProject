package Array;

import java.util.HashSet;

public class CommonElement2 {

	public static void main(String[] args) {
		int [] arr1= {4,3,1,2,5};
		int [] arr2= {6,7,8,9,0};

		HashSet<Integer> hs=new HashSet<>();
		for(int no:arr1)
		{
			hs.add(no);
		}
		for(int no:arr2)
		{
			boolean b=hs.add(no);
			if(b==false)
			{
				System.out.println(no);
			}
		}
	}

}
