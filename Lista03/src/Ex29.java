package lista03;

public class Ex29 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] array2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int[] array3 = new int [array1.length];
		int aux=0;
		boolean encontrado = false;
		
		for(int i=0; i<array1.length; i++) {
			encontrado= false;
			for(int j=0; j<array1.length; j++) {
				if(array1[i]==array2[j]) {
					encontrado = true;
				}
			}
			if(encontrado== false) {
				array3[aux]= array1[i];
				aux++;
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
