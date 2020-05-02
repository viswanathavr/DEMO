interface x
{
	void show();	
}

class y implements x
{
	public void show()
	{
		
		System.out.println("in y");
	}
}
class z implements x
{
	public void show()
	{
		
		System.out.println("in z");
	}
}
public class DISKANAKA
{

	public static void main(String[] args)
	{
		
		x obj = new y();
		x obj1 = new z();
		obj.show();
		obj1.show();

	}

}
