package pro01;

public class Index {

	public static void main(String[] args) {
		
		String[][] data = new String[3][4];
		data[0][0] = "1반 1번";
		data[0][1] = "1반 2번";
		data[0][2] = "1반 3번";
		data[0][3] = "1반 4번";
		data[1][0] = "2반 1번";
		data[1][1] = "2반 2번";
		data[1][2] = "2반 3번";
		data[1][3] = "2반 4번";
		data[2][0] = "3반 1번";
		data[2][1] = "3반 2번";
		data[2][2] = "3반 3번";
		data[2][3] = "3반 4번";
		
		System.out.println(data[0][2]);
	}

}
