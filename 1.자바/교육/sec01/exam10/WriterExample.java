package sec01.exam10;

import java.io.*;
public class WriterExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("E:/kimheejae/Temp/test10.txt");
		
		String str1 = "ABC\n\tDEF";
		
		writer.write(str1);
		
		writer.flush();
		writer.close();
		
	}

}
