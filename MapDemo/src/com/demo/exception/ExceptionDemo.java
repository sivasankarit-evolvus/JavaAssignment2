package com.demo.exception;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		   try{    
               int a,b;
               Scanner scan= new Scanner(System.in);
               System.out.println("Enter a:");
               a = scan.nextInt();
               System.out.println("Enter b:");
               b = scan.nextInt();
               int c =a/b;
               System.out.println("c = " + c);
               int arr[]= {10,20,30,40,50};
               int f;
               System.out.println("Enter the index to be found in array");
               f = scan.nextInt();
               System.out.println(arr[f]);
               scan.close();
               }     
		   catch(ArithmeticException e)  {  
            System.out.println("Arithmetic Exception occurs");  
           }   
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   
	}
}
