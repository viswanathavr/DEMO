class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		
		System.out.println("in A int");
	}
	public void show()
	{
		System.out.println("in A");
	}
	
}

class B extends A
{
	public B()
	{
		super(5);
		System.out.println("in B");
	}
	public B(int i)
	{
		
		System.out.println("in B int");
	}
	public void show()
	{
		super.show();
		System.out.println("in B");
	}
	}
public class class1
{

	public static void main(String[] args)
	{
	  B obj = new B();
	  obj.show();
	  
	}

}
