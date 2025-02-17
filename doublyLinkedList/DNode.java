package doublyLinkedList;

public class DNode {
	private String name;
	private DNode prev;
	private DNode next;
	
	public DNode(String s) {
		 name= s;
		 prev= null;
		 next = null;
	}
	public DNode(String s, DNode p, DNode n) {
		name= s;
		prev = p;
		next = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DNode getPrev() {
		return prev;
	}
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
	public void displayDNode() {
		System.out.print(name+" ");
	}
	
	}


