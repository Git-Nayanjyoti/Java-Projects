package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "./src/filehandling/data";
		FileReader reader = new FileReader(filePath);
		//System.out.println((char)reader.read());
		int i=0;
		while ((i = reader.read()) != -1) {
			System.out.print((char)i);
		}
		
		reader.close();
		
		FileWriter writer =  new FileWriter(filePath);
		writer.write("HelloWorld");
		System.out.println("Finished Writing");
		writer.close();
		
	}
}
