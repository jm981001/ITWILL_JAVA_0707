package if_;

public class Test1 {

	public static void main(String[] args) {
		
		int num=-42;
		
		if (num < 0) {
			num = -num;
		}
		System.out.println("변수 num =" + num);
		
		
		System.out.println("======================");
		
		
		//문자 ch가 대문자일때 소문자로 변환하여 출력
		//char는 정수형 대문자 +32 -> 소문자 됨
		
		char ch = 'D';
		
		if ('A'<=ch && ch<='Z' ) {
		   //ch=(char)(ch+32); 아래와 같음
			 ch+=32; //+=는 형변환이 필요가 없다
		}
		System.out.println(ch);
		
		
		System.out.println("======================");
		
		
// 삼항연산자 이용		
//		ch = ('A'<=ch && ch<='Z' ) ? (char)(ch+32) : ch;
//		ch = ('A'<=ch && ch<='Z' ) ? ch += 32 : ch;
//		ch += ('A'<=ch && ch<='Z' ) ? 32 : 0;
	}

}
