
public class MainArray5 
{
public static void main(String[] args) 
{
ArrayOperation ao=new ArrayOperation();
int ar[]= {23,45,67,89,54,28};
ar=ao.deleteArr(ar,2);
for(int i=0;i<ar.length; i++)
{
	System.out.println(ar[i]+" ");//23 45 89 54 28
}
}
}
