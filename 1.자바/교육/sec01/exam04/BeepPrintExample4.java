package sec01.exam04;

public class BeepPrintExample4 {

	public static void main(String[] args) {
		
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("삡");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}

}
