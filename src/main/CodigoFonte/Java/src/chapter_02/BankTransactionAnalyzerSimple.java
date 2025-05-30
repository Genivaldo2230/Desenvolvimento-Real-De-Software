// Declara o pacote onde esta classe está localizada.
// Isso organiza o código e evita conflitos com outras classes com o mesmo nome.
package main.CodigoFonte.Java.src.chapter_02;

import java.io.IOException;                    // Importa classe para tratar exceções de I/O (leitura de arquivos, etc.)
import java.nio.file.Files;                   // Classe utilitária para manipulação de arquivos e diretórios
import java.nio.file.Path;                    // Representa um caminho no sistema de arquivos
import java.nio.file.Paths;                   // Classe que converte strings em objetos Path
import java.util.List;                        // Interface para representar listas (coleções ordenadas)

public class BankTransactionAnalyzerSimple {  // Declaração da classe principal do programa

    // Constante que representa o caminho da pasta onde o arquivo CSV está localizado.
    private static final String RESOURCES = "src/main/codigoFonte/java/resources/";

    // Método principal - ponto de entrada da aplicação
    public static void main(String[] args) throws IOException {

        // Cria um objeto Path que representa o caminho completo do arquivo CSV.
        // Concatena " + " o caminho base (RESOURCES) com o nome do arquivo CSV.
        final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");

        // Lê todas as linhas do arquivo CSV e armazena em uma lista de Strings.
        // Cada elemento da lista representa uma linha do arquivo.
        final List<String> lines = Files.readAllLines(path);

        // Variável acumuladora para somar os valores das transações.
        double total = 0d;

        // Loop que percorre cada linha lida do arquivo CSV
        for (final String line : lines) {

            // Divide a linha atual em colunas, usando vírgula como separador (formato CSV)
            final String[] columns = line.split(",");

            // Converte a segunda coluna (índice 1), que representa o valor da transação, para tipo double
            final double amount = Double.parseDouble(columns[1]);

            // Adiciona o valor atual à variável total
            total += amount;
        }

        // Exibe o resultado final da soma de todas as transações no console
        System.out.println("The total for all transactions: " + total);
    }
}

