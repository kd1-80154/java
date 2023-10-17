package com.sunbeam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ExceptionLineTooLong {
		Scanner s=new Scanner(System.in);
		String str= s.next();
		try {
			System.out.println("string length="+ str.length());
			if(str.length()> 80) {
				
				throw new ExceptionLineTooLong();
			}
		}
     catch(ExceptionlineTooLong r)
		{
    	 System.out.println(r.getMessage());
    	 System.out.println(r);
    	 
    	}
	}

}
