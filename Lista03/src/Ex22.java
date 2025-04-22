package lista03;

public class Ex22 {

	public static void main(String[] args) {
		int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		int [] contrario = new int [array.length];
		int aux = 1;
		
		for(int i=0; i<array.length; i++) {
			contrario[i]= array[array.length - aux];
			aux++;
		}
		
		System.out.print("Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+",");
		}
		
		System.out.print("\nArray ao contrário: ");
		for(int i=0; i<contrario.length; i++) {
			System.out.print(contrario[i]+",");
		}
	}
}
