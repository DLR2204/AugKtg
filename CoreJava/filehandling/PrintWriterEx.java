package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Sasank.txt");
		
		pw.println(1234);
		
		pw.println(true);
		
		pw.println("good \n morning");
		
		char []ch = {'a','b','c','d'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("Data is written into the file successfully");
		
		
		
	}
}
