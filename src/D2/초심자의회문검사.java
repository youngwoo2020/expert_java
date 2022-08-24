package D2;

import java.util.Scanner;

public class 초심자의회문검사 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.next();
		for (int tc = 1; tc < t+1; tc++) {
			int answer = 0;
			String word = sc.nextLine();
			char[] words = word.toCharArray();
			String temp = "";
			for (int i = 0; i < words.length; i++) {
				temp += words[words.length-1-i];
			}
			if(word.equals(temp)) {
				answer = 1;
			}
		
			System.out.printf("#%d %d\n",tc, answer);
		}
		
		
		
		
	}

}
