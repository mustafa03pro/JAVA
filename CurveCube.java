package com.Mustafa.java;
import java.util.*;

public class CurveCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the side: ");
		
		int side=sc.nextInt();
		int curve=6*(side*side);
		System.out.println(curve);
		sc.close();
		

	}

}
