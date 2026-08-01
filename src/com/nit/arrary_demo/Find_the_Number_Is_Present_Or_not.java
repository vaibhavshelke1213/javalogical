package com.nit.arrary_demo;

public class Find_the_Number_Is_Present_Or_not 
{
	public static void main(String[] args) 
	{
		int arr[] = {5,9,6,53,56,45};
		
		int findNum = 9;
		
		
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==findNum)
			{
				System.out.println("Number is Found And the Index of the numnber is :- "+i);
				
				return ;
				
			}
			
		}
		System.out.println("-1");
		
		
		
	}

}
