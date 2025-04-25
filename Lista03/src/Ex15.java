//Create a vector A with 10 integer elements. Develop a program that
//defines the percentage of even and odd elements, respectively,
//stored in this vector.
package exercises;

public class Ex15 {

	public static void main(String[] args) {
		int[] array = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};
		int par=0;
		int impar=0;
		
		System.out.print("Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
			par= par+10;
			}
			else {
			impar= impar +10; 
			}
		}
		System.out.println("\nDessa array, "+par+"% é par e "+impar+"% é ímpar.");
	}

}
