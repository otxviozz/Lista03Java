//Create a vector A with 10 integer elements. Construct a vector B of the same type and size,
//with each element of vector B being the remainder of the division of the respective element of A by 2 (two).
package exercises;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr1 = {5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
		 arr2[i] =  arr1[i]%2;
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
