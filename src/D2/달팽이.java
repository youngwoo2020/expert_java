package D2;

import java.util.Scanner;

public class 달팽이 {
	static public int square(int n, int arr[][], int num, int start) {
		int last = n - start;
		for (int i = start; i < last - 1; i++) {
			arr[start][i] = num++;
		}
		for (int i = start; i < last - 1; i++) {
			arr[i][last - 1] = num++;
		}
		for (int i = start; i < last - 1; i++) {
			arr[last - 1][last - 1 - i + start] = num++;
		}
		for (int i = start; i < last - 1; i++) {
			arr[last - 1 - i + start][start] = num++;
		}
		return num;
	}// 함수 끝

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc < T + 1; tc++) {

			int n = sc.nextInt();
			int num = 1;
			int start = 0;
			int[][] arr = new int[n][n];

			int temp = n;
			while (temp / 2 > 0) {
				num = square(n, arr, num, start);
				start ++;
				temp--;
			} //arr를 만드는 end for
			if (n % 2 == 1)
				arr[n / 2][n / 2] = n * n;
			
			
			System.out.println("#"+tc);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		} // test case end for
	}// main

}
