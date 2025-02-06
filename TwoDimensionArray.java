package exercise;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] y = new int[10][10];
		int max = y[0][0];
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {

				int randInt = (int) (Math.random() * 100);

				if (randInt > max) {
					max = randInt;
				}
			}
		}
		System.out.print("The largest number is: " + max);
	}

}
