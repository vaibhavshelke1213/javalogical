package com.nit.arrary_demo;

public class Second_largest_number_in_Arrary 
{
	public static void main(String[] args) 
	{
		int arr [] = {1,4,5,6,9,9,4,1};
		
		System.out.println(secondLargestNumber(arr));
		
		
		
	}
	
	
	public static int secondLargestNumber(int arr[])
	{
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i =0 ; i<n;i++)
		{
//			if(arr[i]>max)
//			{
//				max=arr[i];
//			}
			
			max=Math.max(max, arr[i]);
			
		}
		
		for(int i = 0; i<n;i++)
		{
			if(arr[i]!=max)
			{
				if(arr[i]>secMax)
				{
					secMax =arr[i];
				}
				
			}
		}
		
		return secMax;
		
		
	}

}
