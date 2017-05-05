package bank3;

/**
 * Created by 时光与你 on 2017/5/4.
 */
public class TestBank4 {
    public static void main(String[]args){
        Bank bank = new Bank();
        Customer customer;
        Acount acount;
        System.out.println("Creating the customer Jane Smith");
        bank.addCustomer("Jane","Smith");
        System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
        acount = new SavingAccount(500,0.03);
        bank.getCustomers(0).setAcount(acount); //将账户和Jane关联
        System.out.println("Creating the Customer Owen Bryant.");
        bank.addCustomer("Owen","Bryant");
        System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft.");
        acount = new CheckingAccount(500);
        bank.getCustomers(1).setAcount(acount);  //将账户和人关联
        System.out.println("Creating the Customer Tim sorry.");
        bank.addCustomer("Tim","sorry");
        System.out.println("Creating his Savings Account with a 500.00 balance and 500.00 in overdraft.");
        acount = new CheckingAccount(500.00,500.00);
        bank.getCustomers(2).setAcount(acount);   //将账户和Tim关联
        System.out.println("Creating the Customer Maria Solo.");
        bank.addCustomer("Maria","Solo");
        System.out.println("Maria share her checking Account with hey husband Tim");
        bank.getCustomers(3).setAcount(bank.getCustomers(2).getAcount());  //玛丽和她丈夫用一个账户
        System.out.println("");
        System.out.println("Retreieving the customer Jane Smith with her savings account");
        customer = bank.getCustomers(0);
        acount = customer.getAcount();
        System.out.println("Withdraw 150.00: "+acount.withdaw(150.00));
        System.out.println("Deposit 22.50: "+acount.deposit(22.50));
        System.out.println("Withdraw 47.62: "+acount.withdaw(47.62));
        System.out.println("Withdraw 400.00: "+acount.withdaw(400.00));
        System.out.println("Customer["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+acount.getBalance());
        customer = bank.getCustomers(1 );
        acount = customer.getAcount();
        System.out.println("Withdraw 150.00: "+acount.withdaw(150.00));
        System.out.println("Deposit 22.50: "+acount.deposit(22.50));
        System.out.println("Withdraw 47.62: "+acount.withdaw(47.62));
        System.out.println("Withdraw 400.00: "+acount.withdaw(400.00));
        System.out.println("Customer["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+acount.getBalance());
        customer = bank.getCustomers(2);
        acount = customer.getAcount();
        System.out.println("Withdraw 150.00: "+acount.withdaw(150.00));
        System.out.println("Deposit 22.50: "+acount.deposit(22.50));
        System.out.println("Withdraw 47.62: "+acount.withdaw(47.62));
        System.out.println("Withdraw 400.00: "+acount.withdaw(750.00));
        System.out.println("Customer["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+acount.getBalance());
        customer = bank.getCustomers(3);
        acount = customer.getAcount();
        System.out.println("Withdraw 150.00: "+acount.withdaw(150.00));
        System.out.println("Deposit 22.50: "+acount.deposit(22.50));
        System.out.println("Withdraw 47.62: "+acount.withdaw(47.62));
        System.out.println("Withdraw 400.00: "+acount.withdaw(400.00));
        System.out.println("Customer["+customer.getLastName()+","+customer.getFirstName()+"] has a balance of"+acount.getBalance());
    }
}
