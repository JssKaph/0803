
public class RecursiveMethodDemo {
	public static void main(String[] args) {
		mymethod(10);

	}
	
	static void mymethod(int max) {
		System.out.print(max + "\t");
		if(max <= 0) return;
		else
		mymethod(--max); // 무한루프 돈다.
	}
}
