//Create a vector A with 10 integer elements. Write a program that
//prints each element of vector A and the relation of all pairs from 0 to the
//respective element.
package lista03;

public class Ex26 {

	public static void main(String[] args) {
		int [] array= {11,12,13,14,15,16,17,18,19,20};
		int aux=0;
		
		for(int i=0; i<array.length; i++) {
			aux=0;
			System.out.println("Número: "+array[i]);
			System.out.print("Os pares entre 0 e "+array[i]+" são: ");
			while(aux<=array[i] && aux%2==0) {
				System.out.print(aux+", ");
				aux= aux+2;
			}
			System.out.println("\n");
		}
		
	}

}
