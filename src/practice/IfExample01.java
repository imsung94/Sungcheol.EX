package practice;

public class IfExample01 {

	public static void main(String[] args) {
		int age = 60;
		int  charge = 0;
		
		if(age <8) {
			charge = 1000;
			System.out.println("취학전 아동입니다.");
			
		}else if( age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}else if( age < 20) {
			charge = 3000;
			System.out.println("대학생 입니다.");
		}else if(age < 60) {
			charge = 0;
			System.out.println("경로우대 입니다.");
			
		}
		
		System.out.println( "입장료는" + charge + "입니다.");
			

	}

}
