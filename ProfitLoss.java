package com.Mustafa.java;

public class ProfitLoss {

	public static void main(String[] args) {
		double costPrize=Double.parseDouble(args[0]);
		double sellingPrize=Double.parseDouble(args[1]);
		double profit=sellingPrize-costPrize;
		double loss=costPrize-sellingPrize;
		double persentage=(profit/costPrize)*100;
		double lossPersentage=(loss/costPrize)*100;
		if(profit>loss) {
			System.out.println("the profit is "+profit+"And persentage"+persentage);
			
		}
		else {
			System.out.println("It has loss "+loss+"the loss persentage"+lossPersentage);
			
		}
		

	}

}
