import java.util.Scanner;


public class Customer  {

	String Name;
	int Accountno;
	double balance;
	public Customer()
	{
		this.balance=9000;
	}
	void credit(double amount)
	{
		try{
			if(amount<0.0)
			{
				throw new Invalidcredit();
			}
			else
			{
				balance=balance+amount;
				System.out.println(balance);
				
			}
		}
		catch(Invalidcredit e)
		{
			Scanner input = new Scanner(System.in);
			amount=input.nextDouble();
			credit(amount);
			System.out.println("Exception handled");
		}
		
	}
}
