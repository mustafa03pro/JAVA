package com.Mustafa.java;

public class Mcq {

	public static void main(String[] args) {
		//1)
		//int a = 8.2/2;error
		//System.out.println(a);
		//2)
		int aa = 260;
		byte b= (byte)aa;
		System.out.println(b);
		//3)
		short a1 = (short)65540;
		System.err.println(a1);
		System.out.println(Short.MAX_VALUE);
		//4)
		int aaa = 300;
		long b1 = aaa;
		System.out.println(b1);
		//5)
		char ch = 'C';
		int i = ch;
		System.out.println(i);
		System.out.print("Y"+"O");
		System.out.print('L');
		System.out.println('O');
		//6)
		System.out.println("Y"+"O");
		System.out.println('L' + 'O');
		//7)
		int i1 = 100;
		 long l = i1;
		 float f = l;
		 System.out.println("Int value " + i1);
		 System.out.println("Long value " + l);
		 System.out.println("Float value " + f);
		 //9)
		 char ch1 = 'c';
		 int num1 = 88;
		 //ch1 = num1;//error
		 //10)
		 byte b2 = 42;
		 char c = 'a';
		 short s = 1024;
		 int i3 = 50000;
		 float f1 = 5.67f;
		 double d = .1234;
		 double result = (f1 * b2) + (i3 / c) - (d * s);
		 System.out.println("result = " + result);
		
	}

}
