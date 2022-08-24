package D2;

import java.util.Scanner;

public class 중간평균값구하기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			double answer = 0;
			int min = 100001;
			int max = 0;
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				min = Math.min(arr[i], min);
				max = Math.max(max, arr[i]);
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]!= min && arr[i] != max) {
					answer += arr[i];
				}
			}
			answer /= (arr.length - 2);
			answer = Math.round(answer);
			int result = (int)answer;
			System.out.printf("#%d %d", t,result);
			System.out.println();
		}

	}

}
