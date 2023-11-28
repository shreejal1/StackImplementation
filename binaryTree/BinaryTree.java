package binaryTree;

import java.util.Scanner;


class Node{
	//null at initial phase
	Node left, right;
	int data;

	//constructor
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;
	
	BinaryTree(){
		Scanner sc = new Scanner(System.in);
		root = add(sc);
	}

	//function add() using recursion for adding data for left and right nodes
	Node add(Scanner sc) {
		int data = sc.nextInt();

		if(data == -1) {
			return null;
		}
		Node n = new Node(data);
		n.left = add(sc);
		n.right = add(sc);

		return n;
	}
	
	void display() {
//		preorder(root);
//		inorder(root);
//		postorder(root);
		
	}
	void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.right);
		postorder(root.left);
		System.out.println(root.data);
	}
	
}