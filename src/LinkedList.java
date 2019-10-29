
public class LinkedList<T> {
	Node<T> head;
	
	public void insert (T value) {
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
		
		myList.insert(1);
		myList.printList();
		myList.insert(2);
		myList.insert(3);
		myList.insert(4);
		myList.insert(5);
		myList.insert(6);
		myList.insert(7);
		myList.insert(8);
		myList.insert(9);
		myList.printList();
		
	}

}
     