package Question2;

public class LinkedList {
	static class Node{
		private char data;
		private Node next, prev;
		public Node(char value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head, tail;
	private int size;
	public LinkedList() {
		head = tail = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
		//return size == 0;
	}
	
	public int getHeadData() {
		return head.data;
	}
	
	public void addFirst(char value) {
		Node nn = new Node(value);
		
		if(isEmpty())
			head = tail = nn;
		else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
		size++;
	}
	
	public void addLast(char value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = tail = nn;
		else {
			nn.prev = tail;
			tail.next = nn;
			tail = nn;
		}
		size++;
	}
	
	public void addPosition(char value, int pos) {
		if(pos < 1 || pos > size + 1)
			return;
		Node nn = new Node(value);
		if(isEmpty())
			head = tail = nn;
		else if(pos == 1) {
			addFirst(value);
			return;
		}
		else if(pos == size + 1) {
			addLast(value);
			return;
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			nn.next = trav.next;
			nn.prev = trav;
			trav.next = nn;
			nn.next.prev = nn;
		}
		size++;
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(size == 1)
			head = tail = null;
		else {
			head.next.prev = null;
			head = head.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(size == 1)
			head = tail = null;
		else {
			tail.prev.next = null;
			tail = tail.prev;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos > size)
			return;
		if(isEmpty())
			return;
		else if(head.next == null)
			head = tail = null;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		else if(pos == size) {
			deleteLast();
			return;
		}
		else {
			Node trav = head;
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
		size--;
	}
	
	public void fDisplay() {
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void bDisplay() {
		Node trav = tail;
		System.out.print("Backword List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println();
	}
	
	public int size() {
		return size;
	}
	
	public void deleteAll() {
		head = tail = null;
		size = 0;
	}
	
}
