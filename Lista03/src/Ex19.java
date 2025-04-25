//Randomly generate a vector A with 10 integer elements equal to 0 or 1.
//Implement a program that determines the percentage of 0's and 1's in vector A.
package exercises;

public class Ex19 {

	public static void main(String[] args) {
		int [] array = new int[10];
		int zero = 0;
		int um = 0;
		double porcentagemzero = 0;
		double porcentagemum = 0;
		
		for(int i=0; i<array.length; i++) {
			array[i]= (int)(Math.random() * 2);
		}
		for(int i=0; i<array.length; i++) {
			if(array[i] == 0) {
				zero = zero + 1;
			}
			else {
				um = um +1;
			}
		}
		porcentagemzero = ((double) zero / array.length) * 100;
		porcentagemum = ((double) um / array.length) * 100;
		
		System.out.print("Array: ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+",");
		}
		System.out.println("\n");
		System.out.println(porcentagemzero+"% é a porcentagem de números 0 nesse array.");
		System.out.println(porcentagemum+"% é a porcentagem de números 1 nesse array.");
	}
}
