package java101;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int [] list= {15,12,788,1,-1,-778,2,0} ;
		
		
		Scanner input = new Scanner (System.in) ;
		System.out.print("enter a number : ");
		int number = input.nextInt() ;
		
		
		
		int min = list[0] ;
		int max = list [0] ;
		
				
		for(int i  : list ) {
			
			if(i<min) ; min =i ;
			
			if(i>max) ; max =i ;
		}
		
		
		
       for (int i : list) {
    	   
    	   if(i<number) {
    		  
    		  if(i>max) {
    			  
    			  max = i ;
    		  }
    	   }
    	   
    	   if(i>number) {
     		  
     		  if(i<min) {
     			  
     			  min = i ;
     		  }
     	   }
    	   
       }
		
		
		
		System.out.println("The smallest nearest number of the entered numbers : "+ max);
		System.out.println("The biggest nearest number of the entered numbers : "+ min);
		
	}
}


