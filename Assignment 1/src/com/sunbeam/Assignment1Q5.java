	package com.sunbeam;

	import java.util.Scanner;

	public class Assignment1Q5 {
		public static int linearSearch(int arr[], int key) {
			int count = 0;
			for(int i=0; i<=arr.length-1; i++) {
				count++;
				if(arr[i]==key) 
					break;
					
				
				
			}return count++;
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {1,2,3,4,5};
			System.out.println("Enter key you want to search: ");
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			
			int i = linearSearch(arr, key);
			System.out.println("No of occurence "+i);
			
			
		}

	}


