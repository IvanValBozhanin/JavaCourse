package Fourth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int [] arr1 = new int[n];
		int [] arr2 = new int[m];
		int [] arr3 = new int[n + m];
		for(int i = 0 ; i < n ; ++ i)
		{
			arr1[i] = in.nextInt();
		}
		for(int i = 0 ; i < m ; ++ i)
		{
			arr2[i] = in.nextInt();
		}
		int index = 0;
		for(int i = 0 ; i < Math.max(m, n); ++ i)
		{
			if(n > i)
			{
				arr3[index] = arr1[i];
				++ index;
			}
			if(m > i)
			{
				arr3[index] = arr2[i];
				++ index;
			}
		}
		for(int i = 0 ; i < arr3.length ; ++ i)
		{
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}
}
