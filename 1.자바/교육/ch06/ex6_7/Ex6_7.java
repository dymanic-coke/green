package ch06.ex6_7;

public class Ex6_7 {

	public static void main(String[] args) {
		String str = "programming is fun! Right?";
		char[] charArr = str.toCharArray();
		int count=0;
		
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i] == 'M' || charArr[i] == 'm') {
				count++;
			}
		}
		
		System.out.println(str);
		System.out.printf("=> M(m)의 개수: %d", count);
	}

}
