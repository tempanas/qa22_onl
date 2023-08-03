package lesson6;

import java.util.Scanner;

public class ATM {
    int note20;
    int note50;
    int note100;
    int moneycash;

    public ATM(int note20, int note50, int note100) {
        note20 = 0;
        note50 = 0;
        note100 = 0;
    }

    public void addMoney(int moneycash, int note20, int note50, int note100) {
        if (moneycash == 20) {
            note20++;
        } else if (moneycash == 50) {
            note50++;
        } else if (moneycash == 100) {
            note100++;
        } else System.out.println("Принимаются банкноты только номиналом 20, 50, 100");
    }

    public boolean withdrawMoney(int moneycash) {
        if (moneycash == 20) {
            note20--;
            return true;
        } else if (moneycash == 50) {
            note50--;
            return true;
        } else if (moneycash == 100) {
            note100--;
            return true;
        } else return false;
    }
}
