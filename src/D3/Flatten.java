package D3;

import java.util.Arrays;
import java.util.Scanner;

public class Flatten {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int count = sc.nextInt();
			int[] arr = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			int answer = 0;
			for (int i = 0; i < count; i++) {
				Arrays.sort(arr);
				int min = arr[0];
				int max = arr[arr.length - 1];
				arr[0] += 1;
				arr[arr.length - 1] -= 1;
			}
			Arrays.sort(arr);
			answer = arr[arr.length - 1] - arr[0];
			System.out.printf("#%d %d", tc, answer);
			System.out.println();

		}
	}

}
