package practice;

public class BreakExample02 {
	
	public static void main(String[] arge) {
		int sum = 0;
		int num = 0;
		
		for(num =0; ; num++) {
			sum +=num;
			if(sum >=100) //sum이 100보다 크거나 같은때 (종료조건) 
				break;    // 반복문 중
					
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
