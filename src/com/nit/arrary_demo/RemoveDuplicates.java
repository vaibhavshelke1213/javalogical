package com.nit.arrary_demo;

import java.util.Arrays;

public class RemoveDuplicates 
{
	
	public static void main(String[] args) {
		
		int arr[]= {1,1,2,3,3,2,5,6,7,5};
		int length=arr.length;
		int temp[]=new int[length];
		int a =0;
		for (int i = 0; i < arr.length -1; i++) 
		{
			if(arr[i] != arr[i+1])
			{
				temp[a] = arr[i];
				a++;
			}
			
		}
		
		//System.out.println(Arrays.toString(temp));
		
		for (int i : temp) 
		{
			if(i!=0)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
