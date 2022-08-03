import java.util.Scanner;

public class Input1 {
	static void input(Employee[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <3; i++) {
			array[i] = new Employee();
			System.out.println("사원번호 : ");
			array[i].num = sc.nextInt();
			sc.nextLine();
//			if (array[i].num==array[i-1].num) {
//				break;
//			}
			System.out.println("급 : ");
			array[i].level = sc.nextInt();
			sc.nextLine();
			System.out.println("호 : ");
			array[i].ho = sc.nextInt();
			sc.nextLine();
			System.out.println("수당 : ");
			array[i].money = sc.nextInt();
			sc.nextLine();
		}
	}
}
