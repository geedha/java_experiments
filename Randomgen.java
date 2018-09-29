import java.util.*;

public class Randomgen extends Thread {
	Random r = new Random();
	int value;
	public void run()
	{
		while(true){
	try{
		Thread.sleep(1000);
		}
	catch(InterruptedException e)
	{
				
	}
	value = r.nextInt(1000);
	System.out.println(value);
	if(value%2==0)
	{
		new Squarethread(value).start();
	}
	else
	{
		new Cubethread(value).start();

	}
	}
			
		
	}

		
	}




