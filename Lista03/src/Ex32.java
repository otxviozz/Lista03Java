package lista03;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int pares= 0;
		int impares = 0;
		
		System.out.println("Vamos fazer uma matriz 3X3!");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o número que ficará na linha "+(i+1)+" e na coluna "+(j+1)+": ");
				matriz[i][j]= scanner.nextInt(); 
				}
			}
		
		System.out.println("MATRIZ 3X3: ");
		for (int i = 0; i < matriz.length; i++) {            
		    for (int j = 0; j < matriz[i].length; j++) {
		    	System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println(); 
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j]%2==0) {
					pares++;
					}
				else {
					impares++;
				}
				}
			}
		System.out.println("Nessa matriz há "+pares+" números pares");
		System.out.println("Nessa matriz há "+impares+" números ímpares");
		}
	}
