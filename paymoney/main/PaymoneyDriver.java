package com.vm.paymoney.main;

import java.util.Scanner;
import com.vm.paymoney.service.*;

public class PaymoneyDriver {
	public static void main(String[] args) {
		
		PaymoneyServices ts=new PaymoneyServices();
		System.out.println("Enter the Transaction size :");
		
		Scanner sc=new Scanner(System.in);
		int transactionSize=0;
		transactionSize=sc.nextInt();
		
		
		int[] transactionArray=new int[transactionSize];
		System.out.println("Enter the values of array");
		System.out.println();
		for(int i=0;i<transactionArray.length;i++) {
			transactionArray[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the total number of target that needs to achieved");
		int noOtraget=sc.nextInt();
		
		for (int i=0;i<noOtraget;i++) {
			System.out.println();
			System.out.println("Enter the value of target");
			int target= sc.nextInt();
			
			int numberOfDays=ts.transactionCalculator(transactionArray, target);
			if(numberOfDays==-1) {
				System.out.println("Target is not Achieved");
			}
			else {
				System.out.println( "Target Achieved after "+numberOfDays +" transaction");
			}
			
		}
		sc.close();
	}
	
}

