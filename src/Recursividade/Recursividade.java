package Recursividade;

import java.io.File;

/**
 *
 * @author vifelisberto
 */
public class Recursividade {

    public static void main(String[] args) {
        listaConteudo(new File(".")); // Diretório corrente
    }

    /**
     * Método que lista o conteudo de terminado diretório, exibindo todos os arquivos/Pastas.
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
}
