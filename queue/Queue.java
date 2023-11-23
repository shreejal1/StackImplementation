package queue;

public class Queue {
	int rear = -1;
	int size;
	int array[];
	Queue(int n){
		array = new int[n];
		this.size = n;
	}

	//function to check whether the queue is empty
	public boolean isEmpty() {
		return rear == -1;
	}

	//function to add an item in the queue
	public void enqueue(int data) {
		if(rear == (size-1)) {
			System.out.println("Queue is full");
			return;
		}
		rear++;
		array[rear] = data;
	}

	//function to remove the first item in the queue(front), and arrange the queue in right order again
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Stack is empty");		
			return -1;
		}
		
		int front = array[0];
		for(int i = 0; i<rear; i++) {
			array[i] = array[i+1];
		}
		rear--;
		return front;
	}
	
	//function to show the first item in the queue (front)
	public int peekFirst() {
		if(isEmpty()) {
			System.out.println("Stack is empty");		
			return -1;
		}
		return array[0];
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(4);
		//test
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		//while loop to peek & dequeue the front item, until the queue is empty
		while(!q.isEmpty()) {
			System.out.println(q.peekFirst());
			q.dequeue();
		}
	}
}