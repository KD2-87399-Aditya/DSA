package com.sunbeam.classwork_03;

public class CircularQueue1 {
	
	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;
	private int count=0;
	
	public CircularQueue1(int size) {
		SIZE = size;
		rear = front = -1;
		arr= new int[SIZE];
	}
	
	public void push(int value) {
		arr[++rear%SIZE]=value;
		count++;
	}
	
	public int pop() {
		int temp = arr[(front+1)%SIZE];
		front = (front+1)%SIZE;
		count--;
		if(front == rear) {
		front = rear = -1;
		count=0;
		}
		return temp;	
	}
	
	public boolean isEmpty()
	{
		return front==rear && count==0;
	}
	
	public boolean isFull() {
		return front ==-1 && count==SIZE;
	}
	
	public int peek()
	{
		return arr[rear];
	}
	
	

}
