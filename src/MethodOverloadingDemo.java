/*
 * 메소드의 이름이 같을 때 그 메소드의 파라미터로 구별하는 기능
 * 1) 메소드의 이름이 같아야 한다.
 * 2) 반드시 메소드의 파라미터는 서로 달라야 한다.
 * 3) 메소드의 리턴타입은 같거나 다르거나 상관없다.
 */
public class MethodOverloadingDemo {
	public static void main(String[] args) {
		System.out.println(add(34.5, 67.8));
		System.out.println(add(4, 5, 6));
		System.out.println(add(4, 5));
	}

	// Overloading, 중복정의
	static int add(int a, int b) { // 메소드의 중복 적용, 파라미터가 다르기 때문에 add 라는 이름의 똑같은 메소드가 된다.
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b) {
		return a + b;
	}
}