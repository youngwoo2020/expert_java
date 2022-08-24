package D2;

import java.util.Scanner;

public class D2_1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < T; t++) {

			String temp = sc.nextLine();
			int N = Integer.parseInt(temp.split(" ")[0]);
			int K = Integer.parseInt(temp.split(" ")[1]);

			String[][] puzzle = new String[N][N];
			int answer =0 ;
			for (int i = 0; i < N; i++) {
				String[] line = sc.nextLine().split(" ");
				puzzle[i] = line;
			}

			for ( int i=0; i<N ; i++ ) {
				for ( int j=0; i<N ; i++ ) {
					
					// 지금 위치가 섬인지 검사
					if ( puzzle[i][j].equals("0") ) {
						
						// 섬이면 현재 위치로부터 사방탐색 하여 가로 또는 세로에 있는 섬과 거리 측정, 최대값 저장
						int place = 0;
						// 동쪽이 1인지 검사
						for (int d = 1; d<j ; d++) {
							if ( puzzle[i][j-d].equals("1") ) {
								place =  d-1 ;
								break;
							}
						}
						if(place==K) {
							answer++;
						}
						
						place = 0;
						// 서쪽이 1인지 검사
						for (int d = 1; d<N-j ; d++) {
							if (puzzle[i][j+d].equals("1") ) {
								place = d-1;
								break;
							}
						}
						if(place==K) {
							answer++;
						}
						// 북쪽이 1인지 검사
//						for (int d = 1; d<i ; d++) {
//							if ( map[i-d][j]==1 ) {
//								maxDistance = Math.max( maxDistance , d-1 );
//								break;
//							}
//						}
//						
//						// 남쪽이 1인지 검사
//						for (int d = 1; d<n-i ; d++) {
//							if ( map[i+d][j]==1 ) {
//								maxDistance = Math.max( maxDistance ,d-1 );
//								break;
//							}
//						}
					}
				}
			}
			
			System.out.println(answer);
		}

	}

}
