package D2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 새로운불면증치료법 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int tc = 1; tc < t + 1; tc++) {

			int n = sc.nextInt();

			Set<Character> set = new HashSet<Character>();
			int answer = 0;
			int ans = n;

			int j = 1;
			while (true) {
				String st = Integer.toString(ans);
				for (int i = 0; i < st.length(); i++) {
					set.add(st.charAt(i));
				}
				answer++;
				ans = n * ++j;
				if (set.size() == 10)
					break;
			}

			System.out.printf("#%d %d\n", tc, answer * n);
		}

	}

}
