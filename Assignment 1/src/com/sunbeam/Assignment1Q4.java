package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q4 {

	public static int binarySearch(int arr[], int key) {
		int  left =arr.length-1, right = 0, mid = 0;
		for(int i=left; i<=right; i++) {
			
			mid = (left+right)/2;
			if(arr[mid]==key) { 
				break;}
			else if(key>arr[mid]) {
				left = mid+1;
			}else {
				right = mid -1;
			}
			
			
			
		}return mid;
		
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = {1,2,3,4,5};
	System.out.println("Enter key you want to search: ");
	Scanner sc = new Scanner(System.in);
	int key = sc.nextInt();
	

	
	
	int ind = binarySearch(arr, key);
	System.out.println("Occurence in binary search: "+ ind);
	
	
}

}
