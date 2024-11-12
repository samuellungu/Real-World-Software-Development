package main.java.chap2;

import java.util.List;

public interface BankStatementParser {
    public BankTransaction parseFrom(String line);
    public List<BankTransaction> parseLinesFrom(List<String> lines);
}
