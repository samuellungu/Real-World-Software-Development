package main.java.chap2;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
    private final String description;
    private final double amount;
    private final LocalDate date;

    public BankTransaction(String description, double amount, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
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
    public boolean equals(Object o){
        if(o==null)return false;
        if(o==this)return true;
        if(getClass()!=o.getClass())return false;
        BankTransaction that = (BankTransaction) o;
        return (that.date.equals(this.date) &&
                that.amount == this.amount &&
                that.description.equals(this.description));

    }
    @Override
    public int hashCode() {
        return Objects.hash(date, amount, description);
    }
}
