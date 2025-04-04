// Create two arrays, the first one has values, the second one you have to assign the square root of the values ​​of the first one.
package exercises;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr1 = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225};
		double[] arr2 = new double[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
		 arr2[i] =  Math.sqrt(arr1[i]);
			}
		System.out.print("Array 1: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\nArray 2: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("%.0f ", arr2[i]);
		}
	}
}
