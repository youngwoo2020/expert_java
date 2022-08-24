package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 회문1 {
	public static boolean isOK(String temp) {
		String temp2 = "";
		for (int i = 0; i < temp.length(); i++) {
			temp2 += temp.charAt(temp.length() - 1 - i);
		}
		if (temp.equals(temp2)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 0; tc < 11; tc++) {

			int n = Integer.parseInt(sc.nextLine());
			char[][] arr = new char[8][8];
			int answer = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextLine().toCharArray();
			} // 배열 받기

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - n + 1; j++) {
					String temp = "";
					for (int nn = 0; nn < n; nn++) {
						temp += (arr[i][j + nn]);
					}
					if (isOK(temp) == true) {
						answer++;
					}
					temp = "";
					for (int nn = 0; nn < n; nn++) {
						temp += (arr[j + nn][i]);
					}
					if (isOK(temp) == true) {
						answer++;
					}

				}
			}

			System.out.printf("#%d %d\n", tc, answer);
		}

	}
}
