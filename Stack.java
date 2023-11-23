import java.util.Scanner;

public class Stack{
	int top;
	int capacity;
	int[] stack;
	
	//creating constructor for initializing the values to the variables declared
	Stack(){
		top = -1;
		capacity = 5;
		stack = new int[capacity];
	}
	
	//method to return true if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void status() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}else if(top == (capacity -1)) {
			System.out.println("Stack is full -> " + (top+1) + " item(s)");
			for(int i = 0;i<=top;i++) {
				System.out.println(stack[i]);
			}
		}else {
			System.out.println("Items in stack: "+ (top+1) + " item(s)");
			for(int i = 0;i<=top;i++) {
				System.out.println(stack[i]);
			}
		}
	}
	public void push(int data) {
		if(top == (capacity - 1)){
			System.out.println("Stack FUll");
			}else {
		stack[++top] = data;
			}
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
		System.out.println(stack[top--]);
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
		System.out.println(stack[top]);
		}
	}
	
    public static void main(String args[]){
        	Stack st = new Stack();
        	Scanner sc = new Scanner(System.in);
        	while(true) {
	        	System.out.println("Enter your target:\nPush\nPop\nPeek\nStatus");
	        	String option = sc.next();
	        	switch(option) {
	        	case "Push":
	        		System.out.println("Enter the number:");
	        		int pValue = sc.nextInt();
	        		st.push(pValue);
	        		break;
	        	case "Pop":
	        		st.pop();
	        		break;
	        	case "Peek":
	        		st.peek();
	        		break;
	        	case "Status":
	        		st.status();
	        		break;
	        	default: System.out.println("Error in option");
	        	}
	        	System.out.println("Continue or exit (c / e)?");
	        	String exit = sc.next();
	        	if(exit.equals("c")) {
	        		continue;
	        	}else {
	        		break;
	        	}
        	}
        }
}  