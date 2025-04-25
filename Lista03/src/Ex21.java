//Write a program that checks whether a given vector A of 10 integer elements is a palindrome or not.
package lista03;

public class Ex21 {

	public static void main(String[] args) {
		int[] palindromo = {7, 4, 9, 2, 6, 6, 2, 9, 4,7};
		int [] modelo = new int [palindromo.length];
		int aux = 1;
		
		for(int i=0; i<palindromo.length; i++) {
			modelo[i]= palindromo[palindromo.length - aux];
			aux++;
		}
	
		aux = 1;
		int iguais = 0;
		for(int i=0; i<palindromo.length; i++) {
			if(palindromo[i] == modelo[i]) {
			iguais++;
			aux++;
			}
		}
		if(iguais==10) {
			System.out.println("Esse array é palindromo!");
		}
		else {
			System.out.println("Esse array não é palindromo!");
		}
	}
}
