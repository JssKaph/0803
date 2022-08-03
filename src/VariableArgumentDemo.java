
public class VariableArgumentDemo {
	public static void main(String[] args) {
//		int a = 5; // argument
//		mymethod(4, 5, 6, 7, 8); // 가변적인
	//=====================
		mymethod(7, "Hello, World", 'A', 89.5, false);
	}

//	static void mymethod(int... array) { // parameter, 받아오는 값이 어떤 값이 올지 모르기 때문에 int...array 사용 (사실상 배열)
//		for (int i : array ) { //처음부터 끝까지
//		}
//	}
	//=====================
	static void mymethod(Object... array) { // 모든 객체의 상위 = Object
		for (Object i : array) {
			System.out.println(i);
		}
	}
}
