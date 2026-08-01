package com.nit.String;

import java.util.Arrays;

public class Day2_String 
{
	public static void main(String[] args) 
	{
		String s1 = "java";//this String Strored in SCP area 
		
		s1=s1.toUpperCase(); // This objcet create in non Scp area;
		
		System.out.println(s1);
		
		
		String s3 = "vaibhav";
		String s4 = new String("vaibhav");
		
		IO.println(s3==s4); //false
		
		int length = s4.length();
		
		System.out.println(length);
		
 s4= s4.intern();
		
		IO.println(s3==s4);
		
		
		
		
		System.out.println("----------------------------------");
		
		String ss = "ABCDabcd";
				
				byte[] bytes = s1.getBytes();
				
				IO.println(Arrays.toString(bytes));
				
				
		
		
		
		
	}

}
