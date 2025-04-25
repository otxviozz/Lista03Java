//Create two vectors A and B each with 10 integer elements. Construct a
//vector C, where each element of C is the division of the respective elements in
//A and B.
package exercises;

public class Ex9 {

	public static void main(String[] args) {
		int [] arr1 = {12, 18, 20, 28, 30, 36, 40, 45, 48, 54};
		int []arr2 = {3, 3, 4, 7, 5, 6, 8, 9, 6, 6};
		int[] arr3 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			 arr3[i] =  arr1[i]/arr2[i];
				}
			System.out.print("Array 1: ");
			for(int i=0; i<arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
			System.out.print("\nArray 2: ");
			for(int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i] + " ");
			}
			System.out.print("\nArray 3: ");
			for(int i=0; i<arr3.length; i++) {
				System.out.print(arr3[i] + " ");
			}
	}
}

