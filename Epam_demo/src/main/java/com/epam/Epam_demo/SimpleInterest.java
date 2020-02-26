package com.epam.Epam_demo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SimpleInterest {
	public static final Logger logger = LogManager.getLogger(SimpleInterest.class);
	float principleAmount,rate,time,simpleInterest;
	void readValues() throws IOException{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		logger.info("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		logger.info("Enter Rate : ");
		rate = sc.nextFloat();
		logger.info("Enter Time Period : ");
		time = sc.nextFloat();
	}
	void calculateSimpleInterest(){
		simpleInterest = (principleAmount * rate * time)/100;
	}
	void displayAmount() throws IOException{
		logger.info("Total Amount : "+simpleInterest);
	}

}
