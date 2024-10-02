package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Sasank.txt");
		
		fw.write(1234);
		
		fw.write("good \n evening");
		
		char []ch = {'a','b','c','d'};
		
		fw.write(ch);
		
		
		fw.flush();
		
		fw.close();
		
		System.out.println("data is written into the file successfully");
		
	}
	
	//1.boolean values are not Accepted
	
	//2.It can't read the int values
	
	//3.It's not having new line
}


