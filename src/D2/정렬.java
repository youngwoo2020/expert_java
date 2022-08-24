package D2;

import java.util.Scanner;

public class 정렬 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int len = sc.nextInt();
			int[]arr = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i]= sc.nextInt();
			} // arr 입력
			
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-1-i; j++) {
					if(arr[j]>arr[j+1]) {
						int temp = arr[j];
						arr[j]= arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.printf("#%d ", t);
			for (int i = 0; i < arr.length; i++) {
				System.out.printf("%d ",arr[i] );
			}
			System.out.println();
			
		}// test case end for
		
		
	}

}
