package D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc < T + 1; tc++) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			} // 배열 받는 end for

			ArrayList<Integer> temp = new ArrayList<Integer>(); // max값을 담을 리스트

			for (int i = 0; i < n - m + 1; i++) { // 완전탐색으로 길이는 원래 배열에서 m값을 빼고, 마지막을 더해야하니까 +1
				for (int j = 0; j < n - m + 1; j++) {
					int answer = 0;
					for (int a = 0; a < m; a++) { // i가 m보다 작고
						for (int b = 0; b < m; b++) { // 가 m보다 작을때 몽땅 더한다
							answer += arr[i + a][j + b];
						}
					}
					temp.add(answer);
				}
			}
			int result = Collections.max(temp);
			System.out.printf("#%d %d", tc, result);
			System.out.println();

		} // testcase end for
	}// main
}
