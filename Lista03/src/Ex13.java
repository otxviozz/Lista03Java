package exercises;

public class Ex13 {

	public static void main(String[] args) {
		int[] array = {5, 8, 10, 13, 15, 17, 20, 23, 27, 30};
		
		System.out.print("Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\nNúmeros múltiplos de 5: ");
		for(int i=0; i<array.length;i++) {
			if(array[i]%5==0) {
				System.out.print(array[i]+" ");
			}
		}
	}

}
