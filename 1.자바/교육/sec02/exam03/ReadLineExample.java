package sec02.exam03;

import java.io.*;
public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		
		String readerPath = "E:/kimheejae/pro01/src/sec02/exam03/language.txt";
		Reader reader = new FileReader(readerPath);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
		
		br.close();
	}

}
