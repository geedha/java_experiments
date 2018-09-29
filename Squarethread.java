
public class Squarethread extends Thread {
	int square;
	int num;
	Squarethread(int num)
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
		square=num*num;
		System.out.println("squareno of"+num+"is"+square);
		

}
}
