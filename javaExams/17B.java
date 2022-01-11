import java.io.*;
class Demo {
  
	void display()
    {
        System.out.println("Hello");
        
    }
}

public class Two{
	public static void main(String[] args)
    {
		Demo D1 = null;
		
		try
        {
			D1.display();
		}
		catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
        
	}
}
