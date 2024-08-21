public class MatrizRecursiva {
//Gabriel Tonon Barreiros

    //métoddo recursifov
    public static void preencherMatriz(int[][] matriz, int linha, int coluna, int valorAtual) {
        // verificadcao de preenchimento
        if (linha == matriz.length) {
            return;
        }

        //preenche
        matriz[linha][coluna] = valorAtual;

        // muda de coluna
        if (coluna < matriz[0].length - 1) {
            preencherMatriz(matriz, linha, coluna + 1, valorAtual + 1);
        } else {
            // muda de linha e reinicia a coluna
            preencherMatriz(matriz, linha + 1, 0, valorAtual + 1);
        }
    }

    // metodo principal
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        preencherMatriz(matriz, 0, 0, 1);

        // meteodo de imprimir
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}