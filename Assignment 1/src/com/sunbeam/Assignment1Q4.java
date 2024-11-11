package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q4 {

	public static int binarySearch(int arr[], int key) {
		int  left =arr.length-1, right = 0, mid = 0;
		while(left>=right) {
			
			mid = (left+right)/2;
			if(key== arr[mid]) { 
				return mid;}
			else if(key<arr[mid]) {
				right = mid+1;
			}else if(key>arr[mid]) {
				left = mid -1;
			}
			}
			
			
			
		return -1;
		
		
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = {5,4,3,2,1};
	System.out.println("Enter key you want to search: ");
	Scanner sc = new Scanner(System.in);
	int key = sc.nextInt();
	

	
	
	int ind = binarySearch(arr, key);
	System.out.println("Occurence in binary search: "+ ind);
	
	
}

}
