package com.sunbeam;

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearQueue q = new LinearQueue(5);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Push\n2. Pop\n3. Peek\n4. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
		switch(choice){
		case 1:
			if(q.isFull()) {
				System.out.println("Queue is full");
			}else {
				System.out.println("Enter value: ");
				int value = sc.nextInt();
				q.push(value);
			}break;
		case 2:
			if(q.isEmpty()) {
				System.out.println("Queue is empty: ");
			}else {
				System.out.println("Popped data: "+q.pop());
			}break;
		case 3:
			if(q.isEmpty()) {
				System.out.println("Queue is empty:");
			}else {
				System.out.println("Peeked data "+q.peek());
			}break;
			
			
		}
		}while(choice != 4);
		sc.close();
		
		

	}

}
