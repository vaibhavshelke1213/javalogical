package com.nit.arrary_demo;

public class Find_Large_Number 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,5,6,12} ;
		
		int n = arr.length;
		
		IO.println("largest number in the Arrary is "+largenumber(arr, n));
		
		
		
	}
	
	
	public static int largenumber(int[] arr , int n) 
	{
		int max = arr[0];
		
		for(int i = 1 ; i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		return max;
	}
	

}
