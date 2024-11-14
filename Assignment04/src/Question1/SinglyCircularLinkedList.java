package Question1;

public class SinglyCircularLinkedList {

	
		static class Node{
			private int data;
			private Node next;
			public Node(int value) {
				data = value;
				next = null;
			}
		}

		private Node tail;
		private int size;
		public SinglyCircularLinkedList() {
		    tail = null;
			size = 0;
		}
		
		public boolean isEmpty() {
			return tail == null;
		}
		
		public int size() {
			return size;
		}
		
		public void addFirst(int value) {
			Node newnode = new Node(value);			
			if(isEmpty()) {
				tail = newnode;
				tail.next = tail;
			}
			else {	
				newnode.next = tail.next;
				
				tail.next = newnode;				
			}
			size++;
		}
		
		public void addLast(int value) {
			Node newnode = new Node(value);
			if(isEmpty()) {
				tail.next = tail = newnode;
				tail.next = tail.next;
			}
			else {
				newnode.next = tail.next;
				tail.next = newnode;
				tail = newnode;
			}
			size++;
		}
		
		public void addPosition(int value, int pos) {
			if(pos < 1 || pos > size + 1)
				return;
			Node newnode = new Node(value);
			if(size == 0) {
				tail.next = tail = newnode;
				tail.next = tail.next;
			}
			else if(pos == 1) {
				addFirst(value);
				return;
			}
			else if(pos == size + 1) {
				addLast(value);
				return;
			}
			else {
				Node trav = tail.next;
				for(int i = 1 ; i < pos - 1 ; i++)
					trav = trav.next;
				newnode.next = trav.next;
				trav.next = newnode;
			}
			size++;
		}
		
		public void deleteFirst() {
			if(size == 0)
				return;
			else if(size == 1)
				tail.next = tail = null;
			else {
				tail.next = tail.next.next;
				tail.next = tail.next.next;
			}
			size--;
		}
		
		public void deleteLast() {
			if(size == 0) 
				return;
			else if(tail.next == tail)
				tail.next = tail = null;
			else {
				Node trav = tail.next;
				while(trav.next.next != tail.next)
					trav = trav.next;
				trav.next = tail.next;
				tail = trav;
			}
			size--;
		}
		
		public void deletePosition(int pos) {
			if(pos < 1 || pos > size)
				return;
			if(tail.next == null && tail == null)
				return;
			else if(tail.next.next == tail.next)
				tail.next = tail = null;
			else if(pos == 1) {
				deleteFirst();
				return;
			}
			else if(pos == size) {
				deleteLast();
				return;
			}
			else {
				Node trav = tail.next;
				for(int i = 1 ; i < pos - 1 ; i++)
					trav = trav.next;
				trav.next = trav.next.next;
			}
			size--;
		}
		
		public void display() {
			if(isEmpty())
				return;
			Node trav = tail.next;
			System.out.print("List : ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}while(trav != tail.next);	
			System.out.println();
			System.out.println("last node = " + tail.data);
		}
		
		public void deleteAll() {
			tail.next = tail = null;
			size = 0;
		}
		
		
	}

	

