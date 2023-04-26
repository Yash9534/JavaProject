
public class MainArray4
{
public static void main(String[] args)
{
ArrayOperation ao=new ArrayOperation();
int ar[]= {23,45,67,89,54,28};
ar=ao.insertArr(ar,39,2);
for(int i=0; i<ar.length;i++)
{
	System.out.println(ar[i]+" ");
}
}
}
