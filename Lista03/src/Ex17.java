package lista03;

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
