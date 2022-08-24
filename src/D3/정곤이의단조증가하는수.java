package D3;

import java.util.Arrays;
import java.util.Scanner;

public class 정곤이의단조증가하는수 {
	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 1; tc < t + 1; tc++) {

			int n = sc.nextInt();
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int answer = 0;
			int[] nums = new int[n];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(i!=j) {
					if (isPlus(arr[i]*arr[j])) {
						nums[i] = arr[i]*arr[j];
						answer++;
					}
				}
				}
			}
			Arrays.sort(nums);
			if (answer == 0)
				answer = -1;
			else
				answer = nums[n - 1] ;
			System.out.printf("#%d %d\n", tc, answer);
		}

	}

	static boolean isPlus(int n) {
		String str = Integer.toString(n);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) > str.charAt(i))
				return false;
		}

		return true;
	}
}
