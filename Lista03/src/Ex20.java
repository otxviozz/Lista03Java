//Create a vector A with 10 integer elements.
//Develop a program that checks if "all" the elements of vector A are even.
//If at least one element of the vector is not even, the repetition process stops going through the elements of the vector and must be terminated.
package exercises;

public class Ex20 {

	public static void main(String[] args) {
		int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		boolean pares=false;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				pares= true;
			}
			else {
				pares= false;
				break;
			}
		}
		if(pares == true) {
		System.out.println("Este array contém somente números pares!");
	}
		else {
			System.out.println("Este array contém números pares e ímpares!");
		}
	}
}
