package First;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println(max - min);
	}

}
