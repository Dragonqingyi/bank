package bank2;

/**
 * Created by 时光与你 on 2017/5/4.
 */
/*
银行类，银行有很多客户
 */
public class Bank {
    private Customer [] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[50];//实例化bank时就实例化长度为5的数组
    }
    /*
    往数组里加数据，数组保存客户信息
    f firstname
    l lastanme
     */
    public void addCustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    /*
    获取客户数量
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /*
    根据索引获取数组元素--根据标号获取客户
     */
    public Customer getCustomers(int index) {
        return customers[index];
    }
}
