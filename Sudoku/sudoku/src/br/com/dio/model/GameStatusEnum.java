package br.com.dio.model;

public enum GameStatusEnum {
    RUNNING, // O jogo está em andamento
    SOLVED,  // O jogador resolveu o Sudoku corretamente
    GAME_OVER // O jogo terminou (ex: por erros, ou desistência)
}
