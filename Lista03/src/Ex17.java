//Read a vector A with 10 integer elements corresponding to the ages of a group of people. 
//Write a program that determines and writes the number of people who are over 35 years old.
package exercises;

public class Ex17 {

	public static void main(String[] args) {
		int[] idades = {10, 22, 36, 40, 5, 80, 33, 34, 50};
		int quantidade = 0;

		for(int i=0; i<idades.length; i++) {
			if(idades[i]> 35) {
				quantidade = quantidade +1;
			}
		}
		System.out.println("O número de pessoas com mais de 35 anos é "+quantidade+".");
	}

}
