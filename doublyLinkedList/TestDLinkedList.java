package doublyLinkedList;

public class TestDLinkedList {

	public static void main(String[] args) {
		 DLinkedList DList = new DLinkedList();
		 DList.addFirst("Ziv");
		 DList.addFirst("Roy");
		 DList.addFirst("Ben");
		 DList.addFirst("Avi");
		 
		 DList.addLast("Ronen");
		 DList.addLast("Anat");
		 
		 DList.display();
		 DList.displayR();
	}

}
