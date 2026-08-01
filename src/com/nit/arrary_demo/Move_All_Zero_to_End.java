package com.nit.arrary_demo;

public class Move_All_Zero_to_End 
{
	public static void main(String []args)
	{
		int arr[] = {0,2,0,2,0,3,5,6,6,0};
		
		int temp =0;
		
		int arr1[] = new int[arr.length];
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[temp++] = arr[i];
			}
		}
		
		
		System.out.println("Print Array after the moving the zeros to the end");
		
		for (int i : arr1) 
		{
			System.out.print(i);
		}
		
	}
}
