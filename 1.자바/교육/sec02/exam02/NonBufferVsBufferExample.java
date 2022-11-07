package sec02.exam02;

import java.io.*;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		String ofp1 = "E:/kimheejae/pro01/src/sec02/exam02/owl.jpg";
		String tfp1 = "E:/kimheejae/pro01/src/sec02/exam02/targetfile1.jpg";
		InputStream fis1 = new FileInputStream(ofp1);
		OutputStream fos1 = new FileOutputStream(tfp1);
		
		String ofp2 = "E:/kimheejae/pro01/src/sec02/exam02/owl2.jpg";
		String tfp2 = "E:/kimheejae//pro01/src/sec02/exam02/targetfile2.jpg";
		InputStream fis2 = new FileInputStream(ofp2);
		OutputStream fos2 = new FileOutputStream(tfp2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis1, fos1);
		System.out.println("버퍼 안쓰면: " + nonBufferTime + "ns");
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 쓰면: " + bufferTime + "ns");
		
		fis1.close();
		fos1.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}
	
	
	

}
