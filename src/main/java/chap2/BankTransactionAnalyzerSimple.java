package main.java.chap2;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    public static final String resources = "src/main/resources/bank-data-simple.csv";
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public static void main(String... args) throws IOException {
        final Path path = Paths.get(resources);
        List<String> lines  = Files.readAllLines(path);
        double total = 0;

        for(String line : lines){
            String[] columns = line.split(",");

            LocalDate date = LocalDate.parse(columns[0], formatter);
            if(date.getMonth()==Month.JANUARY){
                double amount = Double.parseDouble(columns[1]);
                total += amount;
            }

        }
        System.out.println("Total summary spent was -> "+total);

    }
}
