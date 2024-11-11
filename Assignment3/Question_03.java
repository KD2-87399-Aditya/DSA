package com.sunbeam.classwork_03;

public class Question_03 {
	
public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		//10 20 30 40
		
		l1.addLast(50);
		l1.addLast(60);
	
		l1.deleteFirst();
		l1.deleteLast();
		
		l1.addMid(100, 1);
		
		l1.deleteMid(3);
		
		l1.display();

	}

}
