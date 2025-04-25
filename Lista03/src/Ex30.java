//Generate and print a matrix M (4 x 4) with random values ​​between 0 and 9.
//After that, determine the largest number in the matrix and its position (row and column).
package lista03;

public class Ex30 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int maior=0;
		int linha=0;
		int coluna=0;
		
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
	
	maior=matriz[0][0];
	for (int i = 0; i < matriz.length; i++) {            
	    for (int j = 0; j < matriz[i].length; j++) {
	    	if(maior<matriz[i][j]) {
	    		maior=matriz[i][j];
	    		linha=i;
	    		coluna=j;
	    	}
	    }
	}
	System.out.println("Maior número da matriz: "+maior);
	System.out.println("Ele está na posição ("+linha+","+coluna+").");
	for (int i = 0; i < matriz.length; i++) {            
	    for (int j = 0; j < matriz[i].length; j++) {
	    	if(maior==matriz[i][j] && i!=linha && j!=coluna) {
	    		linha =i;
	    		coluna=j;
	    		System.out.println("Ele está na posição ("+linha+","+coluna+").");
	    	}
	    }
	    }
	}
}
