package practice;

public class TestVariables {

	public static void main(String[] args) {
		double a = 10;
		double b = 5;
		String s = "apple";
		double c = 0;
		int iVar1 = 0;
		int iVar2 = 0;

		//System.out.println(a + b + s);
		
		//두 변수 a와 b 를 합산하는 메소드 sum() 을 이용하여 출력하세요.
		System.out.println( sum(a,b));
		System.out.println( sum(iVar1,b));
		
		
		//두 변수a 와 b 를 나눗셈 (a / b)결과를 출력하세요.
		
		System.out.println( a/b);
		System.out.println((double) b/a);
	}
	// 두 변수 a와 b를 합산하여 리턴하는 메소
	 static int sum(int c, int d) {
		double sum = 0;
		sum = c + d;
		return (int) sum;
	}
	 static double sum(double c, double d) {
		 double sum = 0;
		 sum = c + d;
		 return sum;
	 }

}
