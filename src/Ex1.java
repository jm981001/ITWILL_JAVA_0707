
public class Ex1 {

	public static void main(String[] args) {
		int num = 4;
		
		String result= (num==0)    ? "0"   :
					   (num%2 ==0) ? "짝수" : "홀수";
		System.out.println(result);
	}

}
