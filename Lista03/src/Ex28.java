package lista03;

public class Ex28 {

	public static void main(String[] args) {
		int[] array1 = {3, 7, 12, 5, 8, 10, 21, 30, 18, 25};
		int[] array2 = {4, 8, 10, 15, 22, 12, 33, 7, 40, 50};
		int[] array3 = new int [array1.length];
		int aux=0;
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array1.length; j++) {
				if(array1[i]==array2[j]) {
					array3[aux]=array1[i];
					aux++;
				}
			}
		}
		System.out.print("\nArray 1: ");
		for(int i=0; i<array1.length; i++) {
			System.out.print(array1[i]+",");
		}
		System.out.print("\nArray 2: ");
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+",");
		}
		System.out.print("\nArray 3: ");
		for(int i=0; i<aux; i++) {
			System.out.print(array3[i]+",");
	}
}
}
