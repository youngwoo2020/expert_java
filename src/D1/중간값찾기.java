package D1;

import java.util.Scanner;

public class 중간값찾기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}//정렬 끝
	answer = arr[N/2];
	System.out.println(answer);

	}

}
