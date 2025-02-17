package linkedList;

public class SList {
	private SNode head;

	public SList() {

		head = null;
	}

	// Add a node at the beginning
	public void addFirst(String n) {
		SNode newNode = new SNode(n);
		newNode.setNext(head); // Point new node to old head
		head = newNode; // Update head to new node
	}

	// Add a node at the end
	public void addLast(String n) {
		SNode newNode = new SNode(n);
		if (head == null) { // If list is empty, new node becomes head
			head = newNode;
			return;
		}
		SNode temp = head;
		while (temp.getNext() != null) { // Traverse to the last node
			temp = temp.getNext();
		}
		temp.setNext(newNode); // Set the last node's next to the new node
	}

	// Display the list
	public void display() {
		SNode temp = head;
		while (temp != null) {
			temp.displaySNode();
			temp = temp.getNext();
		}
	}

	// Remove a node at a given index
	public void remove(int i) {
		if (head == null)
			return; // If the list is empty, do nothing

		if (i == 0) { // If removing the first node
			head = head.getNext();
			return;
		}

		SNode temp = head;
		int count = 0;

		// Traverse the list to find the node before the one to remove
		while (temp != null && count < i - 1) {
			temp = temp.getNext();
			count++;
		}

		if (temp == null || temp.getNext() == null)
			return; // If out of bounds, do nothing

		temp.setNext(temp.getNext().getNext()); // Remove the node by bypassing it
	}

}
