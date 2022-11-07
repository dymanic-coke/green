package sec02.exam01;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		
		write("문자 변환 스크림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		OutputStream fos = new FileOutputStream("E:/kimheejae/Temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		InputStream fis = new FileInputStream("E:/kimheejae/temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		System.out.println(readCharNum);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
		}
	
	
}
