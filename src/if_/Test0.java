package if_;

public class Test0 {

	public static void main(String[] args) {
	// 홀수 + 홀수 = 짝수 //홀수 + 짝수 = 홀수 이런식이 나오도록 구현하라
		int n1 = 8;
		int n2 = 7;
	
		String r = (n1%2 == 0) ? "짝수 + " : "홀수 + " ; //r에 n1이 짝수 또는 홀수 라고 저장
		r += (n2%2 == 0)? "짝수 =" : "홀수 = " ; // (짝수+/홀수+)라고 찍혀있는 r에 (짝수=/홀수=) 를 저장
		r += ((n1+n2)%2 == 0)? "짝수" : "홀수" ; // 결과값으로 짝수인지 홀수인지 출력

		
		System.out.println(r);
	}
}
