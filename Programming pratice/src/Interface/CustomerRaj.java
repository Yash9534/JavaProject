package Interface;

public interface CustomerRaj {
int amt=10;
public abstract void purchase();
}
class sellerSanju implements CustomerRaj
{

	public void purchase()
	{
		System.out.println("Raj needs "+amt+" kg rice");
	}
}
