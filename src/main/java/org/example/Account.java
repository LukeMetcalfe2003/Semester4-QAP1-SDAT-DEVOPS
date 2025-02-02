package org.example;

public class Account {
    public  String customerName;
    public Double accountBal;

    public Account(String name, Double balance) {
        this.customerName = name;
        this.accountBal = balance;
    }

    public void deposit(double depositAmt) {
        System.out.println("Customer: "+ customerName + " Balance Before Deposit: "+ accountBal);
        this.accountBal += depositAmt;
        System.out.println("Customer: "+ customerName + " Balance After Deposit: "+ accountBal);
    }

    public void withdraw(double withdrawAmt) {
        if (accountBal >= withdrawAmt) {
            System.out.println("Customer: " + customerName + " Balance Before Withdraw: "+ accountBal);
            this.accountBal -= withdrawAmt;
            System.out.println("Customer: " + customerName + " Balance After Withdraw: "+ accountBal);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public Double getBalance() {
        return accountBal;
    }
}
