// Create two arrays, the first one has values, the second one you have to assign the same values as the first one.
package exercises;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
		 arr2[i] =  arr1[i];
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
