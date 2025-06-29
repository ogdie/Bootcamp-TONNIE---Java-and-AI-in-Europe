package br.com.dio.util;

// Esta classe fornece modelos de tabuleiros Sudoku.
public class BoardTemplate {

    /**
     * Retorna um tabuleiro de Sudoku inicial predefinido.
     * Os valores são representados como um array de Strings, onde cada String
     * representa uma linha do tabuleiro. '0' indica um espaço vazio.
     *
     * Este é um tabuleiro de exemplo (pode ser "fácil" ou "médio").
     * Você pode adicionar mais métodos para diferentes dificuldades (e.g., getMediumBoard(), getHardBoard()).
     *
     * @return Um array 2D de inteiros representando o tabuleiro.
     * O valor 0 representa um espaço vazio.
     */
    public static int[][] getDefaultBoard() {
        return new int[][] {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
    }

    /**
     * Retorna um tabuleiro Sudoku vazio.
     * @return Um array 2D de inteiros com todos os zeros.
     */
    public static int[][] getEmptyBoard() {
        return new int[9][9];
    }
}