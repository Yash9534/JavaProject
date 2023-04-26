package Array;

public class MerjTwoArray {

	public static void main(String[] args) {
int [] a= {1,5,9,6};
int [] b= {8,5,7,6,2};
int a_leng=a.length;
int b_leng =b.length;
int c_leng=a_leng+b_leng;
int [] c=new int[c_leng];
for(int i=0;i<a.length;i++)
{
	c[i]=a[i];
}
for(int i=0;i<b.length;i++)
{
	c[a.length+i]=b[i];
}
for(int i=0;i<c.length;i++)
{
	System.out.print(c[i]+" ");
}
	}

}
