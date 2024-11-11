package com.sunbeam.classwork_03;

public class Question_01 {

	public static void main(String[] args) {
		
		int[] arr = {11,22,33,44,55,66,77,88,99};
		Stack s = new Stack(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			s.push(arr[i]);
		}
		System.out.println();
		for(int i =0;i<arr.length;i++) {
			arr[i]= s.pop();
			System.out.print(arr[i]+" ");
	}

}
}
