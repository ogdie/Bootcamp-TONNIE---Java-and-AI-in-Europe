package br.com.dio;

import br.com.dio.model.Board;
import br.com.dio.model.GameStatusEnum;
import br.com.dio.util.BoardTemplate; // Importe BoardTemplate
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando o Sudoku no terminal!");

        Board gameBoard = new Board();

        // --- NOVO: Carrega o tabuleiro a partir de BoardTemplate ---
        System.out.println("\nCarregando tabuleiro padrão...");
        int[][] initialTemplate = BoardTemplate.getDefaultBoard();

        // Preenche o tabuleiro do jogo com os valores do template
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int value = initialTemplate[row][col];
                boolean isFixed = (value != 0); // Se o valor não é 0, ele é um número inicial (fixo)
                gameBoard.setSpace(row, col, value, isFixed);
            }
        }
        // --- FIM DA NOVA LÓGICA DE CARREGAMENTO ---

        System.out.println("\nTabuleiro Inicial:");
        gameBoard.printBoard();

        Scanner scanner = new Scanner(System.in);
        GameStatusEnum status = GameStatusEnum.RUNNING;

        final int MAX_ERRORS = 3; // Define o número máximo de erros permitidos
        int errorCount = 0;       // Contador de erros do jogador

        System.out.println("\nBem-vindo ao Sudoku! Digite suas jogadas no formato: linha coluna valor");
        System.out.println("Exemplo: 0 0 5 (para colocar o número 5 na célula [0][0])");
        System.out.println("Para sair, digite 'sair'");
        System.out.println("Para limpar uma célula, digite 0 como valor (ex: 0 0 0)");
        System.out.println("Você tem " + MAX_ERRORS + " erros permitidos.");

        // Loop principal do jogo
        while (status == GameStatusEnum.RUNNING) {
            System.out.print("Sua jogada (linha coluna valor ou 'sair'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                status = GameStatusEnum.GAME_OVER; // Altera o status para encerrar o jogo
                System.out.println("\n-----------------------------------------");
                System.out.println("Jogo encerrado. Obrigado por jogar!");
                System.out.println("-----------------------------------------");
                break; // Sai do loop
            }

            try {
                String[] parts = input.trim().split(" ");
                if (parts.length != 3) {
                    System.out.println("Formato inválido. Use: linha coluna valor (ex: 0 0 5)");
                    continue;
                }

                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);
                int value = Integer.parseInt(parts[2]);

                if (row < 0 || row > 8 || col < 0 || col > 8) {
                    System.out.println("Linha e coluna devem estar entre 0 e 8.");
                    continue;
                }
                if (value < 0 || value > 9) {
                    System.out.println("O valor deve ser um número entre 1 e 9 (ou 0 para limpar).");
                    continue;
                }

                if (gameBoard.getSpace(row, col).isFixed()) {
                    System.out.println("Não é possível alterar uma célula inicial (fixa). Tente outra.");
                    continue;
                }

                // Se o valor não for 0 (tentando preencher) E a jogada for inválida
                if (value != 0 && !gameBoard.isValid(row, col, value)) {
                    errorCount++; // Incrementa o contador de erros
                    System.out.println("Movimento inválido! O número " + value + " já existe na linha, coluna ou bloco 3x3.");
                    System.out.println("Você cometeu " + errorCount + " de " + MAX_ERRORS + " erros.");

                    if (errorCount >= MAX_ERRORS) {
                        status = GameStatusEnum.GAME_OVER;
                        System.out.println("\n-----------------------------------------");
                        System.out.println("GAME OVER! Você excedeu o limite de " + MAX_ERRORS + " erros.");
                        System.out.println("-----------------------------------------");
                        break; // Sai do loop
                    }
                    continue; // Pede nova entrada
                }

                // Aplica a jogada (se for válida ou se for para limpar a célula)
                gameBoard.getSpace(row, col).setValue(value);
                System.out.println("\nTabuleiro Atual:");
                gameBoard.printBoard();

                // Verifica se o jogo foi resolvido após a jogada
                if (gameBoard.isSolved()) {
                    status = GameStatusEnum.SOLVED;
                    System.out.println("\n-----------------------------------------");
                    System.out.println("        PARABÉNS! Você resolveu o Sudoku!");
                    System.out.println("-----------------------------------------");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite apenas números para linha, coluna e valor.");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                e.printStackTrace(); // Mantenha para depuração se necessário, remova para entrega final
            }
        }

        scanner.close(); // Fechar o scanner quando o jogo termina
    }
}