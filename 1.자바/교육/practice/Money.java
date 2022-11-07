package practice;

public class Money {

	public static void main(String[] args) {
		
		int money = 65430;
		
		int moneyKindOf[] = {10000,5000,1000,500,100,50,10};
		int sm;
		int a = 0;
		
		while(true) {
			for(int i=0; i<moneyKindOf.length; i++) {
				a = money/moneyKindOf[i];
				sm = a*moneyKindOf[i];
				money -= sm;
				System.out.println("지폐 " + moneyKindOf[i] + "원의 갯수: " + a );
				
			}
			break;
		}
	}

}
