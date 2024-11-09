package com.sunbeam;

import java.util.Scanner;

public class Assignment1Q1 {
	public static int linearSearch(int arr[], int key) {
		int count = 0;
		for(int i=0; i<=arr.length-1; i++) {
			count++;
			if(arr[i]==key) 
				return i;
				
			
			
		}return -1;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println("Enter key you want to search: ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = linearSearch(arr, key);
		
		if(index == -1) {
			System.out.println("Key index not found ");
		}else {
			System.out.println("index of key: "+ index);
		}
		
		
	}

}
