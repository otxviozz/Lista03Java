// Create two arrays, the first one has values, the second one you have to assign the square of the values ​​of the first one.
package exercises;

public class Ex3 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
		 arr2[i] =  arr1[i]*arr1[i];
			}
		System.out.print("Array 1: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\nArray 2: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
