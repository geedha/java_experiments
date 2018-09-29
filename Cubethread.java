
public class Cubethread extends Thread {
	int square;
	int num;
	Cubethread(int num)
	{
		this.num=num;
	}
	
	public void run(){
		try{
	
		Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
		
	}
		square=num*num*num;
		System.out.println("cubeno of"+num+"is"+square);
		

}
}
