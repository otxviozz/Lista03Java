// Create two arrays, the first and the second one has values, and the third has to be the result of array1*array2
package exercises;

public class Ex8 {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] arr3 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			 arr3[i] =  arr1[i]*arr2[i];
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