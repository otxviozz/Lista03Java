//Read a vector A with 20 elements. Construct two vectors B and C, where the even and odd values ​​of A will be stored in vectors B and C, respectively.
package lista03;

public class Ex24 {

	public static void main(String[] args) {
		int[] arrayA = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[arrayA.length];
		
		for(int i=0; i<arrayB.length; i++) {
			if(arrayA[i]%2==0) {
			arrayB[i]= arrayA[i];
			}
		}
		
		for(int i=0; i<arrayC.length; i++) {
			if(arrayA[i]%2!=0) {
			arrayC[i]= arrayA[i];
			}
		}
		
		System.out.print("\nArray A: ");
		for(int i=0; i<arrayA.length; i++) {
			System.out.print(arrayA[i]+",");
		}
		System.out.print("\nArray B: ");
		for(int i=0; i<arrayB.length; i++) {
			if(i%2!=0) {
			System.out.print(arrayB[i]+",");
			}
		}
		System.out.print("\nArray C: ");
		for(int i=0; i<arrayC.length; i++) {
			if(i%2==0) {
			System.out.print(arrayC[i]+",");
			}
		}
	}
}
