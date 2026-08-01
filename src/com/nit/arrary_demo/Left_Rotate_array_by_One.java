package com.nit.arrary_demo;

import java.util.Arrays;

public class Left_Rotate_array_by_One 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,4,5,7,8,0,6};
		
		int n = arr.length;
		
		int first = arr[0];
		
		for(int i=0; i<n-1;i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[n-1] = first;
		
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		
	
	}
	

}
