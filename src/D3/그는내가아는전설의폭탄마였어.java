package D3;

import java.util.Scanner;

public class 그는내가아는전설의폭탄마였어 {
	static int n;
	static int[][] arr;
	static int power;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc < t + 1; tc++) {

			n = sc.nextInt();
			power = sc.nextInt();
			arr = new int[n][n];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
//		위쪽 왼, 오, 아래쪽 왼, 오
			int answer = 0;
			int plusSum = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					plusSum = Math.max(plus(i, j, power), plusSum);
				}
			}

			int XSum = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					XSum = Math.max(XSum, X(i, j, power));

				}
			}

			answer = Math.max(plusSum, XSum);
			System.out.printf("#%d %d\n", tc, answer);
		}

	}

	static int plus(int row, int col, int power) {
		int tmp = 0;
		for (int i = row - power; i <= row + power; i++) {
			if (i >= 0 && i < arr.length) {
				tmp += arr[i][col];
			}
		}
		for (int i = col - power; i <= col + power; i++) {
			if (i < 0 || i >= arr.length)
				continue;
			tmp += arr[row][i];
		}
		tmp -= arr[row][col];
		return tmp;
	}

	static int X(int row, int col, int power) {
		int[] rd = { 1, 1, -1, -1 };
		int[] cd = { 1, -1, 1, -1 };
		int rimit = power;
		int tmp = 0;
		while (rimit > 0) {
			for (int i = 0; i < cd.length; i++) {
				int rn = row + rd[i];
				int cn = col + cd[i];
				if (rn < 0 || rn >= arr.length || cn < 0 || cn >= arr.length)
					continue;
				tmp += arr[rn][cn];

			}

			for (int i = 0; i < cd.length; i++) {
				if (rd[i] < 0)
					rd[i]--;
				else if (rd[i] > 0)
					rd[i]++;
				if (cd[i] < 0)
					cd[i]--;
				else if (cd[i] > 0)
					cd[i]++;
			}

			rimit--;
		} // end while
		tmp += arr[row][col];
		return tmp;
	}

}
