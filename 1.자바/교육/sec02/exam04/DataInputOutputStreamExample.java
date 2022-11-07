package sec02.exam04;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("E:/kimheejae/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.6);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		InputStream is = new FileInputStream("E:/kimheejae/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(is);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
	}

}
