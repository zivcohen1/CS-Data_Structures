package exercise;

import java.util.*;

public class OrderedArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] randNum =new int [10];
		
		for(int i=0; i<randNum.length; i++) {
			System.out.print("Please enter a number: ");
			randNum[i] = sc.nextInt();
		}
			for (int i=0;i<randNum.length; i++) {
				 
					int temp = randNum[i];
					int j=i-1;
				
			while (j>=0 && randNum[j]>temp) {
				randNum[j+1] =randNum[j];
				j--;
				
			}
			randNum[j+1]=temp;
			}
	for(int num:randNum){
	
		System.out.print(num + " ");
	}
	sc.close();

}
}