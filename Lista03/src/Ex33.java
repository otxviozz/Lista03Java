package lista03;

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] matriz = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
        };
        boolean loop = true;
        String vez = "O"; //1- jogador 1  2- jogador 2.
        int ordem = 1;
        boolean entradaValida = false;
        String numeroX = ""; // para as entradas
        int entradaX = 0;
        String numeroY = ""; // para as entradas
        int entradaY = 0;

        System.out.println("JOGO DA VELHA!");
        System.out.println("O jogador 1 usa BOLINHA!");
        System.out.println("O jogador 2 usa X!");
        System.out.println("VAMOS COMEÇAR!");

        while (loop == true) {  //início do loop para as jogadas
            for (int i = 0; i < matriz.length; i++) { //faço um contador para contar as jogadas
                System.out.println("JOGADA NÚMERO: " + (i + 1));
                System.out.println("VEZ DO JOGADOR " + ordem + ".");
                entradaValida = false;
                while (!entradaValida) {
                    System.out.print("Digite um número entre 1 e 3 para o eixo X: ");
                    numeroX = scan.nextLine();  // Lê a linha completa
                    try {
                        entradaX = Integer.parseInt(numeroX);  // Converte para inteiro

                        if (entradaX >= 1 && entradaX <= 3) {
                            entradaValida = true;
                        } else {
                            System.out.println("Número fora do intervalo permitido. Tente novamente.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    }
                }

                entradaValida = false; // Resetando a variável de controle para a entrada Y
                while (!entradaValida) {
                    System.out.print("Digite um número entre 1 e 3 para o eixo Y: ");
                    numeroY = scan.nextLine();  // Lê a linha completa
                    try {
                        entradaY = Integer.parseInt(numeroY);  // Converte para inteiro

                        if (entradaY >= 1 && entradaY <= 3) {
                            entradaValida = true;
                        } else {
                            System.out.println("Número fora do intervalo permitido. Tente novamente.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    }
                }

                // Colocando a jogada na matriz
                matriz[entradaX - 1][entradaY - 1] = vez;

                // Imprimir o tabuleiro
                for (int j = 0; j < matriz.length; j++) {
                    for (int k = 0; k < matriz[j].length; k++) {
                        System.out.print(matriz[j][k] + " | ");
                    }
                    System.out.println();
                    System.out.println("-----------"); // linha divisória
                }
                
                //AGORA TEM QUE CONFERIR SE GANHOU OU EMPATOU
                String resultado = null;
                for (int j = 0; j < 3; j++) {
                    if (matriz[j][0].equals(matriz[j][1]) && matriz[j][0].equals(matriz[j][2]) && !matriz[j][0].equals("_")) {
                        resultado = matriz[j][0]; // Retorna o vencedor ("O" ou "X")
                        break;
                    }
                }

                // Verificar colunas
                if (resultado == null) {
                    for (int j = 0; j < 3; j++) {
                        if (matriz[0][j].equals(matriz[1][j]) && matriz[0][j].equals(matriz[2][j]) && !matriz[0][j].equals("_")) {
                            resultado = matriz[0][j]; // Retorna o vencedor ("O" ou "X")
                            break;
                        }
                    }
                }

                // Verificar diagonais
                if (resultado == null) {
                    if (matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2]) && !matriz[0][0].equals("_")) {
                        resultado = matriz[0][0]; // Diagonal principal
                    } else if (matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0]) && !matriz[0][2].equals("_")) {
                        resultado = matriz[0][2]; // Diagonal secundária
                    }
                }

                // Verificar empate (se não houver mais "_" na matriz)
                if (resultado == null) {
                    boolean empate = true;
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (matriz[j][k].equals("_")) {
                                empate = false; // Ainda há espaço vazio, portanto o jogo não empatou
                                break;
                            }
                        }
                    }
                    if (empate) {
                        resultado = "Empate"; // Se não houver mais espaços vazios, é empate
                    }
                }

                if (resultado != null) {
                    if (resultado.equals("Empate")) {
                        System.out.println("O jogo terminou em empate!");
                    } else {
                        System.out.println("Jogador " + (resultado.equals("O") ? "1" : "2") + " venceu!");
                    }
                    loop = false; // Encerra o jogo
                    break; // Sai do loop de jogadas
                }

                // Alternar entre os jogadores
                if (ordem == 1) {
                    ordem = 2;
                    vez = "X";
                } else {
                    ordem = 1;
                    vez = "O";
                }
            }
        }
    }
}