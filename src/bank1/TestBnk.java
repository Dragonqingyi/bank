package bank1;

/**
 * Created by 时光与你 on 2017/5/3.
 */
public class TestBnk {
    public static void main(String[]args) {
        Customer customer;
        Acount acount;
        System.out.println("Creat the Customer Jane Smith.");
        customer = new Customer("Jane"," Smith");
        System.out.println("Cerat  her account with a 500.00 balance");
        customer.setAcount(new Acount(500.00));
        System.out.println("Withdaw 150.00");
        customer.getAcount().withdaw(150.00);
        System.out.println("Deposit 22.50");
        customer.getAcount().deposit(22.50);
        System.out.println("Withdaw 47.62");
        customer.getAcount().withdaw(47.62);
        System.out.println("Customer["+customer.getLastName()+
                "."+customer.getFirstName()+"] has a balance of "
                +customer.getAcount().getBalance());

    }
}
