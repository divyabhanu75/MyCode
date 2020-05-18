package com.company;

public class Main {

    public static void main(String[] args) {

        Account anupsAccount = new Account("Anup",1234567,5000);
        String output = "";
        System.out.println("Initial output :" + output);
        System.out.println("Anups Balance: " + anupsAccount.getAccountBalance());
        output = anupsAccount.deposit(100);
        System.out.println(output);
        System.out.println("Anups Balance: " + anupsAccount.getAccountBalance());
        output = anupsAccount.deposit(1000);
        System.out.println(output);
        System.out.println("Anups Balance: " + anupsAccount.getAccountBalance());
        output = anupsAccount.withDraw(2000);
        System.out.println(output);
        System.out.println("Anups Balance: " + anupsAccount.getAccountBalance());
        output = anupsAccount.withDraw(6000);
        System.out.println(output);
        System.out.println("Anups Balance: " + anupsAccount.getAccountBalance());


    }
}
