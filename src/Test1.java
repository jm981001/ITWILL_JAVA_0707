
public class Test1 {

	public static void main(String[] args) {

		//문자 ch에 대해 "대문자" , "소문자" 판별 , 그 나머지는 기타문자
		
		char cj = 's';
	
		String str=(('A'<=cj) && (cj<='Z')) ? "대문자" :
			   		('a'<=cj  && cj <='z')  ? "소문자" : "기타문자";
		
		System.out.println(str);
		
		System.out.println("==============================");
		
		//뷔페 요금 계산 기본요금 (price) 30000원이다
		//손님의 나이(age) 1~100 초기화
		//뷔페 할인 조건 age가 5세 이하일 경우 70% 할인된 요금으로 계산
	    //65세 이상일 경우 50% 확인 나머지는 할인 없어요
		// 최종적 뷔페 요금(result)출력
		
		//= 1<=age && 100>=age
		int age =67;
		int price = 30000;
		
		int result =  age<=5 ? (int)(price * 0.3) :
			          age>=65? (int)(price * 0.5) : price;
		System.out.println(result);
	}
}
