package First;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];
		double sredno = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 1; i < n; i += 2) {
			sredno += arr[i];
		}
		sredno = Math.pow(sredno, 1 / n);
		int theOne = 0;
		double razlika = Double.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (razlika > Math.abs(arr[i] - sredno)) {
				razlika = Math.abs(arr[i] - sredno);
				theOne = i;
			}
		}
		System.out.println(arr[theOne]);
	}

}