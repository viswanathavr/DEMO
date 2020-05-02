class hi extends Thread
{
	 public void run()
	 {
		for(int i=0;i<5;i++)
			{
			System.out.print("HI ");
			try{Thread.sleep(500);} catch(Exception e) {System.out.println("myre");}
			}
	 }
}
class hello extends Thread
{
	 public void run()
	 {
		 
		for(int i=0;i<5;i++)
			{
			System.out.print("HELLO ");
			try{Thread.sleep(500);} catch(Exception e) {System.out.println("myre");}
			}
	 }
}
public class thrd {

	public static void main(String[] args) throws Exception
	{
		hi obj1 = new hi();
		hello obj2 = new hello();
		obj1.start();
		obj2.start();
		
		obj1.join();
		obj2.join();
		
		obj1.setName("HI thread"); 
		System.out.println(obj1.getName());
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		
		
		

	}

}
