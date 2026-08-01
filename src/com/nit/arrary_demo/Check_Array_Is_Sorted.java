package com.nit.arrary_demo;
// given an array of n integer return true if the array is sorted in non-decreasing order or else false
public class Check_Array_Is_Sorted 
{
	public static boolean isSorted(int arr[]) 
	{
		for(int i = 0; i<arr.length-1;i++)
		{
			if(arr[i] > arr[i+1])
			{
				return false;
			}
			
}
		return true;
		
		
	}
	
	
	public static void main(String[] args) 
	{
		int []arr = {1,3,4,5,10,9};
		
		System.out.println("Is array Sorted or not :-"+isSorted(arr));
		
	}

}
