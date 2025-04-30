package com.Mustafa.java;
import java.util.*;

public class CelciusToFeranhite {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the degree: ");
		double Celsius=sc.nextDouble();
		double hite=((9*Celsius)/5)+32;
		System.out.println("the Farenhite is:"+hite);
		sc.close()
;		

	}

}
