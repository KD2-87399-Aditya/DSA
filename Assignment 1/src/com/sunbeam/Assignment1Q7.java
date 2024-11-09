package com.sunbeam;

public class Assignment1Q7 {
	public static int linearSearch(int arr[], int key) {
		int count = 0, i;
		for(i = 0; i<=arr.length-1;i++) {
			if(key >= arr[i]) {
				count++;
			
							
				
		}
		
		}return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 15, 3, 4, 4, 1};
		System.out.println(linearSearch(arr, 20));

	}

}
