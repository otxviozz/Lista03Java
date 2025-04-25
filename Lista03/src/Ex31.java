//Generate and print a matrix M (10 x 10) with random values ​​between 0 and 9.
//After that, indicate which is the largest and smallest value in row 5 and which is the largest and smallest value in column 7.
package exercises;

public class Ex31 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		int maiorl=0;
		int menorl=0;
		int maiorc=0;
		int menorc=0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
		    	matriz[i][j]= (int)(Math.random() * 10);
		    }
		}
	
	for (int i = 0; i < matriz.length; i++) {            
	    for (int j = 0; j < matriz[i].length; j++) {
	    	System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println(); 
	}

	for (int j = 0; j < matriz[5].length; j++) {
		if (j == 0) {
	        maiorl = menorl = matriz[5][j];
	    }
			if(maiorl < matriz[5][j]) {
				maiorl = matriz[5][j];
			}
			if(menorl > matriz[5][j]) {
				menorl= matriz[5][j];
			}
		}
		System.out.println("O maior número da linha 5 é "+maiorl);
		System.out.println("O menor número da linha 5 é "+menorl);
		
		for (int i = 0; i < matriz.length; i++) {
			if (i == 0) {
		        maiorc = menorc = matriz[i][7];
		    }
			if(maiorc < matriz[i][7]) {
				maiorc = matriz[i][7];
			}
			if(menorc > matriz[i][7]) {
				menorc= matriz[i][7];
			}
		}
		System.out.println("O maior número da coluna 7 é "+maiorc);
		System.out.println("O menor número da coluna 7 é "+menorc);
	}
	}