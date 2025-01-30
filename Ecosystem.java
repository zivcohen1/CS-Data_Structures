package homework;

public class Ecosystem {

	public static void main(String[] args) {
		 River river = new River(10);
		 System.out.println("initial River:");
		 river.display();
		 
		 for (int i=0; i<6; i++) {
			 System.out.println("\nAfter step" + i+":");
			 river.simulateStep();
			 river.display();
		 }
		 

	}

}
