package lista03;

public class Ex25 {

	public static void main(String[] args) {
		int [] arrayA = {2,3,4,5,6};
		int numero=0;
		
		
		for(int i=0; i<arrayA.length; i++) {
			System.out.print("Tabuada do número "+arrayA[i]+": ");
			for(int j=1; j<11; j++) {
				numero=arrayA[i]*j;
				System.out.print(numero+", ");
			}
			System.out.println("\n");
		}
	}
}
