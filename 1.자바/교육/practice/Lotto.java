package practice;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] a = new int[6];
		int temp;
		
		
		for(int i=0; i<a.length; i++) {
			a[i] = random.nextInt(45) + 1;
			//중복 제거
			for(int j=0; j<i; j++) {
				if(a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
