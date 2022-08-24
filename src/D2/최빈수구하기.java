package D2;

import java.util.Arrays;
import java.util.Scanner;

public class 최빈수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			String temp = sc.nextLine();
			System.out.println(temp);
			String [] tmp = temp.split(" ");
			System.out.println(Arrays.toString(tmp));
			int len = tmp.length;
			System.out.println("len: "+len);
			int[] arr = new int[len];
//			for (int i = 0; i < len; i++) {
//				arr[i] = Integer.parseInt(tmp[i]);
//			}
			System.out.println(Arrays.toString(arr));
			int[] score = new int[100];
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
