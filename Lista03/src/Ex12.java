//Create a vector A with 10 integer elements. Implement a program that
//defines and writes the sum of all the elements stored in this vector.
package exercises;

public class Ex12 {

	public static void main(String[] args) {
		int[] array = {4, 7, 10, 13, 16, 19, 22, 25, 28, 31};
		int result=0;
		
		for(int i=0; i<array.length; i++) {
			result = result + array[i];
		}
		System.out.println("O resultado da soma de todos os vetores do array é: "+result+".");
	}
}
