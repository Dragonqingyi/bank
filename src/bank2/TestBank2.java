package bank2;

/**
 * Created by 时光与你 on 2017/5/4.
 */
public class TestBank2 {
    public static void main(String[]args) {
        Customer customer;
        Acount acount;
        System.out.println("Creat the customer Jane Smith");
        customer = new Customer("Jane","Smith");
        customer.setAcount(new Acount(500.00));
        acount = customer.getAcount();
        System.out.println("Creat her accoun with a 500.00 balance.");
        System.out.println("Withdw 150.00:　"+acount.withdaw(150.00));
        System.out.println("Deposit 22.50: "+acount.deposit(22.50));
        System.out.println("Withdaw 47.62: "+acount.withdaw(47.62));
        System.out.println("Withdaw 400.00: "+acount.withdaw(323.00));

        System.out.println("Customer["+customer.getLastName()+", "
                +customer.getFirstName()+"] has a balance of "+acount.getBalance());

    }
}
