import java.util.Arrays;
import java.util.Scanner;

public class 문제제목붙이기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int tc = 1; tc < t + 1; tc++) {

			int n = sc.nextInt();

			String[] titles = new String[n];
			for (int i = 0; i < titles.length; i++) {
				titles[i] = sc.next();
			}

			Arrays.sort(titles);

			int answer = 1;
			int start = -1;
			a: for (int i = 0; i < titles.length; i++) {
				if (titles[i].charAt(0) == 'A')
					start = i;
				else
					break a;
			}

			if (start >= 0) {

				inner: for (int i = start + 1; i < titles.length; i++) {
                    if (titles[i - 1].charAt(0) == titles[i].charAt(0) ) continue; 

					if (titles[i - 1].charAt(0) == titles[i].charAt(0) - 1) {

						answer++;
				
						
					} else {

						break inner;
					}
				}
			}
			if (start < 0)
				answer = 0;

			System.out.printf("#%d %d\n", tc, answer);
		}

	}

}