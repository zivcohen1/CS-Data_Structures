package doublyLinkedList;

public class DLinkedList {
	private DNode head;
	private DNode tail;

	public DLinkedList() {
		head = null;
		tail = null;
	}

	public void addFirst(String n) {// insert before the head
		DNode newNode = new DNode(n);// create a node with string n
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode; // set new head
		newNode.setPrev(null);
	}

	public void display() {// from head to tail
		DNode temp = head;
		while (temp != null) {
			temp.displayDNode();
			temp = temp.getNext();
		}
	}

	public void displayR() { // from tail to head
		DNode temp = tail;
		while (temp != null) {
			temp.displayDNode();
			temp = temp.getPrev();
		}
	}
	public void addLast(String n) {
		DNode newNode = new DNode(n);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.setPrev(tail);
		tail.setNext(newNode);
		tail = newNode;         // set new tail
		
	}
	public void remove(int i) {
	    if (head == null) return; // If the list is empty, nothing to remove.

	    DNode temp = head;
	    int count = 0;

	    // Traverse the list to find the node at index `i`
	    while (temp != null && count < i) {
	        temp = temp.getNext();
	        count++;
	    }

	    if (temp == null) return; // If `i` is out of bounds, do nothing.

	    // If it's the first node (head)
	    if (temp == head) {
	        head = head.getNext(); // Move head forward
	        if (head != null) head.setPrev(null);
	    } 
	    // If it's the last node (tail)
	    else if (temp == tail) {
	        tail = tail.getPrev();
	        if (tail != null) tail.setNext(null);
	    } 
	    // If it's a middle node
	    else {
	        temp.getPrev().setNext(temp.getNext());
	        temp.getNext().setPrev(temp.getPrev());
	    }
	}




	}

