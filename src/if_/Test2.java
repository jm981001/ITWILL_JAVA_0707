package if_;

public class Test2 {

	public static void main(String[] args) {
		//정수형 변수 num에 대한 양수, 음수 판별 (0은 양수로 간주)
		//양수라면 "num : 양수!" 라고 출력
		//음수라면 "num : 음수!" 라고 출력
		
		
/*강사님 //if-else문
 		int num = -34;
		String result = num +  ":" ;
		
		if(num>=0) {
			result += "양수!";
		}else {
			result += "음수!";
		}
		System.out.println(result);
*/		
		
/*내꺼
 		int num = -34;
		if(num>=0) {
			System.out.println(num + ": 양수!");
		}else {
			System.out.println(num + ": 음수!");
		}
*/
		
/*삼항연산자
		int num = -34;
		String result = (num >= 0)? " : 양수!" : " : 음수!";
		System.out.println(num + result);
*/
		
		char ch = 'Y';

/*//if else
		if ('A'<=ch && ch<='Z' ) {
			ch+=32; 
		  //ch=(char)(ch+32);
		}else if('a'<=ch && ch<='z') {
			ch-=32;
		}
		System.out.println("ch = "+ ch);
*/		
//삼항연산자		 
		ch = ('A'<=ch && ch<='Z' ) ? (char)(ch + 32) : (char)(ch - 32);
		System.out.println("ch = "+ ch);
		ch+= ('A' <= ch && ch <= 'Z') ? 32 : -32;
		System.out.println("ch = "+ ch);
		
		
		
		
		
	}

}
