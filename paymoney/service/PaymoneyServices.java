package com.vm.paymoney.service;

public class PaymoneyServices {


		public int transactionCalculator(int[] transactionArray,int valueOfTarget) {
			
			for(int i=0;i<transactionArray.length;i++) {
			 if(transactionArray[i]>=valueOfTarget) {
				 return i+1;
			 }
			 else {
				 valueOfTarget=valueOfTarget-transactionArray[i];
			 }
			}
			
			return -1;
			
		}
	}

