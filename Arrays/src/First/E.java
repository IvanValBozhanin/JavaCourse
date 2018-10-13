package First;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			if (arr[i] >= first) {
				second = first;
				first = arr[i];
				continue;
			}
			// if(arr[i] > second)
			// {
			// second = arr[i];
			// }
		}
		System.out.println(second);
	}
}
