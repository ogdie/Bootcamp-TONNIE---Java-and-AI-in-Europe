package br.com.dio.model;

public class Board {
    // Um tabuleiro de Sudoku é 9x9
    private Space[][] board = new Space[9][9];

    public Board() {
        // Inicializa todos os espaços do tabuleiro como vazios (valor 0) e não fixos
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                this.board[row][col] = new Space(0, false);
            }
        }
    }


    public void setSpace(int row, int col, int value, boolean isFixed) {
        // Se o valor for 0 (vazio), ele nunca é fixo.
        this.board[row][col] = new Space(value, value != 0 && isFixed);
    }


    public Space getSpace(int row, int col) {
        return this.board[row][col];
    }


    public void printBoard() {
        System.out.println("-------------------------");
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| "); // Separador vertical para os blocos 3x3
                }
                // Usa o toString() da classe Space para exibir '.' para 0
                System.out.print(board[row][col].toString() + " ");
            }
            System.out.println();
            if (row % 3 == 2 && row != 8) {
                System.out.println("-------------------------"); // Separador horizontal para os blocos 3x3
            }
        }
        System.out.println("-------------------------");
    }

    public boolean isValid(int row, int col, int value) {
        // Se o valor for 0, significa que o espaço está vazio, o que é sempre "válido" para a verificação individual.
        if (value == 0) {
            return true;
        }

        // 1. Verificar Linha
        for (int c = 0; c < 9; c++) {
            if (c != col && board[row][c].getValue() == value) {
                return false; // Valor já existe na linha
            }
        }

        // 2. Verificar Coluna
        for (int r = 0; r < 9; r++) {
            if (r != row && board[r][col].getValue() == value) {
                return false; // Valor já existe na coluna
            }
        }

        // 3. Verificar Bloco 3x3
        int startRow = row - row % 3; // Calcula o início da linha do bloco
        int startCol = col - col % 3; // Calcula o início da coluna do bloco

        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (r != row || c != col) { // Não compara com o próprio espaço
                    if (board[r][c].getValue() == value) {
                        return false; // Valor já existe no bloco 3x3
                    }
                }
            }
        }

        return true; // Se passou por todas as verificações, o valor é válido
    }


    public boolean isSolved() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int currentValue = board[row][col].getValue();
                if (currentValue == 0) {
                    return false; // Se houver qualquer espaço vazio, não está resolvido
                }
                // Verifica a validade do valor atual (sem compará-lo com ele mesmo na posição)
                if (!isValid(row, col, currentValue)) {
                    return false; // Se qualquer valor for inválido, não está resolvido
                }
            }
        }
        return true; // Se todos os espaços estão preenchidos e válidos
    }
}