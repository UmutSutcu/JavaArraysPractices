package java101;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in) ;
		System.out.print("dizinin boyutu :  ");
		int n = sc.nextInt() ;
		 
		int [] array = new int [n] ;
		
		for(int i = 1 ; i <= n+1 ; i++) 
		{
			System.out.print( i+ ". elemanı giriniz : ");
			
			 array[i] = sc.nextInt() ;
		}
		
		int arrayLen = array.length;
		
		
		System.out.println(arrayLen);
 	    Arrays.sort(array);
 	
		
		System.out.println(Arrays.toString(array));
		
	}

}
