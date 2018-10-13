package Second;

import java.util.Scanner;

public class Main {

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [] arr = new int [n];
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; ++ i)
		{
			arr[i] = in.nextInt();
			if(first >= arr[i])
			{
				second = first;
				first = arr[i];
				continue;
			}
//			if(second > arr[i])
//			{
//				second = arr[i];
//			}
		}
		System.out.println(first + second);
	}
}
