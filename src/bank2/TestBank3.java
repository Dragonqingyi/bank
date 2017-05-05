package bank2;

/**
 * Created by 时光与你 on 2017/5/4.
 */
public class TestBank3 {
    public static void main(String[]args){
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");
        bank.addCustomer("Owen","Bryant");
        bank.addCustomer("Tim","Sorry");
        bank.addCustomer("Maria","Jim");
        for (int i = 0;i < bank.getNumberOfCustomer();i++){
            Customer customer = bank.getCustomers(i);
            System.out.println("Customer["+(i+1)+"] is "+customer.getLastName()+", "+customer.getFirstName());
        }
    }
}
