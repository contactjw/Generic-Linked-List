
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
	
	public void printList() {
		Node<T> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		
		myList.insertEnd(1);
		myList.printList();
		myList.insertEnd(2);
		myList.insertEnd(3);
		myList.insertEnd(4);
		myList.insertEnd(5);
		myList.insertEnd(6);
		myList.insertEnd(7);
		myList.insertEnd(8);
		myList.insertEnd(9);
		myList.printList();
		
	}

}
     