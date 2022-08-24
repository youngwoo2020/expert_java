package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int tcn = sc.nextInt();
			int[] arr = new int[1000];
			for (int i = 0; i < 1000; i++) {
				arr[i] = sc.nextInt();
			}

			int[] score = new int[1000];
			int answer = 0;
			int m = 0;
			for (int i = 0; i < arr.length; i++) {
				score[arr[i]]++;
			}
			System.out.println(Arrays.toString(score));
			for (int i = 0; i < score.length; i++) {
				m = Math.max(m, score[i]);
				if (score[i] == m) {
					answer = i;
				}
			}
			System.out.printf("#%d %d", tc, answer);
			System.out.println();

		}

	}
}