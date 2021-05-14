package lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileProgram {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("file1");
		
		if (f.createNewFile()) {
	        System.out.println("File created: " + f.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
		FileWriter fw=new FileWriter(f);  
		fw.write("Hello! How are you?");    
		fw.close(); 
		File f2 = new File("File2");
		CopyDataThread obj = new CopyDataThread(f,f2);
		 
}
}
