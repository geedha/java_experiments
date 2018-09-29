import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Employee {
	String emp_name;
	String emp_id;
	String address;
	String mail_id;
	long mobileno;
	int basicpay;
	double da;
	double hra;
	double pf;
	double clubfund;
	double grosssal;
	double netsal;
	Employee(int basicpay)
	{
		this.basicpay = basicpay;
	}
	public void generatepayslip(int basicpay)
	{
		da=(basicpay/100)*97;
		hra=(basicpay/100)*10;
		pf=(basicpay/100)*12;
		clubfund=(basicpay/100)*0.1;
		grosssal=da+hra+pf+clubfund;
		netsal=grosssal-(pf+clubfund);
		System.out.println("Your Gross sal is"+grosssal);
		
	}
	public void get_details()throws IOException
	{
		InputStreamReader insr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(insr);
		emp_name=bfr.readLine();
		emp_id=bfr.readLine();
		address =bfr.readLine();

	}
}

