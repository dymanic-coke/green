package pro01;

public class Index2 {

	public static void main(String[] args) {
		

		int[][] data = new int[3][4];
		
		for(int i=0; i<data.length; i++) {
			for(int z=0; z<data[i].length; z++)
				System.out.printf( data[i][z] + "%3d |");
		System.out.println();
		}
	}

}
