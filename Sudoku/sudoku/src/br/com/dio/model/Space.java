package br.com.dio.model;

public class Space {
    private int value; // O número de 1 a 9 (ou 0 para vazio)
    private boolean isFixed; // True se for um número inicial do tabuleiro, false se for inserido pelo jogador

    public Space(int value, boolean isFixed) {
        this.value = value;
        this.isFixed = isFixed;
    }

    // Getters
    public int getValue() {
        return value;
    }

    public boolean isFixed() {
        return isFixed;
    }

    // Setter (só pode alterar o valor se não for fixo)
    public void setValue(int value) {
        if (!isFixed) { // Só permite alterar se o espaço não for fixo
            this.value = value;
        } else {
            // Em um jogo real, você poderia lançar uma exceção ou retornar um erro
            System.out.println("Não é possível alterar um espaço fixo!");
        }
    }

    @Override
    public String toString() {
        // Retorna o valor como string para impressão. Se for 0, mostra um ponto.
        return (value == 0) ? "." : String.valueOf(value);
    }
}