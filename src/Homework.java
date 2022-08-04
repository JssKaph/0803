import java.util.Arrays;

/*
 * 준과제
 * a = {{1,2},{3,4}}
 * b = {{5,6},{7,8}}
 * a+b = ? , a*b=?
 */
public class Homework {
	public static void main(String[] args) {
		int[][] A = { { 1, 2 }, { 3, 4 } };
		int[][] B = { { 5, 6 }, { 7, 8 } };
		int[][] hapResults = new int[2][2];
		int[][] gopResults = new int[2][2];
		System.out.println("<<<행열의 합>>>");
		matrixAdd(A, B, hapResults);
		matrixPrint(hapResults);
		System.out.println("<<<행열의 곱>>>");
		matrixMultiple(A, B, gopResults);
		matrixPrint(gopResults);
	}

	static void matrixMultiple(int[][] A, int[][] B, int[][] results) { // 행열의 곱
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				for (int k = 0; k < A[i].length; k++) { // 곱연산 (공식을 참고0
					results[i][j] += A[i][k]*B[k][j];
				}
			}
		}
	}

	static void matrixAdd(int[][] A, int[][] B, int[][] results) { // 행열의 합
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				results[i][j] = A[i][j] + B[i][j];
			}
		}
	}

	static void matrixPrint(int[][] results) { // 출력
		for (int i = 0; i < results.length; i++) { // 밑으로
			System.out.println(Arrays.toString(results[i])); // 1차원 배열 출력
		}
	}
}
