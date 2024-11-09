package com.sunbeam;

import java.util.Optional;

public class Assignment1Q3 {
	int empid;
	String name;

	@Override
	public String toString() {
		return "Assignment1Q3 [empid=" + empid + ", name=" + name + "]";
	}

	public Assignment1Q3(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void binarySearch(Assignment1Q3[] arr,  int key) {
		int left = 0, right = arr.length-1,mid = 0;
		for(int i = left; i<=right;i++) {
			mid = (left+right)/2;
			if(key==arr[mid].empid) {
				break;
				
				
			}else if(key > arr[mid].empid) {
				left = mid + 1;
				
			}else {
				right = right - 1;
			}
		}System.out.println("index of key: "+mid);
		
	}
	public static void binarySearchName(Assignment1Q3[] arr, String key) {
		int i = 0;
		while(i <= arr.length-1) {
			if(arr[i].name==key) {
				System.out.println("index of your search: "+i);
				break;
			}i++;
		
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Assignment1Q3[] arr = {new Assignment1Q3(1, "Aditya"),new Assignment1Q3(2, "Aman"), new Assignment1Q3(3,"Yagyawalky"), new Assignment1Q3(4, "Abhishek")};
		binarySearchName(arr, "Aditya");
		binarySearch(arr, 3);
	}

}
