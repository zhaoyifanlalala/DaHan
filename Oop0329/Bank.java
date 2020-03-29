package com.banyuan.homework;
/*
3.模范 一个账户 1000块钱 :两个人 A B 分别在柜台和ATM机 取钱
  A 每次取钱100    B 每次取200 最终在控制台输出每个人取钱数
 */
public class Bank {
    public static int count=1000;
    //A在柜台取钱
    public void Counter(int count){
        Bank.count=Bank.count - count;
        System.out.println("A取走了"+count+",还剩下"+Bank.count);
    }
    //B在ATM取钱
    public void ATM(int count){
        Bank.count=Bank.count-count;
        System.out.println("B取走了"+count+",还剩下"+Bank.count);
    }
}

class A extends Thread{
    Bank bank;

    public A(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.count >= 100){
            bank.Counter(100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    Bank bank;

    public B(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.count >= 200){
            bank.ATM(200);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        A a=new A(bank);
        B b=new B(bank);
        a.start();
        b.start();
    }
}


