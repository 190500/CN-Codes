package intro_to_java;

import java.util.*;

public class SumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		int sum = i;
		while (i <= n) {
			int t = 1; // starting number
			int j = 1;
			while (j <= i) {
				if (t < i) {
					System.out.print(t + "+");
					t++;
					j++;
				} else {
					System.out.print(t + "=" + sum);
					j++;
				}
			}
			System.out.println();
			i++;
			sum = sum + i;
		}
		s.close();
	}
}
