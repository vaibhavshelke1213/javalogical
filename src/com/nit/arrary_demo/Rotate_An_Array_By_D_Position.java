package com.nit.arrary_demo;

public class Rotate_An_Array_By_D_Position 
{
	public static void main(String[] args) 
	{

		int arr[] = {2,3,4,5,6,7,8};
		
		int target = 5;
		
		
	
		
		int arr2[] = new int[arr.length];
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]!=target+1)
			{
				arr2[i] = arr[i];
			}
			
		}
		
	}

}
