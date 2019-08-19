package Recursividade;

import java.io.File;

/**
 *
 * @author vifelisberto
 */
public class Recursividade {

    public static void main(String[] args) {
        //listaConteudo(new File(".")); // Diretório corrente
        //contagemRegressiva(10);
        System.out.println(potencia(5, 0));
    }

    /**
     * Método que lista o conteudo de terminado diretório, exibindo todos os
     * arquivos/Pastas.
     *
     * @param arquivo Diretório corrente para busca.
     */
    private static void listaConteudo(File arquivo) {
        if (arquivo.isDirectory()) {
            System.out.println("Diretorio: " + arquivo.getName());

            File[] subArquivos = arquivo.listFiles();
            for (File subArquivo : subArquivos) {
                listaConteudo(subArquivo);
            }
        } else {
            System.out.println("Arquivo " + arquivo.getName());
        }
    }

    /**
     * Método de contagem Regressiva Recursiva.
     *
     * @param n Número que irá começar a contagem regressiva.
     */
    private static void contagemRegressiva(int n) {
        if (n == 0) {
            System.out.println("0");
        } else {
            System.out.println(n);
            contagemRegressiva(n - 1);
        }
    }
    
    /**
     * Método que recebe uma base e um expoente e retorna a potencia entre eles.
     * @param base base
     * @param expoente expoente
     * @return retorna a potencia entre a base e o expoente.
     */
    private static int potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }
        
        return base * potencia(base, expoente - 1);
    }
}
