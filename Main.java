import java.io.*;
import java.util.Scanner;
public class Main {
	String filename;

	public static void main(String[] args) {
		String filename = new Scanner(System.in).nextLine();
		File fb = new File(filename);
		if(fb.exists())
			System.out.println("file exists");
		if(fb.canRead())
			System.out.println("File is readable");
		if(fb.canWrite())
			System.out.println("Writable");
		System.out.println(fb.getName());
		System.out.println(fb.length());
	}

}
