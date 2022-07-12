package model.entities;

import model.exceptions.BusinessException;

public class BankAccount {
    private Integer number;
    private String holder;
    protected double balance;

    public BankAccount() {
    }

    public BankAccount(Integer number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
