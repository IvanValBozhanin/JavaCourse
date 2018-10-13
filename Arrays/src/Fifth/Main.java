package Fifth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] arr1 = new int [n/2];
		int [] arr2 = new int [n - n/2];
		for(int i = 0 ; i < n/2 ; ++ i)
		{
			arr1[i] = in.nextInt();
		}
		for(int i = 0 ; i < n-n/2 ; ++ i)
		{
			arr2[i] = in.nextInt();
		}
		for(int i = 0 ; i < arr1.length ; ++ i)
		{
			for(int j = i + 1; j < arr1.length ; ++ j)
			{
				if(arr1[i] < arr1[j])
				{
					arr1[i] = arr1[i] + arr1[j]- (arr1[j] = arr1[i]);
				}
			}
		}
		for(int i = 0 ; i < arr2.length ; ++ i)
		{
			for(int j = i + 1; j < arr2.length ; ++ j)
			{
				if(arr2[i] > arr2[j])
				{
					arr2[i] = arr2[i] + arr2[j]- (arr2[j] = arr2[i]);
				}
			}
		}
		for(int i = 0 ; i < arr1.length ; ++ i)
		{
			System.out.print(arr1[i]+" ");
		}
		for(int i = 0 ; i < arr2.length ; ++ i)
		{
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
