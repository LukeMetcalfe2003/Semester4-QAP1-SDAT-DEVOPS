package org.example;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("customer1", 20.00);
        Account account2 = new Account("customer2", 30.00);
        System.out.println("Customer 1 Balance: ");
        System.out.println(account1.getBalance());
        account1.deposit(40.00);
        account2.withdraw(15.00);
        System.out.println("Customer 1 Balance: ");
        System.out.println(account1.getBalance());
        System.out.println("Customer 2 Balance: ");
        System.out.println(account2.getBalance());
    }
}