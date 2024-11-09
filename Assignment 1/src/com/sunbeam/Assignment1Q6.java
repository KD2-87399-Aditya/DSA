package com.sunbeam;

public class Assignment1Q6 {
	public static int linearSearch(int arr[]) {
		int count, i;
		for(i = 0; i<=arr.length-2;i++) {
			count =0;
			for(int j = i+1; j<=arr.length-1;j++) {
				if(arr[j] == arr[i]) {
					count++;
					continue;
				
				}
			
			}if(count == 0) {
//				System.out.println(arr[i]);
				return(arr[i]);
				
				
		}
		}return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		System.out.println(linearSearch(arr));
		

	}

}

