package practice;

public class Runtime {

	public static void main(String[] args) {
		
		String[] week = {"월","화","수", "목", "금", "토", "일"};
		int [] runtime = {42, 66, 67, 54, 88, 64, 71};
		
		int sum = 0;
		
		for(int i=0; i<week.length; i++) {
			System.out.println(week[i] + "요일의 달린 시간은 " + runtime[i] + "분 입니다.");	
		} 
		for(int i=0; i<week.length; i++) {
			sum += runtime[i];
		}
		System.out.println("달린 총합 : " + sum + "분");
		System.out.println("달린 평균 : " + sum/runtime.length + "분");
		
	}

}
