package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(100, "math", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "maria", 0.0, 500.0);

        // Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "anna", 0.0, 0.01);

        // Downcasting
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //BusinnesAccount acc5 = (BusinessAccont)acc3 essa operacao da problema
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
        }
    }
}
