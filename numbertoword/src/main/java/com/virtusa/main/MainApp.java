package com.virtusa.main;

import java.util.Scanner;

import com.virtusa.numbertoword.NumberToWord;

/**
 * 
 * @author giridhar
 * @since 1
 * @version 1
 *      
 */
public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			int number;
			// Scanner used to take input number values from console
			scanner = new Scanner(System.in);
			System.out.println("Enter a number to convert into word format :");
			number = scanner.nextInt();
			System.out.println("Result:");
			System.out.println(number + " = " + NumberToWord.numberToWord(number));
			System.out.println(" \n");
		} catch (Exception e) {
			System.out.println("Error While reading or converting number to Word Form" + e);
		}
	}
}
