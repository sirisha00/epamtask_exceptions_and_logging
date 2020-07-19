package com.epam.EpamCleanCode;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		Logger logger = Logger.getLogger(App.class.getName());
		logger.info("Enter the total area of house(in feets):");
		int area = sc.nextInt();
		logger.info("Select the material standard from the below list");
		logger.info("1.Standard Material");
		logger.info("2.Above Standard Material");
		logger.info("3.High Standard Material");
		logger.info("4.High Standard Material and Fully Automated House");
		char ch = sc.next().charAt(0);;
		int result;
		ConstructionCost cost = new ConstructionCost();
		switch(ch) {
				case '1':
					result = cost.stdmat(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				case '2':
					result = cost.abstdmat(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				case '3':
					result = cost.hstdmat(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				case '4':
					result = cost.fullaut(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				default:						
					break;		
		}	
	}
}
