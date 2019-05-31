package core;

import java.util.ArrayList;
import java.util.Scanner;

public class arrays {
	
	int size, sum =0;
	int arr[]=new int [size];
	
	Scanner scan = new Scanner(System.in);
	
	
	public void sum() {
		
				
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		//2
		
		System.out.println("Enter array elements:");
		
		for(int i=0;i<size;i++) {
			
			arr[i]= scan.nextInt();//10,3
			sum= sum+arr[i];//0+10,10+3
		
	}
		
	}

	public static void main(String[] args) {
		
		int size, sum =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		size=scan.nextInt();
		int arr[]=new int [size];//2
		
		System.out.println("Enter array elements:");
		
		for(int i=0;i<size;i++) {
			
			arr[i]= scan.nextInt();//10,3
			sum= sum+arr[i];//0+10,10+3
		}
		
		System.out.println("sum is" + sum);
		System.out.println(arr[2]);
		 

	}

}
