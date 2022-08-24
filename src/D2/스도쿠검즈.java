package D2;

import java.util.Scanner;


public class 스도쿠검즈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
//		
		for (int tc = 1; tc < t + 1; tc++) {
			int answer = 1;
			int[][] arr = new int[9][9];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < arr.length; i++) {
				int row = 0;
				int col = 0;

				for (int j = 0; j < arr.length; j++) {
					row += arr[i][j];
				}

				for (int j = 0; j < arr.length; j++) {
					col += arr[j][i];
				}
				if (row != 45 || col != 45) {
					answer = 0;

				}

			}

			for (int i = 0; i < arr.length - 3 + 1; i += 3) {
				for (int j = 0; j < arr.length - 3 + 1; j += 3) {
					int box = 0;
					for (int a = 0; a < 3; a++) {
						for (int b = 0; b < 3; b++) {
							box+=arr[i+a][j+b];
						}
					}
					if (box != 45) {
						answer = 0;

					}
				}
			}
			System.out.printf("#%d %d\n", tc, answer);

		} // tc

	}

}
