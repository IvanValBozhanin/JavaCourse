package Seventh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[k];
		int otg = 0;
		for (int i = 0; i < n; ++i) {
			arr1[i] = in.nextInt();
		}
		for (int i = 0; i < k; ++i) {
			arr2[i] = in.nextInt();
			for (int j = 0; j < n; j++) {
				if (arr2[i] == arr1[j]) {
					++otg;
					break;
				}
			}
		}
		System.out.println(otg == k);
	}

}
