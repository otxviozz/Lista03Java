//Create a vector A with 15 integer elements. Construct a vector B of the same size,
//with each element of vector B being the factorial of the corresponding element in A.
package lista03;

public class Ex27 {

	public static void main(String[] args) {
		int[] A = {3, 5, 2, 6, 4, 7, 1, 8, 0, 9, 10, 2, 3, 4, 5};
		int[] B = new int [A.length];
		int resultado= 0;
		int aux=0;

		for(int i=0; i<A.length; i++) {
			System.out.print((i+1)+". "+A[i]+" em fatorial - "+"B: " );
			aux= A[i];
			resultado= 1;
			while(aux > 1) {
			    resultado *= aux;
			    aux--;
			}
			B[i] = resultado;
			System.out.print(resultado+".");
			System.out.println("\n");
		}
	}
}
