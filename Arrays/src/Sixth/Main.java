package Sixth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int o1= 0, o2= 0;
		for (int i = 0; i < n; ++i) {
			arr[i] = in.nextInt();
			if (min > arr[i]) {
				min = arr[i];
				o1 = i;
			}
			if (max < arr[i]) {
				max = arr[i];
				o2 = i;
			}
		}
		++o1;
		++o2;
		System.out.println(o1 + " " + o2);
	}

}
