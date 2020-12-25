package com.vipzou.javasetest.Day29;

public class Test01 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        for (int i = 0; i < 3; i++) {
            new PersonThread("a"+i, bankAccount).start();
        }
    }

}

class PersonThread extends Thread {
    private BankAccount bankAccount;

    public PersonThread(String name, BankAccount bankAccount) {
        super(name);
        this.bankAccount = bankAccount;
    }


    @Override
    public void run() {
        synchronized (bankAccount) {
            System.out.println(Thread.currentThread().getName()+ "余额" + bankAccount.getBalance());
            bankAccount.withdraw(1000);
            System.out.println(this.getName() + "取后余额" + bankAccount.getBalance());
        }
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        if (money < balance) {
            balance -= money;
        } else {
            System.out.println("不足");
        }
    }
}
