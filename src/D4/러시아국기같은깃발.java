package D4;

import java.util.Arrays;
import java.util.Scanner;

public class 러시아국기같은깃발 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int tc = 1; tc < t + 1; tc++) {

			String tmp = sc.nextLine();
			int n = Integer.parseInt(tmp.split(" ")[0]);
			int m = Integer.parseInt(tmp.split(" ")[1]);
			String[][] arr = new String[n][m];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLine().split("");
			}
			int answer = 0;
//		첫줄은 무조건 흰색
//		마지막줄은 무조건 빨간색
			for (int i = 0; i < m; i++) {
				if (!(arr[0][i].equals("W")))
					answer++;
				if (!(arr[n - 1][i].equals("R")))
					answer++;

			}
			
			
			
			
			
			

		
			System.out.printf("#%d %d", tc, answer);
		}

	}

}
