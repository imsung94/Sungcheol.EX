package Practice02;

public class PersonTest01 {

	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.weight = 85.2F;
		personKim.height = 180.0F;

		Person personLee = new Person("이순신", 175, 75);

	}

}
