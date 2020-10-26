package Pratice.Ex1;

import Pratice.Ex1.Bank;

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000,10);
        System.out.println(b1.calculateInterest());
    }
}
