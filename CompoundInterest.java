package com.Mustafa.java;
import java.util.*;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.print("enter the amount: ");
//		double amount=sc.nextDouble();
		System.out.print("enter the principle: ");
		double princ=sc.nextDouble();
		System.out.print("enter the rate: ");
		double rate=sc.nextDouble();
		double compoundInterest=princ*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("the total coumpound interest is: "+compoundInterest);
		sc.close();
		
		
	}

}
