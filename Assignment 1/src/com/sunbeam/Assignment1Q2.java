package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q2 {
		public static int linearSearch(int arr[], int key) {
			int count = 0;
			for(int i=0; i<=arr.length-1; i++) {
				count++;
				if(arr[i]==key) 
					break;
					
				
				
			}return count++;
			
			
		}
		public static int binarySearch(int arr[], int key) {
			int count = 0, left =0, right = arr.length-1, mid = 0;
			for(int i=left; i<=right; i++) {
				count++;
				mid = (left+right)/2;
				if(arr[mid]==key) { 
					break;}
				else if(key>arr[mid]) {
					left = mid+1;
				}else {
					right = mid -1;
				}
				
				
				
			}return count++;
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println("Enter key you want to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = linearSearch(arr, key);

		System.out.println("Occurence in linear search: "+ index);
		
		int ind = binarySearch(arr, key);
		System.out.println("Occurence in binary search: "+ ind);
		
		
	}

}
