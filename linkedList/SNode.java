package linkedList;

public class SNode {

	private String data; // Holds the data of the node
	private SNode next; // Reference to the next node in the list

	// Constructor to create a new node with data
	public SNode(String data) {
		this.data = data;
		this.next = null; // Initially, next is null (last node in the list)
	}

	// Getters and Setters
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public SNode getNext() {
		return next;
	}

	public void setNext(SNode next) {
		this.next = next;
	}

	// Method to display the data of the node
	public void displaySNode() {
		System.out.print(data + " → ");
	}
}
