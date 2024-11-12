package main.java.chap2;

import java.time.Month;
import java.util.List;

public class BankStatementProcessor {
    public List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (BankTransaction bankTransaction : bankTransactions) {
            totalAmount += bankTransaction.getAmount();
        }
        return totalAmount;
    }
    public double calculateTotalInMonth(Month month){
        double totalAmount = 0;
        for (BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDate().getMonth()==month){
                totalAmount += bankTransaction.getAmount();
            }
        }
        return totalAmount;
    }
    public double calculateTotalForCategory(String category) {
        double totalAmount = 0;
        for (BankTransaction bankTransaction : bankTransactions) {
            if(bankTransaction.getDescription().equals(category)){
                totalAmount += bankTransaction.getAmount();
            }
        }
        return totalAmount;
    }
}
