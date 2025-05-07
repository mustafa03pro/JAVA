package com.Mustafa.Datatype;

public class Precedence6 {
	public static void main(String args[]) 
	{
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t & ((i++) == 0));
		b = (f & ((i+=2) > 0));
		System.out.println(i);		
	}

}
