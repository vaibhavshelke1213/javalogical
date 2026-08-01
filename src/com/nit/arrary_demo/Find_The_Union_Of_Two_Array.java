package com.nit.arrary_demo;

public class Find_The_Union_Of_Two_Array 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,9,3,4,10,6,8,2,0};
		
		for(int i =0; i< arr.length-1; i++ )
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				arr[j] = arr[j]+arr[j+1];
				
				arr[j+1] = arr[j] - arr[j+1];
				
				arr[j] = arr[j] - arr[j+1];
						
			
			
			
		}
			}
			
		}
		
		for(int a : arr)
		{
			System.out.print(a+" ");
		}


		
		
		
		
		
	}
	
	

}
