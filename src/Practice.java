
public class Practice {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += add(i);
		}
		System.out.println("sum = " + sum);
	}
	static int add(int max) {
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum = sum + i; // sum += i;
		}
		return sum;
	}
}
