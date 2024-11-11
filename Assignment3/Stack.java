package com.sunbeam.classwork_03;

public class Stack {
private int arr[];
private int top;
private final int SIZE;

public Stack(int size) {
	SIZE = size;
	arr = new int[SIZE];
	top =-1;	
}
public void push(int value) {
	arr[top+1] = value;
	top++;
}
public int pop() {
	int temp = arr[top];
	top--;
	return temp;
}
public boolean isEmpty() {
	return top==-1;
}
public int peek() {
	if(isEmpty())
		return -1;
	return arr[top];
}
public boolean isFull() {
	return top==SIZE-1;
}





}
