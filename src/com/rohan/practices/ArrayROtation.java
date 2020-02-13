package com.rohan.practices;

public class ArrayROtation {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		int n=7;
		rotateTheArray1(arr,n);
	}
	
	public static void rotateTheArray1(int[] arr, int n)
	{
		int[] temp = new int[arr.length];
		int j=0;
		
		for(int i=n; i < arr.length;i++)
		{
			
			temp[j] = arr[i];
			j++;
		}
		
		for(int i=0; i<=n-1; i++)
		{
		   temp[j] = arr[i];
		   j++;
		}
		
	for (int x : temp)
	{
		System.out.println(x);
	}
	}
}


