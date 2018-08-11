import java.io.*;
class Billcontents
{
int consumer_no;
String consumer_name;
int previous_reading;
int current_reading;
int type_of_connection;
double rupees;
double pri;
Billcontents()
{
consumer_no=0;
consumer_name="noname";
previous_reading=0;
current_reading=0;

}

void getDetails() throws IOException
{
String s_consumer_no;
String s_previous_reading;
String s_current_reading;
String s_type_of_connection;
InputStreamReader insr = new InputStreamReader(System.in);
BufferedReader bfr = new BufferedReader(insr);
System.out.println("ENTER '1' IF DOMESTIC CONNECTION");
System.out.println("ENTER '2' IF COMMERCIAL CONNECTION");
s_type_of_connection=bfr.readLine();
type_of_connection= Integer.parseInt(s_type_of_connection);
System.out.println("ENTER THE CONSUMER NUMBER");
s_consumer_no=bfr.readLine();
consumer_no = Integer.parseInt(s_consumer_no);
System.out.println("ENTER THE PREVIOUS MONTH UNIT");
s_previous_reading=bfr.readLine();
previous_reading= Integer.parseInt(s_previous_reading);
System.out.println("ENTER THE CURRENT MONTH UNIT");
s_current_reading=bfr.readLine();
current_reading= Integer.parseInt(s_current_reading);
}
double slabOne()
{
int correct_reading = current_reading-previous_reading; 
if(correct_reading<=100)
  {
      rupees = correct_reading*1;
      return rupees;
 }
else 
{
 rupees = 100*1;
return rupees;
}


}
 double secondSlab()
{
int correct_reading = current_reading-previous_reading; 
    pri=correct_reading-100;
if(pri>100)
{
    rupees= (100*2.50);
     return rupees;
}
else
{
rupees=pri*2.50;
return rupees;
}
 }
double thirdSlab()
{
int correct_reading = current_reading-previous_reading; 
 pri=correct_reading-200;
if(pri>100)
{
    rupees = (100*4);
     return rupees;
}
else
{
rupees=pri*4;
return rupees;

}
}
double  fourthSlab()
{
int correct_reading = current_reading-previous_reading; 
 pri=correct_reading-300;
if(pri>100)
{
    rupees = (100*6);
    
     return rupees;
}
else
{
  rupees=pri*6;
   return rupees;
}

 }


  }
class Main
{
public static void main(String[] args)throws IOException
{

Billcontents m=new Billcontents();
m.getDetails();
double ans;
switch(m.type_of_connection)
{
case 1: 
  ans=m.slabOne()+m.secondSlab()+m.thirdSlab()+m.fourthSlab();
  System.out.println("answer is"+ans);
 break;
  default:
   break;
   }
}
}


   
    



