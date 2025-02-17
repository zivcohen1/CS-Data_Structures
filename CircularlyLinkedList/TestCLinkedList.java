package CircularlyLinkedList;

public class TestCLinkedList {

	public static void main(String[] args) {
		 
		CircularSingleLinkedList CList = new CircularSingleLinkedList();
		
		CList.addNext("Avi");
		CList.addNext("Ben");
		CList.addNext("Roy");
		CList.addNext("Ziv");
		
		CList.display();
		
		CList.deleteCurrent();
		CList.display();
		 
		
	}

}
