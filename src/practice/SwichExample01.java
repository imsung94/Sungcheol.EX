package practice;

public class SwichExample01 {

	public static void main(String[] args) {
		
		int ranking = 1;
		char medalColor = 0;
		
		switch(ranking){
		case 1 : medalColor = 'g';
				break;
		case 2 : medalColor = 's';
				break;
		case 3 : medalColor = 'b';
				break;
		case 4 : medalColor = 'a';
				break;
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");

	}

}
