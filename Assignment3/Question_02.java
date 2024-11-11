package com.sunbeam.classwork_03;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		
		CircularQueue1 c = new CircularQueue1(4);
		int choice = 0 ;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
			System.out.print("Enter your choice :- ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if(c.isFull()) {
					System.out.println("Array is full ");
					break;
					}
				System.out.print("Enter Value :- ");
				int value = sc.nextInt();
				c.push(value);
				break;
			
			case 2: 
				if(c.isEmpty()) {
					System.out.println("Array is Empty ");
					break;
				}
				System.out.println("Value get poped :- "+c.pop());
				break;
			case 3:
				if(c.isEmpty()) {
					System.out.println("Queue is Empty ");
					break;
				}
				System.out.println("Peek value is :- "+c.peek());
				break;
			case 4:
				System.out.println("Thank You ");
				break;
			default:
				System.out.println("Default value ");
				break;
			}
			
		} while(choice !=4);
	}

}
