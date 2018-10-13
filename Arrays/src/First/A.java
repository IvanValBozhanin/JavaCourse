package First;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];
		double sredno = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			sredno += arr[i];
		}
		sredno /= n;
		int theOne = 0;
		double razlika = Double.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (razlika > Math.abs(arr[i] - sredno)) {
				razlika = Math.abs(arr[i] - sredno);
				theOne = i;
			}
		}
		System.out.println(arr[theOne]);
	}

}