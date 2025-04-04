package exercises;

public class Ex14 {

	public static void main(String[] args) {
		int[] array = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};
		int impares=0;
		int denominador=0;
		
		System.out.print("Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2!=0) {
				impares = impares + array[i];
				denominador= denominador+1;
			}
		}
		double media= impares/denominador;
		System.out.printf("\nA média dos números ímpares desse array é %.2f\n",media);
	}

}
