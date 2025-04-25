//Write a program to play tic-tac-toe. The program should allow two players to play a game of tic-tac-toe,
//using the computer to view the board. Each player takes turns informing the position where he or she wants
//to place his or her piece (‘O’ or ‘X’). The program should prevent invalid moves and automatically determine
//when the game is over and who is the winner (Player 1 or Player 2). 
//With each new move, the program should update the board status on the screen.
package exercises;

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] matriz = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
        };
        boolean loop = true; // controla o loop do jogo
        String vez = "O"; //1- jogador 1  2- jogador 2. usado na atribuição de valor na matriz
        int ordem = 1; // alterna a ordem do jogador 1 ou 2
        boolean entradaValida = false; // verificação de entrada inválida
        String numeroX = ""; // para as entradas X
        int entradaX = 0;
        String numeroY = ""; // para as entradas Y
        int entradaY = 0;

        System.out.println("JOGO DA VELHA!");
        System.out.println("O jogador 1 usa BOLINHA!");
        System.out.println("O jogador 2 usa X!");
        System.out.println("VAMOS COMEÇAR!");

        while (loop == true) {  //início do loop para as jogadas
            for (int i = 0; i < matriz.length; i++) { //faço um contador para contar as jogadas
                System.out.println("JOGADA NÚMERO: " + (i + 1));
                System.out.println("VEZ DO JOGADOR " + ordem + ".");
                entradaValida = false; // resetando a variável de controle para a entrada X
                while (!entradaValida) {
                    System.out.print("Digite um número entre 1 e 3 para o eixo X: ");
                    numeroX = scan.nextLine();  // leio a linha completa
                    try {
                        entradaX = Integer.parseInt(numeroX);  // converto para inteiro

                        if (entradaX >= 1 && entradaX <= 3) {
                            entradaValida = true;
                        } else {
                            System.out.println("Número fora do intervalo permitido. Tente novamente.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    }
                }

                entradaValida = false; // resetando a variável de controle para a entrada Y
                while (!entradaValida) {
                    System.out.print("Digite um número entre 1 e 3 para o eixo Y: ");
                    numeroY = scan.nextLine();  // leio a linha completa
                    try {
                        entradaY = Integer.parseInt(numeroY);  // converto para inteiro

                        if (entradaY >= 1 && entradaY <= 3) {
                            entradaValida = true;
                        } else {
                            System.out.println("Número fora do intervalo permitido. Tente novamente.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    }
                }

                // colocando a jogada na matriz
                matriz[entradaX - 1][entradaY - 1] = vez;

                // imprimir o tabuleiro
                for (int j = 0; j < matriz.length; j++) {
                    for (int k = 0; k < matriz[j].length; k++) {
                        System.out.print(matriz[j][k] + " | ");
                    }
                    System.out.println();
                    System.out.println("-----------"); // linha divisória
                }
                
                //verificação de ganhador ou empate
                String resultado = null;
                
                // verifico as linhas
                for (int j = 0; j < 3; j++) {
                    if (matriz[j][0].equals(matriz[j][1]) && matriz[j][0].equals(matriz[j][2]) && !matriz[j][0].equals("_")) {
                        resultado = matriz[j][0]; // Retorna o vencedor ("O" ou "X")
                        break;
                    }
                }

                // verifico as colunas
                if (resultado == null) { //as próximas confirmações só são feitas caso ainda não haja atribuição de valor ao resultado
                    for (int j = 0; j < 3; j++) {
                        if (matriz[0][j].equals(matriz[1][j]) && matriz[0][j].equals(matriz[2][j]) && !matriz[0][j].equals("_")) {
                            resultado = matriz[0][j]; // Retorna o vencedor ("O" ou "X")
                            break;
                        }
                    }
                }

                // verifico as diagonais
                if (resultado == null) {
                    if (matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2]) && !matriz[0][0].equals("_")) {
                        resultado = matriz[0][0]; // diagonal principal
                    } else if (matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0]) && !matriz[0][2].equals("_")) {
                        resultado = matriz[0][2]; // diagonal secundária
                    }
                }

                // verifico o empate (se não houver mais "_" na matriz)
                if (resultado == null) {
                    boolean empate = true;
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (matriz[j][k].equals("_")) { //compara em todas as linhas e colunas se há espaço livre
                                empate = false; // ainda há espaço vazio, portanto o jogo não empatou
                                break;
                            }
                        }
                    }
                    if (empate) {
                        resultado = "Empate"; // se não houver mais espaços vazios e nenhuma atribuição de valor ao resultado, é empate
                    }
                }

                if (resultado != null) {
                    if (resultado.equals("Empate")) {
                        System.out.println("O jogo terminou em empate!");
                    } else {
                        System.out.println("Jogador " + (resultado.equals("O") ? "1" : "2") + " venceu!"); // condição para retornar o jogador
                    }
                    loop = false; // encerro o jogo saindo do loop while
                    break; // saio do loop de jogadas
                }

                // alterno entre os jogadores
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