package com.company;

public class Account {
    public String AccountHolderName;
    public int AccountNumber;
    private int AccountBalance;

    public Account(String name, int number, int initialBalance) {
        this.AccountHolderName = name;
        this.AccountNumber = number;
        this.AccountBalance = initialBalance;

    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public String withDraw(int amount) {
        if (verifyBalance(amount)) {
            this.AccountBalance = this.AccountBalance - amount;
            return "Successfully withdrawn :" + amount;
        } else {
            return "Insufficient Balance";
        }
    }

    public String deposit(int amount) {
        this.AccountBalance = this.AccountBalance + amount;
        return "Successfully deposited : " + amount;
    }

    private boolean verifyBalance(int amount) {
        boolean isAvailable = this.AccountBalance >= amount;
        return isAvailable;
    }
}
