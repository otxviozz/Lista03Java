package exercises;

public class Ex11 {

	public static void main(String[] args) {
		int[] array = {4, 7, 10, 13, 16, 19, 22, 25, 28, 31};
		int par=0;
		
		System.out.print("Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\nNúmeros pares: ");
		for(int i=0; i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
				par= par+1;
			}
		}
		System.out.print("\nQuantidade de números pares: "+par+".");
	}

}
