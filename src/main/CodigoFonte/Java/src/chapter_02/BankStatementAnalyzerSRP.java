package main.CodigoFonte.Java.src.chapter_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;


public class BankStatementAnalyzerSRP {

    private static final String RESOURCES = "src/main/codigoFonte/java/resources/";


    public static void main(final String[] args) throws IOException {

        final BankStantementCSVParser bankStantementCSVParser = new BankStantementCSVParser();

        final String fileName = args[0];
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStantementCSVParser.parseLinesFromCSV(lines);

        System.out.println("The total for all Transaction  is " + caculateTotalAmunt(bankTransactions));

        System.out.println("Transaction in January " + selectInMonth(bankTransactions, Month.JANUARY));

    }

    private static double caculateTotalAmunt(final List<BankTransaction> bankTransactions) {
        return  bankTransactions.stream().mapToDouble(BankTransaction::getAmount).sum();
    }
    private static List<BankTransaction> selectInMonth(final List<BankTransaction> bankTransactions, final Month month) {
        return bankTransactions.stream()
                .filter(bankStatement -> month.equals(bankStatement.getDate().getMonth()))
                .collect(Collectors.toList());
    }

}


