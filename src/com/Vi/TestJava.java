package com.Vi;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestJava {



    public static void main(String[] args) {

        Transaction t1 = new Transaction(10.00);
        Transaction t2 = new Transaction(100.00);
        Account account = new Account("A1");
        account.setTransactions(Arrays.asList(t1, t2));

        Transaction t3 = new Transaction(105.00);
        Transaction t4 = new Transaction(150.00);
        Account account2 = new Account("A2");
        account2.setTransactions(Arrays.asList(t3, t4));

        Account resultAccount = findHighTransactionAccount(Arrays.asList(account, account2));
        System.out.println("Highest transaction Account: "+resultAccount.getId());
    }

    private static Account findHighTransactionAccount(List<Account> accounts){
        double maxTransactionAmount = 0.0;
        Account account = null;

        for(Account acc : accounts){
            for(Transaction transaction : acc.getTransactions()){
                if(transaction.getAmount() > maxTransactionAmount){
                    account = acc;
                    maxTransactionAmount = transaction.getAmount();
                }
            }
        }
        return account;
    }
}

class Account{
    Account(String id){
        this.id = id;
    }
    private String id;
    private List<Transaction> transactions;
    public List<Transaction> getTransactions(){
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getId() {
        return id;
    }
}

class Transaction{
    Transaction(double amount){
        this.amount = amount;
    }
    private Date transactionDate;
    private double amount;
    public double getAmount(){
        return amount;
    }
}