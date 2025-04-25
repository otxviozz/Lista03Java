//Read a vector A with 10 integer elements corresponding to the ages of a group of people.
//Write a program that determines and writes the youngest and oldest ages.
package exercises;

public class Ex18 {

	public static void main(String[] args) {
		int[] idades = {10, 22, 36, 40, 5, 80, 33, 34, 50};
		int aux = 0;

		for(int i = 0; i<idades.length - 1; i++){
			for (int j = 0; j < idades.length - 1; j++) {
			if(idades[j] > idades[j + 1]){
				aux = idades[j];
				idades[j] = idades[j+1];
				idades[j+1] = aux;
	}
	}
	}
		System.out.println("Menor idade:"+idades[0]);
		System.out.println("Maior idade:"+idades[idades.length-1]);
	}

}
