package com.epam.Epam_demo;

import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CalculateInterest {
	public static final Logger logger = LogManager.getLogger(CalculateInterest.class);
	//@SuppressWarnings("resource")
	public static void main( String[] args ) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	logger.debug("This is a DEBUG statement");
    	logger.info("This is a INFO statement");
    	logger.warn("This is a WARN statement");
    	logger.error("This is a ERROR statement");
    	logger.fatal("This is a FATAL statement");
    	logger.info("\nChoose either option 1 or 2 :"+"\n"+"1.Simple Interest"+"\n"+"2.Compound Interest");
    	
    	
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int choice = sc.nextInt();
    	switch(choice){
    		case 1:simpleInterest.readValues();
    			   simpleInterest.calculateSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readValues();
			   compoundInterest.calculateCompoundInterest();
			   compoundInterest.displayAmount();
			   break;
			default:logger.info("Please Enter Valid Option!");
    	}
    }

}
