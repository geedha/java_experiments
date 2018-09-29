
public class Operations implements Stackoperations {
	int[] myList = new int[5];
	int top=-1;

	public void push(int ele) {
		top++;
		try{
		myList [top] = ele; 
		System.out.println(ele+" pushed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is full ..... perform pop operation");
			top--;
		}
		
		
	}

	public void pop() {
		try{
			System.out.println("Element poped out is  "+myList[top]);
			top--;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array is empty ..... perform push operation");
			top++;

		}
		
	}

	public void display() {
		for(int i=top;i>=0;i--)
		{
			System.out.println(myList[i]);
		}
		
	}

	
	public void top() {
		System.out.println(top);
		System.out.println("Top element is"+myList[top]);
		
	}
	

}
