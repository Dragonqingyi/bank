package bank;

import bank1.Acount;

/**
 * Created by 时光与你 on 2017/5/3.
 */
public class banking {
    public static void main(String[]args){
        Acount acount;
        System.out.println("Creating an account with a 500.00 balance");
        acount = new Acount(500.00);
        System.out.println("Withdaw 150.00");
        acount.withdaw(150.00);
        System.out.println("Deposit 22.50");
        acount.deposit(22.50);
        System.out.println("Withdaw 47.62");
        acount.withdaw(47.62);
        System.out.println("The account has a balance of "+acount.getBalance());
    }
}
