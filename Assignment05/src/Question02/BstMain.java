package Question02;

import java.util.Scanner;

public class BstMain {

	public static void main(String[] args) {
		BSTQ2 bst = new BSTQ2();
		Scanner sc = new Scanner(System.in);
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(9);
		System.out.println("Enter value: - ");
		int value = sc.nextInt();
		if((bst.binarySearch(value)!=null)){
			System.out.println("Element "+value+" Exists..");
		}else {
			System.out.println("Element "+value+" Not Exists...");
		}
		bst.inOrder();
		bst.postOrder();
		bst.preOrder();
		

	}

}
