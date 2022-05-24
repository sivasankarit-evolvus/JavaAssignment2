package com.demo.thread;

public class ThreadDemoRun {
	 public static void main(String[] args)
	    {
	      ThreadDemo td = new ThreadDemo();
	  
	        Thread t1 = new Thread(new Runnable() {
	            public void run()
	            {
	                td.printEvenNumber();
	            }
	        });
	  

	        Thread t2 = new Thread(new Runnable() {
	            public void run()
	            {
	                td.printOddNumber();
	            }
	        });
	  

	        t1.start();
	        t2.start();
	  }

}
