Sudoku Terminal Game
Este é um jogo simples de Sudoku implementado em Java, projetado para ser executado diretamente no terminal. O objetivo é preencher um tabuleiro 9x9 com números de 1 a 9, garantindo que cada número apareça apenas uma vez em cada linha, coluna e bloco 3x3.

Funcionalidades Implementadas
O projeto inclui as seguintes funcionalidades principais:

Tabuleiro de Sudoku (Board): Representação interna de um tabuleiro 9x9, onde cada célula (Space) pode conter um número ou ser vazia.

Células Fixas (Space): Capacidade de definir células iniciais do tabuleiro que não podem ser alteradas pelo jogador.

Validação de Movimentos: Lógica para verificar se um número inserido pelo jogador é válido de acordo com as regras do Sudoku (não pode repetir na mesma linha, coluna ou bloco 3x3).

Detecção de Vitória: O jogo verifica automaticamente se o tabuleiro foi preenchido corretamente e o Sudoku foi resolvido.

Contador de Erros: O jogador tem um número limitado de erros permitidos em jogadas inválidas. Ao exceder esse limite, o jogo termina em GAME OVER.

Interação via Terminal: Permite que o jogador insira jogadas (linha, coluna, valor) diretamente no console.

Comando de Saída: O jogador pode digitar "sair" a qualquer momento para encerrar o jogo.

Limpar Célula: Permite ao jogador limpar uma célula inserindo o valor 0.

Templates de Tabuleiro (BoardTemplate): Utiliza uma classe utilitária para carregar um tabuleiro Sudoku pré-definido ao iniciar o jogo.

Status do Jogo (GameStatusEnum): Gerencia o estado atual do jogo (rodando, resolvido, game over).

Como Jogar
O jogo começará exibindo um tabuleiro Sudoku pré-definido.

Para fazer uma jogada, digite a linha, coluna e valor separados por espaços.

Exemplo: 0 0 5 (para colocar o número 5 na célula da linha 0, coluna 0).

As linhas e colunas são indexadas de 0 a 8.

O valor para preencher deve ser de 1 a 9.

Para limpar uma célula preenchida por você, digite 0 como valor.

Exemplo: 0 0 0 (para limpar a célula da linha 0, coluna 0).

Você tem um limite de 3 erros em jogadas inválidas.

Para sair do jogo a qualquer momento, digite sair.


Projeto realizado para o Bootcamp da Tonnie em parceria com a Dio
Desenvolvido por Diego Monteiro