package com.demo.thread;

public class ThreadDemo {
	int  n = 10;
	int counter =1;
	
	public void printOddNumber(){
		synchronized (this){
            while (counter < n) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("odd : "+counter + "  ");
                counter++;
                notify();
            }
        }
	}
	 
	public void printEvenNumber(){
		synchronized (this){
		  while (counter < n) {
			  while (counter % 2 == 1) {
				  try {
					  wait();
	              }
	              catch (InterruptedException e) {
	                     e.printStackTrace();
	              }
	          }
	          System.out.print("even : "+counter + "  ");
	          counter++;
	          notify();
		  }
		}
	}
	  
}
