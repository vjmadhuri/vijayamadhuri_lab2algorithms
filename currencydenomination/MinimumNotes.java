package com.vm.currencydenomination;
import com.vm.currencydenomination.sort.*;
import java.util.Scanner;

	public class MinimumNotes {

		private static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			//get the number of denominations 
			System.out.println("Enter the number of denominations");
			int size= sc.nextInt();
			
			//allocate an array called as "notes" to hold denominations
			int[] notes= new int[size];
			
			//get the denominations in the loop
			System.out.println("Enter the currency denominations value");
			for(int i=0; i< size; i++) {
				notes[i] = sc.nextInt();
			}
			
			MergeSortImplementation ms= new MergeSortImplementation();
			ms.sort(notes, 0, notes.length-1);
			
			//check for sorting
			for(int j=0 ;j<notes.length; j++) {
				System.out.println(notes[j]);
			}
			
			//Enter the amount you want to pay
			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			// variable to save notes number
			int [] numNotes = new int[size];
			//pick the notes
			try {
				for(int i=0; i<notes.length ; i++) {
					// find out how many notes of notes[i] to select 
					int n= (int)(amount/notes[i]);
					numNotes[i] = n;
				//	System.out.println(notes[i]+ " : "+ n);
					
					// set amount to the remaining amount
					amount = amount - (n* notes[i]);
					
					//write a condition to find if it is not possible to pay an amount
					// and print a message "Not possible to pay the amount"
					if(i == notes.length-1 && amount != 0) {
						System.out.println("Not possible to pay the amount");
					}else if(i == notes.length-1 && amount == 0) {
						for(int j=0; j<numNotes.length; j++) {
							System.out.println(notes[j]+ " : "+ numNotes[j]);
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Entered 0 as the denomination");
				//e.printStackTrace();
			}
			
		}
	}
