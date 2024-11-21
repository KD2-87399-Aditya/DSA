package com.sunbeam.p1;

import java.util.ArrayList;

class MinHeap {
    private ArrayList<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) < heap.get(parent)) {
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
            int smallest = index;

            if (leftChild < size && heap.get(leftChild) < heap.get(smallest)) {
                smallest = leftChild;
            }
            if (rightChild < size && heap.get(rightChild) < heap.get(smallest)) {
                smallest = rightChild;
            }
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
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

    
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

   
    public int extractMin() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }
        int minValue = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heapifyDown(0);
        }
        return minValue;
    }
}

public class HeapSortUsingMinHeap {
   
    public static void heapSort(int[] arr) {
        MinHeap minHeap = new MinHeap();

     
        for (int value : arr) {
            minHeap.insert(value);
        }

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minHeap.extractMin();
        }
    }

    public static void main(String[] args) {
        int[] arr = {20, 15, 10, 30, 5};

        System.out.println("Original Array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

    
        heapSort(arr);

        System.out.println("Sorted Array:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
