package D3;

import java.util.Scanner;
import java.text.BreakIterator;
import java.util. *;
public class 회문2 {
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
		for (int tc = 1; tc < 11; tc++) {

			int n = Integer.parseInt(sc.nextLine());
			char[][] arr = new char[100][100];
			int answer = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextLine().toCharArray();
			} // 배열 받기

			for (int i = arr.length-1; i >0; i--) {
				//행에서 잘라서 쌓을 문자열
				String rtemp = "";
				//열에서 잘라서 쌓을 문자열
				String rtemp2 = "";
				for (int j = arr.length-1; j >0 ; j--) {
					//문자열이 행에서 1,2,3..arr.length 만큼 증가
					rtemp2 += arr[i][j];
					rtemp += arr[j][i];
					if (rtemp.length() > answer && rtemp2.length() > answer) {
						String ltemp = "";
						String ltemp2 = "";
						
						inner : for (int d = 0; d < rtemp.length(); d++) {
							//문자열이 행에서 1,2,3..arr.length 만큼 증가한 문자열을 -1,-2,,로 자른다.
							ltemp = rtemp.substring(d, rtemp.length());
							ltemp2 = rtemp2.substring(d, rtemp2.length());
							if (isOK(ltemp) == true) {
								answer = Math.max(answer, ltemp.length());break inner;
								
							}
							if (isOK(ltemp2) == true) {
								answer = Math.max(answer, ltemp2.length());break inner;
							}
							
						}
					}
				}
			}
			System.out.printf("#%d %d\n", tc, answer);
		}

	}
}
