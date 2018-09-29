import java.util.ArrayList;


public class Stringlist {
	ArrayList<String>aList;
	public Stringlist(){
		aList = new ArrayList<String>();
	}
	void append(String data)
	{
		aList.add(data);
	}
	void display(){
		for(String le : aList)
		{
			System.out.println(le);
		}
	}
	void Insertatpos(int pos,String data)
	{
		aList.add(pos,data);
	}
	void Searchstring(String data)
	{
		boolean ans=false;
		for(String temp:aList)
		{
			if(temp.equalsIgnoreCase(data)){
				ans = true;
				break;
			}
			
		}
		if(ans)
		{
			System.out.println("ele found");
		}
		else
		{
			System.out.println("ele not found");
		}
		
	}
	void Findele(char da)
	{
		for(String ast:aList)
		{
			char ch1 = ast.charAt(0);
			if(ch1==da)
			{
				System.out.println(ast);
			}
		}
	}
	
		
}
