package binaryTree;

import java.util.Scanner;

public class BinaryTree {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = add();
		System.out.println("Root item: "+ root.data);
		
	}


	//function add() using recursion for adding data for left and right nodes
	static Node add() {
		Node root = null;
		System.out.println("Enter a data: ");
		int data = sc.nextInt();

		if(data == -1) {
			return null;
		}
		root = new Node(data);
		System.out.println("Enter left item for "+ data);
		root.left = add();

		System.out.println("Enter right item for "+ data);
		root.right = add();

		return root;
	}

}

class Node{
	//null at initial phase
	Node left, right;
	int data;

	//constructor
	public Node(int data) {
		this.data = data;
	}
}
