package D3;

import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc < 11; tc++) {

			int T = Integer.parseInt(sc.nextLine());
			String word = sc.nextLine();
			String st = sc.nextLine();

			int answer = 0;
			for (int i = 0; i < st.length()-word.length(); i++) {
				String temp = "";
				if (st.charAt(i) == word.charAt(0)) {
					for (int j = 0; j < word.length(); j++) {
						temp += st.charAt(i + j);
					}
					if (word.equals(temp)) {
						answer++;
					}
				}
			}
			System.out.printf("#%d %d\n", T, answer);
			
		}
	}

}
