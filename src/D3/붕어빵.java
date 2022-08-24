package D3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class 붕어빵 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tc = 1; tc < t+1; tc++) {
		int n = sc.nextInt();
//		
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] persons = new int[n];
		for (int i = 0; i < persons.length; i++) {
			persons[i] = sc.nextInt();
		}
		
		
		
		Arrays.sort(persons);

		int[][] arr = new int[persons[persons.length - 1] + 1][2];
		int bread = 0;
		int j = 0;
		String answer = "Possible";
		for (int i = 1; i < persons[persons.length - 1] + 1; i++) {
			if (i % m == 0)
				bread = k * (++j);
			arr[i][0] = i;
			arr[i][1] = bread;

		}

		for (int i = 0; i < persons.length; i++) {
			int tmp = arr[persons[i]][1] - (i+1);
			if (tmp< 0) {
				answer = "Impossible";
				break;
			}

		}

		System.out.printf("#%d %s\n",tc,answer);
		}

	}

}
