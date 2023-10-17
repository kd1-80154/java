package com.sunbeam;

public class ExceptionLineTooLong extends Exception {
	ExceptionLineTooLong(){
		
		super("String is too long");
		 throw new ExceptionLineTooLong();
	}
	

}
