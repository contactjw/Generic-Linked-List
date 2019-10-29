import java.util.*;

public class LinkedList<T> {
	Node<T> head;
	
	public void insertEnd(T value) {
		Node<T> newNode = new Node<T>();
		Node<T> current = head;
		newNode.data = value;
		newNode.next = null;
		
		if (head == null)
			head = newNode;
		else {
			
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} 
		else {
			Node current = head;
			Node temp = null;
			for (int i = 0; i < index - 2; i++) {
				current = current.next;
			}
			temp = current.next;
			current.next = temp.next;
		}
	}
	
	public void printList() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	

	
	public static void main(String[] args) {
		// Needed for random integer generation
		Random rand = new Random();  
		
		// Create the linked lists
		LinkedList<Integer> intList = new LinkedList<Integer>();
		LinkedList<String> stringList = new LinkedList<String>();

		// insert random integers (0-100) into intList
		for (int i = 0; i < 10; i++) {
			int randInt = rand.nextInt(101); 
			intList.insertEnd(randInt);
		}
		intList.printList();
		
		// Tokenize the string
		StringTokenizer myString = 
	             new StringTokenizer("This is the string we are tokenizing!", " "); 
	        while (myString.hasMoreTokens()) 
	            stringList.insertEnd(myString.nextToken());
	    stringList.printList();
		
	    
	}

}
     