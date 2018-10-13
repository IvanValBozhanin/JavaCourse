package Eighth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int current, max = 0;
		int [] counter = new int [100001];
		for(int i = 0 ; i < n ; ++ i)
		{
			current = in.nextInt();
			counter[current] ++;
			max = Math.max(max, counter[current]);
		}
		if(max > n/2 + n%2) System.out.println(false);
		else System.out.println(true);
	}

}
