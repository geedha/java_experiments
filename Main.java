import java.io.*;
class Billcontents
{
int consumer_no;
String name;
int previous_reading;
int current_reading;
int type_of_connection;
double sum;

Billcontents()
{
consumer_no=0;
name="noname";
previous_reading=0;
current_reading=0;
String name; 
sum=0.00;
}
void getDetails() throws IOException
{
String s_consumer_no;
String s_previous_reading;
String s_current_reading;
String s_type_of_connection;
InputStreamReader insr = new InputStreamReader(System.in);
BufferedReader bfr = new BufferedReader(insr);
System.out.println("Enter the name");
name = bfr.readLine();

System.out.println("Enter '1' if domestic connection");
System.out.println("Enter '2' if commercial connection");
s_type_of_connection = bfr.readLine();
type_of_connection=Integer.parseInt(s_type_of_connection);
System.out.println("Enter the consumer number");
s_consumer_no=bfr.readLine();
consumer_no=Integer.parseInt(s_consumer_no);
System.out.println("Enter the previous month unit number");
s_previous_reading=bfr.readLine();
previous_reading=Integer.parseInt(s_previous_reading);
System.out.println("Enter the current  month unit number");
s_current_reading=bfr.readLine();
current_reading=Integer.parseInt(s_current_reading);

}
void compute_bill()
{
int i;
int ori_unit;

ori_unit=current_reading-previous_reading;
switch(type_of_connection)
{
case 1:
for(i=1;i <= ori_unit;i++)
{
if(i<=100)
{ 
 sum = sum+1.00;

}
else if(i>100 && i<=200)
{

sum=sum+02.50;

}
else if(i>200 && i<=500)
{
	sum=sum+04.00;
  
}
else{
	sum=sum+06.00;
   
}
}
break;
case 2:
for(i=0;i<=ori_unit;i++)
{
if(i<=100)
{
 sum = sum+2;

}
else if(i>100 && i<=200)
{

sum+=4.50;

}
else if(ori_unit>200 && ori_unit<=500)
{
	
	sum+=6;
  
}
else{
	
	sum+=7;
   
}
}
break;
default:
break;
}
}
void displaybill()
{
	System.out.println("amount is"+sum);
	System.out.println("name is"+name);
}
}
class Main
{
	public static void main(String[] args)throws IOException
	{
		Billcontents m = new Billcontents();
		m.getDetails();
		m.compute_bill();
		m.displaybill();
	}
}

