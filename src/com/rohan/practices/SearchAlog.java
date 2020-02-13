package com.rohan.practices;

public class SearchAlog {
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int n = 100;
		JumpSearch(arr, n);
	}
	
	static boolean linearSearch(int[] arr, int n)
	{
		boolean result = false;
		
		for(int i = 0; i <= arr.length; i++)
		{
			if(n == arr[i])
			{
				System.out.println("foudn the element "+n);
				return true;
			}
			
		}
		System.out.println("could not find the element");
		return result;
	}
	
	static boolean binarySearch(int[] arr, int n)
	{
		int start = 0;
		int end = arr.length;
		int mid = (start + end) / 2;
		boolean result = false;
	
	while (mid >= 0 && mid < arr.length ){	
		if(n == arr[mid])
		{
			System.out.println("foudn the element "+ mid);
			return true;
		}
		else if (arr[mid] > n)
		{
			end = mid - 1;
			
		}
		else if (arr[mid] < n)
		{
			start = mid + 1;
		}
		mid = (start+end)/2;
	}
		
	System.out.println("could not find the element");
		return result;
	}
	
	static void JumpSearch(int[] arr, int n)
	{
		int jumpSize = (int) Math.sqrt(arr.length);
		
		int start = 0;

		while (jumpSize < arr.length) {
			if (n <= arr[jumpSize]) {
				break;
			} else {
				start = jumpSize;
				jumpSize += jumpSize;
			}

		}
		
		System.out.println("Start : "+ start+" : jumpsiz: "+jumpSize);
		
		for(int i = start ; i  <= jumpSize && i < arr.length; i++)
		{
			if(arr[i] == n)
			{
				System.out.println("foudn the element " + i );
				return ;
			}
		}
		
		System.out.println("could not find the element");
	}

}
