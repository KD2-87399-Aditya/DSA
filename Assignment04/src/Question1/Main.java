package Question1;

public class Main {

	public static void main(String[] args) {
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();

		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);

		list.addLast(50);
		list.addLast(60);

		// list.addPosition(100, 1);

		// list.deleteFirst();
		// list.deleteLast();

//		list.deletePosition(2);

		list.display();
		System.out.println("List size : " + list.size());

	}

}
