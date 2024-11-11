package com.sunbeam.classwork_03;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public void deleteAll() {
		head = null;
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			return;
		head = head.next;
	}
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;
		
		else {
			Node trav = head;
			while(trav.next!=null)
				trav = trav.next;
			
			trav.next = newNode;	
		}
	}
	
	public void addMid(int value, int pos) {
		Node newNode = new Node(value);
		if(isEmpty())
			head = newNode;
		
		else if(pos <=1)
			addFirst(value);
		else {
			Node trav = head;
			int count = 0;
			while(trav.next != null )
			{
				count++;
				if(count == (pos-1)) {
					newNode.next =trav.next ;
					trav.next = newNode;
					break;
				}
				trav = trav.next;
			}
		}
	}
	
	public void deleteLast() {
		
		if(isEmpty())
			return;
		
		else if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			while(trav.next.next!=null)
				trav = trav.next;
				
			trav.next = null;
				
		}
	}
	
	public void deleteMid(int pos) {
		
		if(isEmpty())
			return;
		else if(pos<= 1)
			head = head.next;
		else {
			Node trav = head;
			int count=1;
			while(count != pos-1) {
				count ++;
				trav = trav.next;
			}
			trav.next = trav.next.next;
	}
	}
	
	public void display()
	{
		if(isEmpty())
			System.out.println("Node is Empty ");
		
		else {
			Node trav = head;
			while(trav!=null) {
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
		}
	}
	

}
