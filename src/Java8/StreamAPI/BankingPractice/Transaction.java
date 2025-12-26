package Java8.StreamAPI.BankingPractice;

import java.time.LocalDate;

class Transaction {
    private String txnId;
    private String accountNumber;
    private double amount;
    private String type; // CREDIT or DEBIT
    private String status; // SUCCESS, FAILED
    private LocalDate date;

    public Transaction(String txnId, String accountNumber, double amount, String type, String status, LocalDate date) {
        this.txnId = txnId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.status = status;
        this.date = date;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "txnId='" + txnId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}

