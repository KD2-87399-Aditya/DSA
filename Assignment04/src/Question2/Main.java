package Question2;

public class Main {

	public static void main(String[] args) {
		LinkedList stack = new LinkedList();
		System.out.println("Stack implementation...");
		stack.addFirst('K');
		stack.addFirst('C');
		stack.addFirst('A');
		stack.addFirst('T');
		stack.addFirst('S');
		stack.fDisplay();
		stack.deleteFirst();
		stack.fDisplay();
		
		System.out.println("Queue Implementation...");
		LinkedList queue = new LinkedList();
		queue.addLast('Q');
		queue.addLast('U');
		queue.addLast('E');
		queue.addLast('U');
		queue.addLast('E');
		queue.fDisplay();
		queue.deleteLast();
		queue.fDisplay();
	}

}
