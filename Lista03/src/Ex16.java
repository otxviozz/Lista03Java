package exercises;

public class Ex16 {

	public static void main(String[] args) {
		int[] array = {8, 12, 15, 7, 20, 18, 14, 16, 5, 22};
		int soma = 0;
		int quantidade = 0;
		int denominador = 0;
		int numerador = 0;
		int media = 0;
		
		for (int i=0; i<array.length; i++) {
			if(array[i]<15) {
				soma = soma + array[i];
			}
			else if(array[i]==15) {
				quantidade = quantidade + 1;
			}
			else if(array[i]>15) {
				numerador = numerador + array[i];
				denominador = denominador + 1;
			}
		}
		media = numerador/denominador;
		
		System.out.println("Soma de elementos armazenados neste vetor que são inferiores a 15: "+soma+".");
		System.out.println("Quantidade de elementos armazenados no vetor que são iguais a 15: "+quantidade+".");
		System.out.println("Média dos elementos armazenados no vetor que são superiores a 15: "+media+".");
	}
}
