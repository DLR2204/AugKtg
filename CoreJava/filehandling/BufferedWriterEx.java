package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Sasank.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(1243);
		
		bw.newLine();
		
		bw.write("good /n evening");
		
		bw.newLine();
		
		char []ch = {'a','b','c','d'};
		
		bw.write(ch);
		
		bw.flush();
		
		bw.close();
		
		System.out.println("Data is written successfully");
		
		
		//1.boolean values are not Accepted
		
		//2.It can't read the int values
		

		
		
	}

}
