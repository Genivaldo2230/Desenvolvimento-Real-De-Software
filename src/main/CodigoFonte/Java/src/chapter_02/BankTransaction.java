package main.CodigoFonte.Java.src.chapter_02;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {

    private final LocalDate date;
    private final double amount;
    private final String description;


    public BankTransaction(LocalDate date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(amount, that.amount) == 0 && Objects.equals(date, that.date) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, description);
    }
}
