//Read two vectors A and B with 10 elements each. Construct a vector C, which is the union of the other two vectors.
package exercises;

public class Ex23 {

	public static void main(String[] args) {
		int [] arrayA = {1,2,3,4,5,6,7,8,9,10};
		int [] arrayB = {11,12,13,14,15,16,17,18,19,20};
		int [] arrayC = new int [arrayA.length+arrayB.length];
		
		for(int i=0; i<arrayA.length; i++) {
			arrayC[i] = arrayA[i];
		}
		for(int i=0; i<arrayB.length; i++) {
			arrayC[i+10] = arrayB[i];
		}
		System.out.print("Array C: ");
		for(int i=0; i<arrayC.length; i++) {
			System.out.print(arrayC[i]+",");
		}
	}

}
