
public class MainArray6
{
public static void main(String[] args) 
{
ArrayOperation ao=new ArrayOperation();
int ar[]= {23,45,67,89,54,28};
int big=ao.nthBiggest(ar,3);
System.out.println("3rd biggest: "+big);
big =ao.nthBiggest(ar,4);
System.out.println("4th biggest: "+big);
}
}
