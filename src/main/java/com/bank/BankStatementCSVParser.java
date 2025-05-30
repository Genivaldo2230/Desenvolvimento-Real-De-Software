package main.java.com.bank;

import java.util.List;

public interface BankStatementCSVParser {

    public interface BankStatementCSVParser1<Transaction> {
        double calculateTotalAmount();
        List<Transaction> selectInMonth(Month month);
    }

    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
}
