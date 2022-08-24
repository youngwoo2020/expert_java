package D2;

import java.util.Scanner;

public class 가라RC카 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc < t + 1; tc++) {

			int n = sc.nextInt();
			int answer = 0;
			int speed = 0;

			for (int i = 0; i < n; i++) {
				int cmd = sc.nextInt();
				switch (cmd) {
//			가속일경우
				case 1:
					speed += sc.nextInt();
					break;
//			감속일 경우
				case 2:
					int tmp = sc.nextInt();
					if (speed > tmp)speed -= tmp;
					else speed = 0;
					break;
//			현재 속도 유지
				case 0:break;

				}
				answer += speed;
			}
			System.out.printf("#%d %d\n", tc, answer);
		}

	}

}
