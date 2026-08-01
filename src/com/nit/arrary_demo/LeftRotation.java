package com.nit.arrary_demo;

 import java.util.*;
public class LeftRotation {
	
	 public static void main(String[] args) {
		
		  int arr[]= {1,2,3,4,5};
		  //    3 4 5 1 2
		   
		  System.out.println("Enter the kth rotation");
		   int k=Integer.parseInt(IO.readln());
		   
		     for(int  i=0;i<k;i++)
		     {
		    	      int t=arr[0]; // t=1
		    	       for(int j=0;j<arr.length-1;j++)
		    	       {
		    	    	       arr[j]=arr[j+1];
		    	       }
		    	       arr[arr.length-1]=t;
		     }
		     System.out.println(Arrays.toString(arr));
	}

}
