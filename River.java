package homework;

import java.util.Random;

abstract class Animal {

}

class Bear extends Animal {

}

class Fish extends Animal {

}

public class River {
	private Animal[] river;
	private Random random;
	private int size;

	public River(int size) {
		this.size = size;
		river = new Animal[size];
		random = new Random();
		initializeRiver();

	}

	public void initializeRiver() {
		for (int i = 0; i < river.length; i++) {
			int randomValue = random.nextInt(3);
			if (randomValue==1) {
				river[i] = new Bear();
			}else if (randomValue == 2) {
				river[i] = new Fish();
			}else {
				river[i] = null;
			}

		}
	}
	public void simulateStep() {
		boolean [] moved = new boolean[river.length];
		
		for (int i =0; i < river.length;i++) {
			if (river[i] != null&& !moved[i]) {
				int move =random.nextInt(3)-1; //move left, right or stay
				int newPosition = i+ move;
				
				if (newPosition>=0 && newPosition< river.length&& !moved[newPosition]) {
					if (river[newPosition] == null) {
						//move to empty space
						river[newPosition] = river[i];
						river[i] = null;
						moved[newPosition] = true;
					}else if(river[i] instanceof Bear && river[newPosition] instanceof Fish) {
						//bear eats fish
						river[newPosition]=river[i];
						river[i] = null;
						moved[newPosition] = true;
					}else if (river[i].getClass() == river[newPosition].getClass()) {
						//reproduce new animal if same type
						spawnNewAnimal(i);
						 
					}
				}
				
			}
		}
	}

	private void spawnNewAnimal(int parentIndex) {
		int left = parentIndex -1;
		int right = parentIndex +1;
		if (left >= 0 && river[left] == null) {
	        river[left] = (random.nextBoolean()) ? new Bear() : new Fish();
	    } else if (right < river.length && river[right] == null) {
	        river[right] = (random.nextBoolean()) ? new Bear() : new Fish();
	    }
		
		
	}
	public void display() {
		for (Animal animal:river) {
			if(animal instanceof Bear) {
				System.out.print("B ");
			}else if (animal instanceof Fish) {
				System.out.print("F ");
			}else {
				System.out.print("- ");
			}
		}
		System.out.println();
	}
	

}
