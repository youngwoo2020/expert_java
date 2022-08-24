package D3;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc < 11; tc++) {
			int answer = 0;
			int num = sc.nextInt();
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}//arr

			int[] temp = new int[arr.length * 2 + 2];
			int rcross = 0;
			int lcross = 0;

			for (int i = 0; i < arr.length; i++) {
				
				for (int j = 0; j < arr[i].length; j++) {
					temp[i] += arr[i][j];
					temp[i + arr.length] += arr[j][i];
				}

				rcross += arr[i][i];
				lcross += arr[i][arr.length-1-i];

			}
			temp[100] = rcross;
			temp[101] = lcross;
			Arrays.sort(temp);
			answer = (temp[temp.length - 1]);
			 
			System.out.printf("#%d %d", 1, answer);
			System.out.println();
		}

	}

}
