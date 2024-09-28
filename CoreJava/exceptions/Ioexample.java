package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ioexample {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileReader obj = new FileReader("file.txt");
		
		int x= obj.read();
		
		System.out.println(x);
	}

}
