package D2;

import java.util.Scanner;

public class 숫자배열회전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc < t + 1; tc++) {
			System.out.printf("#%d\n", tc);

			int n = sc.nextInt();
			int[][] arr = new int[n][n];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[arr.length - 1 - j][i]);
				}
				System.out.print(" ");
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[arr.length - 1 - i][arr.length - 1 - j]);
				}
				System.out.print(" ");
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][arr.length - 1 - i]);
				}

				System.out.println();
			}
		}

	}

}
