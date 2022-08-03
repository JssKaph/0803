
public class Main {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student[] array = new Student[2]; // 주소를 호출해야함 (멤버변수)

		Input input = new Input();
		input.input(array);
		Calc calc = new Calc();
		calc.calc(array);
		Sort sort = new Sort();
		sort.selectionSorting(array);
		Output output = new Output();
		output.output(array);

		System.out.println("성적관리프로그램 끝");
	}
}
