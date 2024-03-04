package com.web;

import java.lang.StackWalker.Option;
import java.util.Scanner;

public class BookInfo 
{
    // main method 
	public static void main(String[] args)
	{
		// create the scanner class
		Scanner sc = new Scanner(System.in);
		//enter the data 
		System.out.println("Enter your bookId.....");
		int bookId = sc.nextInt();
		System.out.println("Enter your bookName......");
		String bookName = sc .next();
		System.out.println("Enter Your bookAuthor ......");
		String bookAuthor = sc.next();
		System.out.println("Enter Your bookPrice ........");
		double bookPrice = sc.nextDouble();
		System.out.println("*****ENTER YOUR BOOK DETAILS ******");
		System.out.println("bookId ="+bookId+"/n"+"bookName ="+bookName+"/n"+"bookAuthor ="+bookAuthor+"/n"+"bookPrice ="+bookPrice);
		System.out.println("Enter You Want One More Book");
	    String option = sc.next();
		if (option.equals("yes"))
		{ 
			
			
		}
		//close the scanner
		sc.close();
	
	
	}

}
