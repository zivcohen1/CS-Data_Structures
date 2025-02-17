package CircularlyLinkedList;

public class CircularSingleLinkedList {
	private Node current;
	
	public CircularSingleLinkedList() {
		current = null;
	}
	public void display() {
		if (current == null) {
			return;
		}
		Node temp = current;
		do {
			temp.display();
			temp =temp.getNext();
		}
		while (temp != current);
	}
	public void addNext(String n) {
		Node temp = new Node(n);
		
		if (current == null) {
			temp.setNext(temp);
			current = temp;
			return;
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
	}
	
	public void deleteCurrent() {
		if(current == null) {
			return;
		}
		Node prev = current;
		
		while(prev.getNext()!=current) {
			prev = prev.getNext();
		}
		
		prev.setNext(current.getNext());
		current.setNext(null);
		current = prev.getNext();
	}

}
