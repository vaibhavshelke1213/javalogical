package com.nit.String;

public class StringConstructorDemo 
{
	public static void main(String[] args) 
	{
//		char [] a = {'a','b','c','d'};
//		
//		String s1 = new String(a);
//		
//		IO.println(s1);
//		
		
		String s2 = "cd#vaibhav";
		String s3 = "cd#raj";
		
		 String substring = s2.substring(s2.indexOf("#")+1);
		 
		 String sub = s3.substring(s2.indexOf("#")+1);
		 
		 System.out.println(sub);
		 
		 
		 
		 System.out.println(substring);
		
		
	}

}
