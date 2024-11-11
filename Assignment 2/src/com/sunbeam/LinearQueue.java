package com.sunbeam;


public class LinearQueue {

	private int arr[];
	private int rear, front;
	private final int SIZE;
	public LinearQueue(int size) {
		SIZE = size;
		rear = front = 0;
		arr = new int[size];
	}
	public void push(int value) {
		rear++;
		arr[rear] = value;
	}
	public int pop() {
		int temp = arr[front + 1];
		front++;
		return temp;
	}
	public int peek() {
		return arr[front+1];
	}
	public boolean isFull() {
		return rear == SIZE -1;
	}
	public boolean isEmpty() {
		return rear == front;
	}
}

