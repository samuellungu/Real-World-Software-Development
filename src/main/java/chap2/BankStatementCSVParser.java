package main.java.chap2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements BankStatementParser{
    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public BankTransaction parseFrom(String line) {
        String [] parts = line.split(",");
        LocalDate date = LocalDate.parse(parts[0], DATE_PATTERN);
        double amount = Double.parseDouble(parts[1]);
        String description = parts[2];

        return new BankTransaction(description, amount, date);
    }

    public List<BankTransaction> parseLinesFrom(final List<String> lines) {
        List<BankTransaction> transactions = new ArrayList<>();

        for(String line: lines) {
            transactions.add(parseFrom(line));
        }
        return transactions;
    }



}
