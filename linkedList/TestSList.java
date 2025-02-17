package linkedList;

public class TestSList {

	public static void main(String[] args) {
		SList sll = new SList(); // Use your custom SLinkedList

		sll.addFirst("C");
		sll.addFirst("B");
		sll.addFirst("A"); // List: A → B → C

		System.out.println("Before Removing:");
		sll.display(); // Display the list

		sll.remove(1); // Remove the node at index 1 ("B")

		System.out.println("\nAfter Removing:");
		sll.display(); // Display the list again
	}
}
