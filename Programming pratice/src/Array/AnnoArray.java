package Array;

public class AnnoArray {

	public static void main(String[] args) {
AnnoArray.sum(new int [][]{{10,20,30},{60,70}});
	}
	 static void sum(int[][] no)
	{
		int total=0;
		for(int ii[]:no)
		{
			for(int i:ii)
		
		{
			total=total+i;
		}
		System.out.println("Sum is "+total);
	}
	}
}
