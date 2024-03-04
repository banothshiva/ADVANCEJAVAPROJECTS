package com.web;

import java.util.Scanner;

public class CheackReverseNumber
{

	public static void main(String[] args)
	{
		// create scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Reverse Number......"); //1234
		int number	= sc.nextInt();
		int num =0;
		int reverse=0;
		while (number != 0)
		{
			int  digit = number % 10;
			reverse = reverse * 10+digit;
			number = number / 10;
			
		}
		
			System.out.println(" number reversed...."+reverse);
			//close the scanner
			sc.close();
			
	}
		
		
	
	
	
	
	
	}


