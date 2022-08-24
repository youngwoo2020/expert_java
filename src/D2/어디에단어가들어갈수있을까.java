package D2;

import java.util.Arrays;

public class 어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		// k 이 n이 아닐때
		int[][]arr = {{1,1,0,0,0},{0,0,0,0,1},{1,1,0,1,1},{1,0,0,0,0},{0,0,0,1,0}};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int k = 3;
		int count = 0;
		//오른쪽탐색
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-k; j++) {
				if(arr[i][j]==1) {
					for (int kk = 0; kk <k; kk++) {
						if(arr[i][j+kk]!=0) {
						continue;	
						}else {
						count++;
						}
					}
				}
			}
		}
		
		System.out.println(count);
		
		
		
		
		
		
	}

}
