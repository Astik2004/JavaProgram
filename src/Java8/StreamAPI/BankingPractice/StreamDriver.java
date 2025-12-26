package Java8.StreamAPI.BankingPractice;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDriver {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("TXN1001", "ACC001", 15000,  "CREDIT", "SUCCESS", LocalDate.of(2025, 12, 1)),
                new Transaction("TXN1002", "ACC001", 5000,   "DEBIT",  "SUCCESS", LocalDate.of(2025, 12, 1)),
                new Transaction("TXN1003", "ACC002", 75000,  "CREDIT", "SUCCESS", LocalDate.of(2025, 12, 2)),
                new Transaction("TXN1004", "ACC002", 20000,  "DEBIT",  "FAILED",  LocalDate.of(2025, 12, 2)),
                new Transaction("TXN1005", "ACC003", 120000, "CREDIT", "SUCCESS", LocalDate.of(2025, 12, 3)),
                new Transaction("TXN1006", "ACC003", 30000,  "DEBIT",  "SUCCESS", LocalDate.of(2025, 12, 3)),
                new Transaction("TXN1007", "ACC001", 90000,  "CREDIT", "SUCCESS", LocalDate.of(2025, 12, 4)),
                new Transaction("TXN1008", "ACC004", 4000,   "DEBIT",  "SUCCESS", LocalDate.of(2025, 12, 4)),
                new Transaction("TXN1009", "ACC004", 250000, "CREDIT", "SUCCESS", LocalDate.of(2025, 12, 5)),
                new Transaction("TXN1010", "ACC002", 10000,  "DEBIT",  "SUCCESS", LocalDate.of(2025, 12, 5)),
                new Transaction("TXN1011", "ACC005", 60000,  "CREDIT", "FAILED",  LocalDate.of(2025, 12, 6)),
                new Transaction("TXN1012", "ACC005", 45000,  "DEBIT",  "SUCCESS", LocalDate.of(2025, 12, 6)),
                new Transaction("TXN1013", "ACC003", 8000,   "DEBIT",  "SUCCESS", LocalDate.of(2025, 12, 7)),
                new Transaction("TXN1014", "ACC001", 200000, "CREDIT", "SUCCESS", LocalDate.of(2025, 12, 7)),
                new Transaction("TXN1015", "ACC004", 15000,  "DEBIT",  "FAILED",  LocalDate.of(2025, 12, 8))
        );
        List<String>accounts =transactions.stream()
                .filter(t->t.getAmount()>100000)
                .map(Transaction::getAccountNumber)
                .collect(Collectors.toList());
        System.out.println(accounts);
                //.forEach(System.out::println);
        //Example 1: Find all HIGH VALUE transactions (> ₹50,000)
        List<Transaction>highValueTxns=transactions.stream()
                .filter(t->t.getAmount()>50000)
                .toList();
        System.out.println(highValueTxns);
        //Example 2: Failed transactions report
        List<Transaction>failedTransactionReport =transactions.stream()
                .filter(t->t.getStatus().equals("FAILED"))
                .toList();
        System.out.println(failedTransactionReport);
        //Example: Extract account numbers from transactions
        List<String>listAccountNumber =transactions.stream()
                .map(Transaction::getAccountNumber)
                .distinct()
                .toList();
        System.out.println(listAccountNumber);
        //Total credited amount of the day
        double totalTransaction=transactions.stream()
                .filter(t->t.getType().equals("CREDIT"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println(totalTransaction);
        //Group transactions by account number
        Map<String,List<Transaction>> groupByAccountNumber=transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getAccountNumber));
        for(Map.Entry<String,List<Transaction>>entry:groupByAccountNumber.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //Total debit per account
        Map<String,Double>totalDebitPerAccount =transactions.stream()
                .filter(t->t.getType().equals("DEBIT"))
                .collect(Collectors.groupingBy(
                        Transaction::getAccountNumber,
                        Collectors.summingDouble(Transaction::getAmount)
                ));
        System.out.println(totalDebitPerAccount);



    }
}
