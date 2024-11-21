package com.sunbeam.p1;

import java.util.ArrayList;

class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

   
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) > heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    
    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int largest = index;

            if (leftChild < size && heap.get(leftChild) > heap.get(largest)) {
                largest = leftChild;
            }
            if (rightChild < size && heap.get(rightChild) > heap.get(largest)) {
                largest = rightChild;
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    
    public void push(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

  
    public int pop() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heapifyDown(0);
        }
        return maxValue;
    }

    
    public int top() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }
        return heap.get(0);
    }

    
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        maxHeap.push(20);
        maxHeap.push(15);
        maxHeap.push(30);
        maxHeap.push(10);

        System.out.println("Priority Queue using Max Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.pop() + " ");
        }
    }
}
