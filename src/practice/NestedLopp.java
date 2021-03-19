package practice;

public class NestedLopp {

	public static void main(String[] args) {
		
		int dan;
		int times=0;
		for (dan = 2; dan <= 9; dan++) {
			for(times =1; times <=9; times++) {
				System.out.println(dan+"단 "+dan + "x" + times + "=" + dan * times);
			}
			System.out.println();
		}
		
		

	}

}
