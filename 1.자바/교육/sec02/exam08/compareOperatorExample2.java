package sec02.exam08;

public class compareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //v2는 double로 자동 형변환
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //v5의 정확도 이슈로 false 도출
		System.out.println((float)v4 == v5); //양 피연산자간에 정확도를 맞추기 위하여 v4 float형으로 형변환
		System.out.println((int)(v4*100) == (int)(v5*100)); // 위와 같은 이유이나 int로 형변환을 위하여 100을 곱함
		
	}

}
