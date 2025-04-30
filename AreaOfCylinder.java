package com.Mustafa.java;
import java.util.*;

public class AreaOfCylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the radius");
		double rad=sc.nextDouble();
		System.out.print("enter the hight");
		double hig=sc.nextDouble();
		final double pi=3.14;
		
		
		double area=2*pi*rad*rad+2*pi*rad*hig;
		System.out.println("the surface area of a cylinder "+area);
		sc.close();
		
		

	}

}
