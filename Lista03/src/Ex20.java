package lista03;

public class Ex20 {

	public static void main(String[] args) {
		int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		boolean pares=false;
		
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				pares= true;
			}
			else {
				pares= false;
				break;
			}
		}
		if(pares == true) {
		System.out.println("Este array contém somente números pares!");
	}
		else {
			System.out.println("Este array contém números pares e ímpares!");
		}
	}
}
