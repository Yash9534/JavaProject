import java.util.Scanner;

public class Matrix {
int getBiggest(int[][] mat)
{
	int big=mat[0][0];
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0;j<mat[i].length; j++)
		{
			if(mat[i][j]>big)
				big=mat[i][j];
			
		}
	}
	return big;
}

public int sumOfMatrix(int[][] mat) {
	int sum=0;
	for(int i=0;i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
			sum=sum+mat[i][j];
		}
	}
	return sum;
}

public int[][] readMat() {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the order of element: ");
  int row=sc.nextInt();
  int col=sc.nextInt();
  int [][]mat=new int [row][col];
  System.out.println("enter "+row*col+" element row wise");
  for(int i=0;i<mat.length; i++)
  {
	  for (int j=0; j<mat[i].length; j++)
	  {
		  mat[i][j]=sc.nextInt();
	  }
  }
	return mat;
}

public void dispMatrix(int[][] mat) {
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			System.out.print(mat[i][j]+" ");
			
		}
		System.out.println();
	}	
}
int [] columnWiseBiggest(int[][] mat)
{
	int big[]=new int[mat[0].length];
	for(int i=0;i<mat[0].length;i++)
	{
		int max=mat[0][i];
		for(int j=1;j<mat.length; j++)
		{
			if(mat[j][i]>max);
		}
		big[i]=max;
	}
	return big;
}

public int[][] addMatrix(int[][] x, int[][] y) 
{
	if(x.length!=y.length||x[0].length!=y[0].length)
	{
		System.out.println("order must be same ");
		return null;
	}
	int [][] z=new int [x.length][x[0].length];
	for(int i=0;i<z.length;i++)
	{
		for(int j=0;j<z[i].length; j++)
		{
			z[i][j]=x[i][j]+y[i][j];
		}
	}
	return z;
}

public int[] rowWiseSum(int mat [][]) {
	int sum[]=new int[mat.length];
	for(int i=0;i<mat.length; i++)
	{
		for(int j=0;j<mat[i].length; j++)
		{
			sum[i]=sum[i]+mat[i][j];
		}
	}
	return sum;
}

public int[] columnWiseSum(int[][] mat) 
{
	int sum[]=new int[mat[0].length];
	for(int i=0;i<mat[0].length; i++)
	{
		for (int j=0;j<mat.length; j++)
		{
			sum[i]=sum[i]+mat[j][i];
		}
	}
	return sum;

}

public int rowWiseBiggest(int[][] mat) 
{
int big[]=new int[mat.length];
for(int i=0;i<mat.length; i++)
{
	int max=mat[i][0];
	for(int j=1; j<mat[i].length; j++)
	{
		if(mat[i][j]>max)
			max=mat[i][j];
	}
	big[i]=max;
}
return 0;

}
}




